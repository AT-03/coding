package org.fundacionjala.coding.Fernando.movies;

import java.util.ArrayList;
import java.util.List;
/**
 * This is the class Customer of rental movie.
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
     * @return double value.
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
     * @return int value.
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
