package org.fundacionjala.coding.Ruber.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Class Customer.
 */
class Customer {
    private final String name;
    private static Vector rentals = new Vector();
    private static final int REGULAR_AMOUNT = 2;
    private static final double CHILDRENS_AMOUNT = 1.5;
    private static final double NORMAL_FINE = 1.5;
    private static final double RELEASE_FINE = 3;
    private static final int REGULAR_DAYS_RENTED = 2;
    private static final int CHILDRENS_DAYS_RENTED = 3;

    /**
     * Constructor.
     * @param name The customer's name
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * This method add a new rental to the vector.
     * @param arg The rental
     */
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * This method returns the customer's name.
     * @return customer's name
     */
    public String getName() {
        return name;
    }

    /**
     * This method calculates runs the entire vector to calculate.
     * @return String with the result
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = calculateAmount(each);
            frequentRenterPoints += getFrequentRenterPoints(each);
            // add frequent renter points

            //show figures for this rental
            result += "\t"
                    + each.getMovie().getTitle()
                    + "\t"
                    + String.valueOf(thisAmount)
                    + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is "
                + String.valueOf(totalAmount)
                + "\n";
        result += "You earned "
                + String.valueOf(frequentRenterPoints)
                + " frequent renter points";
        return result;
    }

    /**
     * This method calculates the amount for each rental.
     * @param each The rental to be calculated
     * @return A double with the amount
     */
    public double calculateAmount(Rental each) {
        double thisAmount = 0;
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += REGULAR_AMOUNT;
                if (each.getDaysRented() > REGULAR_DAYS_RENTED) {
                    thisAmount += (each.getDaysRented() - REGULAR_DAYS_RENTED) * NORMAL_FINE;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.getDaysRented() * RELEASE_FINE;
                break;
            case Movie.CHILDRENS:
                thisAmount += CHILDRENS_AMOUNT;
                if (each.getDaysRented() > CHILDRENS_DAYS_RENTED) {
                    thisAmount += (each.getDaysRented() - CHILDRENS_DAYS_RENTED) * NORMAL_FINE;
                }
                break;
            default:
                thisAmount += 0;
        }
        return thisAmount;
    }

    /**
     * This method get frequent renter points.
     * @param each The rental to be calculated
     * @return int with the frequent points
     */
    public int getFrequentRenterPoints(Rental each) {
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

}
