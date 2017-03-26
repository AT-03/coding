package org.fundacionjala.coding.Yuri.Movie;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by YVayneR on 3/22/2017.
 */
public class Customer {
    private String name;
    private List<Rental> rentals;

    /**
     * Method constructor for Customer.
     * @param name customer name.
     */
    public Customer(final String name) {
        rentals = new ArrayList<>();
        this.name = name;
    }

    /**
     *  This method helps to add a rental to list.
     * @param rental the rental movie.
     */
    public void addRental(final Rental rental) {
        rentals.add(rental);
    }

    /**
     * This method helps to retrieve the customer name.
     * @return the customer name.
     */
    public String getName() {
        return name;
    }

    /**
     * this method helps to calculate the total amount for a rental.
     * @return the total amount.
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.getMovie().calculateAmount(rental.getDaysRented());
        }
        return totalAmount;
    }

    /**
     * this method helps to calculate the total frequent renter points.
     * @return the total frequent renter points.
     */
    public int calculateTotalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.getMovie().calculateFrequentRenterPoints(rental.getDaysRented());
        }
        return totalFrequentRenterPoints;
    }

    /**
     * this method helps to create a detail of the rental movies for a customer.
     * @return the detail of rental movie.
     */
    public String generateDetail() {
        StringBuilder detail = new StringBuilder();
        detail.append("Rental Record for " + getName() + "\n");
        for (Rental rental : rentals) {
            detail.append("\t" + rental.getMovie().getTitle() + "\t"
                    + rental.getMovie().calculateAmount(rental.getDaysRented()) + "\n");
        }
        detail.append("Amount owed is " + calculateTotalAmount() + "\n");
        detail.append("You earned " + calculateTotalFrequentRenterPoints() + " frequent renter points");
        return detail.toString();
    }

}
