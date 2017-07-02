package org.fundacionjala.coding.danielmontecinos.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test Rental class.
 */
public class RentalTest {
    @Test
    public void testCustomer() {
        // given
        Customer customer = new Customer("Daniel");
        customer.addRental(new Rental(new NewRelease("Project X"), 2));
        customer.addRental(new Rental(new Regular("Eurotrip"), 1));

        // when
        final String actualResult = customer.generateDetail();

        // then
        final String expectedResult = String.format("%s\n\t%s\t%s\n\t%s\t%s\n%s\n%s", "Rental Record for Daniel",
                "Project X", "6.0", "Eurotrip", "2.0", "Amount owed is 8.0",
                "You earned 3 frequent renter points");

        assertEquals(actualResult, expectedResult);
    }
}