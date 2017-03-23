package org.fundacionjala.coding.Ruber.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Customer.
 */
public class Customer {
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
     * Retrieves the rentals.
     * @return List<Rental> rental movies
     */
    public List<Rental> getRentals() {
        return rentals;
    }

    /**
     * To print the result.
     * @return StringBuilder containing the result
     */
    public StringBuilder getResult() {
        double totalAmount = 0;
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for " + getName() + "\n");
        for (Rental ren : rentals) {
            result.append(ren.getMovie().getTitle() + "\t"
                    + String.valueOf(ren.getMovie().getAmount(ren.getDaysRented())) + "\n");
        }
        return result.append("Amount owed is " + String.valueOf(calculateAmount(rentals)) + "\n"
                + "You earned " + String.valueOf(calculateFrequentRenterPoints(rentals)));

    }

    /**
     * This method calculates the amount for each rental.
     * @param rentals movies rental
     * @return double total amount
     */
    public double calculateAmount(final List<Rental> rentals) {
        double thisAmount = 0;
        for (Rental ren : rentals) {
            thisAmount += ren.getMovie().getAmount(ren.getDaysRented());
        }
        return thisAmount;
    }

    /**
     * This method retrieves the frequent renter points for rentals.
     * @param rental The rental
     * @return int the points
     */
    public int calculateFrequentRenterPoints(final List<Rental> rental) {
        int frequentRenterPoints = 0;
        // add bonus for a two day new release rental
        for (Rental each : rental) {
            frequentRenterPoints += each.getMovie().getFrequentRenterPoints(each.getDaysRented());
        }
        return frequentRenterPoints;
    }

    /**
     * To remove rentals.
     */
    public void removeRentals() {
        rentals.clear();
    }
}

