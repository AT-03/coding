package org.fundacionjala.coding.danielcabero.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by administrator on 3/10/2017.
 */

class Customer {
    private String name;
    private List<Rental> rentalsList;

    /**
     * @param name String with words.
     *             Constructor.
     */
    Customer(final String name) {
        this.name = name;
        rentalsList = new ArrayList<>();
    }

    /**
     * @param rental String with words.
     */
    void addRental(final Rental rental) {
        rentalsList.add(rental);
    }

    /**
     * @return the name string.
     */
    private String getName() {
        return this.name;
    }

    /**
     * @return the string.
     */
    String generateDetail() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ").append(getName()).append("\n");
        for (Rental rental : rentalsList) {
            result.append("\t").append(rental.getMovieTitle().getTitleMovie()).append("\t");
            result.append(rental.calculateAmount()).append("\n");
        }
        result.append("Amount owed is ").append(calculateTotalAmount()).append("\n");
        result.append("You earned ").append(totalFrequentPointsRent()).append(" frequent renter points");
        return result.toString();
    }

    /**
     * This method calculates the total amount of the rented movies.
     *
     * @return the total amount.
     */
    private double calculateTotalAmount() {
        return rentalsList.stream()
                .mapToDouble(Rental::calculateAmount)
                .sum();
    }

    /**
     * This method calculates the total frequent points of rented movies.
     *
     * @return total frequent renter points.
     */
    private int totalFrequentPointsRent() {
        return rentalsList.stream()
                .mapToInt(Rental::calculateFrequentRenterPoint)
                .sum();
    }

    /**
     *
     * @return the List of the customer.
     */
    List<Rental> getRentalsList() {
        return rentalsList;
    }
}
