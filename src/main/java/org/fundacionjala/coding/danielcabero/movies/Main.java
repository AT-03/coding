package org.fundacionjala.coding.danielcabero.movies;

/**
 * Created by administrator on 3/10/2017.
 */
public final class Main {

    /**
     * Constructor private.
     */
    private Main() {

    }

    /**
     * Shows in console the customer's renter points.
     *
     * @param args String.
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Children("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        System.out.println(customer.generateDetail());
    }
}
