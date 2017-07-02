package org.fundacionjala.coding.pablo.Movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 3/23/2017.
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
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ").append(getName()).append("\n");
        for (Rental rental : rentalsCustomer) {
            result.append("\t").append(rental.getMovie().getTitle()).append("\t");
            result.append("\t").append(rental.calculateAmount()).append("\t");
            result.append("Days Rental ").append(rental.getDaysRented()).append("\n");
        }
        result.append("Amount owed is ").append(calculateTotalAmount()).append("\n");
        result.append("You earned ").append(calculateTotalFrequentRenterPoints()).append(" frequent renter points");
        return result.toString();
    }

    /**
     *
     * @return Rental Customer calculate amount
     */

    public double calculateTotalAmount() {
        return rentalsCustomer.stream()
                .mapToDouble(Rental::calculateAmount)
                .sum();
    }

    /**
     *
     * @return Rental customer calculate frequent renter point.
     */

    public int calculateTotalFrequentRenterPoints() {

        return rentalsCustomer.stream()
                .mapToInt(Rental::calculateFrequentRenterPoint)
                .sum();
    }
}
