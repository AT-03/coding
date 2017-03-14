package org.fundacionjala.coding.Ruber.movies;

/**
 * Main Class.
 */
public class Main {

    /**
     * Main.
     * @param args new param
     */
    private static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        customer.statement();
    }
}
