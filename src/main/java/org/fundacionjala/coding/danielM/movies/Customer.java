package org.fundacionjala.coding.danielM.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Customer class.
 */

public class Customer {
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
        StringBuffer result = new StringBuffer();
        result.append("Rental Record for " + getName() + "\n");
        for (Rental rental : rentalsCustomer) {
            result.append("\t" + rental.getMovie().getTitle() + "\t");
            result.append(rental.calculateAmount() + "\n");
        }
        result.append("Amount owed is " + calculateTotalAmount() + "\n");
        result.append("You earned " + calculateTotalFrequentRenterPoints() + " frequent renter points");
        return result.toString();
    }

    /**
     * This method calculates the total amount of the rented movies.
     *
     * @return the total amount.
     */
    public double calculateTotalAmount() {
//        double totalAmount = 0;
//        for (Rental rental : rentalsCustomer) {
//            totalAmount += rental.calculateAmount();
//        }
//        return totalAmount;
        return rentalsCustomer.stream()
                .mapToDouble(Rental::calculateAmount)
                .sum();
    }

    /**
     * This method calculates the total frequent points of rented movies.
     *
     * @return total frequent renter points.
     */
    public int calculateTotalFrequentRenterPoints() {
//        int totalFrequentRenterPoints = 0;
//        for (Rental rental : rentalsCustomer) {
//            totalFrequentRenterPoints += rental.calculateFrequentRenterPoint();
//        }
//        return totalFrequentRenterPoints;
        return rentalsCustomer.stream()
                .mapToInt(rental -> rental.calculateFrequentRenterPoint())
                .sum();
    }
}
