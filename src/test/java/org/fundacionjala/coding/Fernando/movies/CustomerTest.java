package org.fundacionjala.coding.Fernando.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 25/06/2017.
 */
public class CustomerTest {

    private static final int RENT_DAY = 1;
    private static final double PRICE_MINOR = 1.5;

    private Customer customer;

    /**
     * Create customer.
     */
    @Before
    public void createCustomer() {
        customer = new Customer("Fernando");
    }

    /**
     * testSpinWordsWhenCustomeIsTest.
     */
    @Test
    public void testSpinWordsWhenCustomeIsTest() {

        // given:
        customer.addRental(new Rental(new Children("The Revenant"), 2));

        // when:
        final String actualResult = customer.getName();

        // then:
        final String expectedResult = "Fernando";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test Movie When Day Rented Is less For Children.
     */
    @Test
    public void testMovieWhenDayRentedISLessForChildren() {

        // given:
        customer.addRental(new Rental(new Children("The Revenant"), RENT_DAY));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:

        assertEquals(PRICE_MINOR, actualResult, 0);
    }

    /**
     * Test customer class.
     */
    @Test
    public void testCustomer() {
        final double rentalAmountONe = 6.0;
        final double rentalAmountTwo = 2.0;
        final double rentalTotalAmount = 8.0;
        final int earnedFrequentRenter = 3;

        // given
        customer.addRental(new Rental(new NewRelease("Moana"), 2));
        customer.addRental(new Rental(new Regular("Titanic"), 1));

        // when
        final String actualResult = customer.generateDetail();

        // then
        StringBuilder expectedResult = new StringBuilder();
        expectedResult.append(String.format("Rental Record for %s %n", "Fernando"));
        expectedResult.append(String.format("\t %s \t%f %n", "Moana", rentalAmountONe));
        expectedResult.append(String.format("\t %s \t%f %n", "Titanic", rentalAmountTwo));

        expectedResult.append(String.format("Amount owed is %f %n", rentalTotalAmount));
        expectedResult.append(String.format("You earned %d frequent renter points", earnedFrequentRenter));

        assertEquals(expectedResult.toString(), actualResult);
    }
}
