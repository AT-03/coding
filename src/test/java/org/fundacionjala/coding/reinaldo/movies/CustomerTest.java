package org.fundacionjala.coding.reinaldo.movies;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by reinaldo on 11/03/2017.
 */
public class CustomerTest {
    private Customer customer;

    /**
     * This this inicialice.
     */
    @Before
    public void setup() {
        customer = new Customer("Test");
    }

    /**
     * Test Movie When NameCustomer Is Word.
     */
    @Test
    public void testMovieWhenNameCustomerIsWord() {

        // when:
        final String actualResult = customer.getName();

        // then:
        final String expectedResult = "Test";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * test Movie When Day Rented Is less For Children.
     */
    @Test
    public void testMovieWhenDayRentedISLessForChildren() {

        // given:

        customer.addRental(new Rental(new Children("The Revenant"), 1));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = 1.5;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Day Rented Is greater For Children.
     */
    @Test
    public void testMovieWhenDayRentedISGreaterForChildren() {

        customer.addRental(new Rental(new Children("The Revenant"), 4));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = 3.0;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Day Rented IS one Day Rented For NewRelease.
     */
    @Test
    public void testMovieWhenDayRentedIsOneDayRentedForNewRelease() {

        customer.addRental(new Rental(new NewRelease("The Revenant"), 1));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = 3.0;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Day Rented Is Less For Regular.
     */

    @Test
    public void testMovieWhenDayRentedIsLessForRegular() {

        // given:
        customer.addRental(new Rental(new Regular("The Revenant"), 1));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = 2;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Day Rented Is Greater For Regular.
     */

    @Test
    public void testMovieWhenDayRentedIsGreaterForRegular() {

        // given:
        customer.addRental(new Rental(new Regular("The Revenant"), 3));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = 3.5;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Result Report Detail.
     */

    @Test
    public void testMovieWhenResultReportDetail() {

        // given:
        customer.addRental(new Rental(new Regular("The Revenant"), 3));

        // when:
        final String actualResult = customer.generateDetail();

        // then:
        final String expectedResult = "Rental Record for Test\n"
                + "\tThe Revenant\t3.5\n"
                + "Amount owed is 3.5\n"
                + "You earned 1 frequent renter points";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * test Movie When Result Report children.
     */

    @Test
    public void testMovieWhenCalculateFrequentRenterPoints() {
        //given
        Movie movie = new Children("fantacy");
        int resul = movie.calculateFrequentRenterPoints(1);
        assertEquals(1, resul);

    }

}

