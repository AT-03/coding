package org.fundacionjala.coding.danielcabero.movies;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 7/5/2017.
 */
public class CustomerTest {

    /**
     * test 1.
     */
    @Test
    public void testRentalEmpty() {
        //Given
        Customer customer = new Customer("Test");
        // when:
        final List<Rental> actualResult = customer.getRentalsList();

        // then:
        final List<Rental> expectedResult = new ArrayList<Rental>();
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test 2.
     */
    @Test
    public void testRental() {
        // given:
        Customer customer = new Customer("Test");
        // when:
        final String actualResult = customer.generateDetail();
        String expected = "Rental Record for Test\n"
                + "Amount owed is 0.0\n"
                + "You earned 0.0 frequent renter points";
        // then:
        assertEquals(expected, actualResult);
    }

    /**
     * Test Release and Regular.
     */
    @Test
    public void testReleaseAndRegular() {
        // given
        Customer customer = new Customer("test");
        customer.addRental(new Rental(new NewRelease("Scary movie"), 2));
        customer.addRental(new Rental(new Regular("Star wars"), 1));

        // when
        final String actualResult = customer.generateDetail();

        // then
        final String expectedResult = "Rental Record for test\n"
                + "\tScary movie\t\t6.0\tDays Rental 2\n"
                + "\tStar wars\t\t2.0\tDays Rental 1\n"
                + "Amount owed is 8.0\n"
                + "You earned 8.0 frequent renter points";
        assertEquals(actualResult, expectedResult);
    }


}
