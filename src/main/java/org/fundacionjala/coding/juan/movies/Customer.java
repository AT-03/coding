package org.fundacionjala.coding.juan.movies;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Juan Pablo
 */
public final class Customer {
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
        String result = String.format("Rental Record for %s%n", getName());


        for (Rental rental : rentalsCustomer) {

            result += String.format("%s  ", rental.getMovie().getTitle());
            result += String.format(rental.calculateAmount() + "%n");
        }
        result += String.format("Amount owed is  %s%n", calculateTotalAmount());
        result += String.format("You earned %s frequent renter points", calculateTotalFrequentRenterPoints());
        return result.toString();
    }

    /**
     * @return the total amount.
     * @ this method will calculate the total amount of the customer.
     */
    public double calculateTotalAmount() {
        return rentalsCustomer.stream()
                .mapToDouble(Rental::calculateAmount)
                .sum();
    }

    /**
     * @return the total points.
     * @ this method will calcule the potins of the customer.
     */
    public int calculateTotalFrequentRenterPoints() {

        return rentalsCustomer.stream()
                .mapToInt(rental -> rental.calculateFrequentRenterPoint())
                .sum();
    }
}
