package org.fundacionjala.coding.norman.kata.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by NORMAN on 2/7/2017.
 */
public class CustomerTest {
    /**
     * aAdd movie to list.
     */
    @Test
    public void addRental() {
        Customer customer = new Customer("pepe");
        Children children = new Children("ddd");
        Rental rental = new Rental(children, 2);

        customer.addRental(rental);

        assertTrue(customer.getRentalCustomer().size() > 0);

    }

    /**
     * Create String of movies rented.
     */

    @Test
    public void generateDetail() {
        Customer customer = new Customer("pepe");
        Children children = new Children("chuqui");
        Rental rental = new Rental(children, 2);

        customer.addRental(rental);
        String espectedResult = customer.generateDetail();
        System.out.println(espectedResult);
        assertEquals("Rental Record for pepe\n" + "\tchuqui\t1.5\n"
                + "Amount owed is 1.5\n" + "You earned 1 frequent renter points", espectedResult);

    }

}
