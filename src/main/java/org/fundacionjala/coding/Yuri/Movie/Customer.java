package org.fundacionjala.coding.Yuri.Movie;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private static final double CONSTANT_DAY_RENTED = 1.5;
    private static final double CONSTANT_REGULAR_MOVIE = 2;
    private static final double CONSTANT_CHILDREN_MOVIE = 3;
    private static final double DAY_RENTED_NEW_RELEASE = 3;
    private static final double CONSTANT_NEW_RELEASE = 0.0;
    private String name;
    private Vector rentals = new Vector();

    /**
     * this is the constructor method.
     * @param name the name of the customer.
     */
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = this.rentals.size();
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental rental = (Rental) rentals.nextElement();
            //determine amounts for each line
            switch (rental.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += CONSTANT_REGULAR_MOVIE;
                    if (rental.getDaysRented() > CONSTANT_REGULAR_MOVIE)
                        thisAmount += getPartialAmount(rental,CONSTANT_REGULAR_MOVIE, CONSTANT_DAY_RENTED);
                        break;
                case Movie.NEW_RELEASE:
                    thisAmount += getPartialAmount(rental, CONSTANT_NEW_RELEASE, DAY_RENTED_NEW_RELEASE);
                    break;
                case Movie.CHILDREN:
                    thisAmount += CONSTANT_DAY_RENTED;
                    if (rental.getDaysRented() > CONSTANT_CHILDREN_MOVIE)
                       thisAmount += getPartialAmount(rental,CONSTANT_CHILDREN_MOVIE, CONSTANT_DAY_RENTED);
                    break;
            }
            // add frequent renter points
           // frequentRenterPoints++;
            // add bonus for a two day new release rental
         //   if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
            frequentRenterPoints += getRenterPoints(rental);
            //show figures for this rental
            result += generateReport("\t" + rental.getMovie().getTitle() + "\t",String.valueOf(thisAmount) + "\n");
            totalAmount += thisAmount;
        }
        //add footer lines
        result += generateReport("Amount owed is ",String.valueOf(totalAmount) +
                "\n");
        //result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += generateReport("You earned " ,String.valueOf(frequentRenterPoints) + " frequent renter points");
        //result += "You earned " + String.valueOf(frequentRenterPoints)+" frequent renter points";
        return result;
    }

    public double getPartialAmount(Rental rental, double constantMovie, double dayRented) {
        return (rental.getDaysRented() - constantMovie) * dayRented;
    }

    public int getRenterPoints(Rental rental) {
        int renterPoints = 0;
        if((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1) {
            renterPoints++;
        }
        return renterPoints;
    }

    public String generateReport(String statement,String value) {
        return statement + value;
    }
}
