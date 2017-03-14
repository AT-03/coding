package org.fundacionjala.coding.Ruber.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Customer.
 */
class Customer {
    private final String name;
    private static List<Rental> rentals = new ArrayList<Rental>();
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
    public Customer(final String name) {
        this.name = name;
    }

    /**
     * This method add a new rental to the vector.
     * @param arg The rental
     */
    public void addRental(final Rental arg) {
        rentals.add(arg);
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
     */
    public void statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        //Enumeration rentals = this.rentals.toArray();
        for (Rental each : rentals) {
            double thisAmount = calculateAmount(each);
            frequentRenterPoints += getFrequentRenterPoints(each);
            //result += getResult(result, each, thisAmount);
            totalAmount += thisAmount;
        }
        getResult(rentals, totalAmount, frequentRenterPoints);
    }

    /**
     * To print the result.
     * @param rentals The rentals list
     * @param totalAmount Total amount for the rentals
     * @param frequentRenterPoints Total frequent renter points for the rentals
     */
    public void getResult(final List<Rental> rentals, final double totalAmount, final int frequentRenterPoints) {
        System.out.print("Rental Record for " + getName() + "\n");
        for (Rental ren : rentals) {
            System.out.print(ren.getMovie().getTitle() + "\t" + String.valueOf(calculateAmount(ren) + "\n"));
        }
        System.out.print("Amount owed is " + String.valueOf(totalAmount) + "\n"
                + "You earned " + String.valueOf(frequentRenterPoints));
    }

    /**
     * This method calculates the amount for each rental.
     * @param each The rental to be calculated
     * @return A double with the amount
     */
    public double calculateAmount(final Rental each) {
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
    public int getFrequentRenterPoints(final Rental each) {
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

}
