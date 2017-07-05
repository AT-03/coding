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

}
