package org.fundacionjala.coding.danielmontecinos.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test Rental class.
 */
public class RentalTest {
    /**
     * Test the addRental method.
     */
    @Test
    public void addRentalMethod() {
        // given
        Customer customer = new Customer("Daniel");
        customer.addRental(new Rental(new NewRelease("Project X"), 2));
        customer.addRental(new Rental(new Regular("Eurotrip"), 1));

        // when
        final String actualResult = customer.generateDetail();

        // then
        final String expectedResult = "Rental Record for Daniel\n"
                + "\tProject X\t6.0\n"
                + "\tEurotrip\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3 frequent renter points";

        assertEquals(actualResult, expectedResult);
    }
}
