package org.fundacionjala.coding.Fernando.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class Customer of rental movies.
 */
public class Customer {
    private String nameCustomer;
    private List<Rental> rentalsCustomer;

    /**
     * @param nameCustomer String with words.
     *                     Constructor.
     */
    public Customer(final String nameCustomer) {
        this.nameCustomer = nameCustomer;
        rentalsCustomer = new ArrayList<>();
    }

    /**
     * @param rental String with words.
     */
    public void addRental(final Rental rental) {
        rentalsCustomer.add(rental);
    }

    /**
     * @return the nameCustomer string.
     */
    public String getName() {
        return this.nameCustomer;
    }

    /**
     * @return the string.
     */
    public String generateDetail() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Rental Record for %s %n", getName()));
        for (Rental rental : rentalsCustomer) {
            result.append(String.format("\t %s \t", rental.getMovie().getTitle()));
            result.append(String.format("%f %n", rental.calculateAmount()));
        }
        result.append(String.format("Amount owed is %f %n", calculateTotalAmount()));
        result.append(String.format("You earned %d frequent renter points", calculateTotalFrequentRenterPoints()));
        return result.toString();
    }

    /**
     * @return double value.
     */
    public double calculateTotalAmount() {
        return rentalsCustomer.stream()
                .mapToDouble(Rental::calculateAmount)
                .sum();
    }

    /**
     * @return int value.
     */
    public int calculateTotalFrequentRenterPoints() {
        return rentalsCustomer.stream()
                .mapToInt(rental -> rental.calculateFrequentRenterPoint())
                .sum();
    }
}
