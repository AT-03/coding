package org.fundacionjala.coding.reinaldoA.spinWords.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by reinaldo on 11/03/2017.
 */
public class CustomerTest {
    /**
     * Created testCase first.
     */
    @Test
    public void testSpinWordsWhenCustomeIsTest() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        assertEquals("Test", customer.getName());
    }
}
