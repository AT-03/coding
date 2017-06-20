package org.fundacionjala.coding.danielmontecinos.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel Montecinos on 3/10/2017.
 */

class Customer {
    private String nameCustomer;
    private List<Rental> rentalsCustomer;

    /**
     * @param nameCustomer String with words.
     *                     Constructor.
     */
    Customer(final String nameCustomer) {
        this.nameCustomer = nameCustomer;
        rentalsCustomer = new ArrayList<>();
    }

    /**
     * @param rental String with words.
     */
    void addRental(final Rental rental) {
        rentalsCustomer.add(rental);
    }

    /**
     * @return the nameCustomer string.
     */
    private String getName() {
        return this.nameCustomer;
    }

    /**
     * @return the string.
     */
    String generateDetail() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ").append(getName()).append("\n");
        for (Rental rental : rentalsCustomer) {
            result.append("\t").append(rental.getMovie().getTitle()).append("\t");
            result.append(rental.calculateAmount()).append("\n");
        }
        result.append("Amount owed is ").append(calculateTotalAmount()).append("\n");
        result.append("You earned ").append(calculateTotalFrequentRenterPoints()).append(" frequent renter points");
        return result.toString();
    }

    /**
     * This method calculates the total amount of the rented movies.
     *
     * @return the total amount.
     */
    private double calculateTotalAmount() {
        return rentalsCustomer.stream()
                .mapToDouble(Rental::calculateAmount)
                .sum();
    }

    /**
     * This method calculates the total frequent points of rented movies.
     *
     * @return total frequent renter points.
     */
    private int calculateTotalFrequentRenterPoints() {
        return rentalsCustomer.stream()
                .mapToInt(Rental::calculateFrequentRenterPoint)
                .sum();
    }
}
