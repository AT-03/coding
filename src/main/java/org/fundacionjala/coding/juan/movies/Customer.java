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
     * @ this method will calculate the total amount of the customer.
     * @return  the total amount.
     */
    public double calculateTotalAmount() {
        return rentalsCustomer.stream()
                .mapToDouble(Rental::calculateAmount)
                .sum();
    }
    /**
     * @ this method will calcule the potins of the customer.
     * @return  the total points.
     */
    public int calculateTotalFrequentRenterPoints() {

        return rentalsCustomer.stream()
                .mapToInt(rental -> rental.calculateFrequentRenterPoint())
                .sum();
    }
}
