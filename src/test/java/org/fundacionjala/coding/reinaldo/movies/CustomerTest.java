package org.fundacionjala.coding.reinaldo.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by reinaldo on 11/03/2017.
 */
public class CustomerTest {
    private static final double PRICEMAYOR = 3.5;
    private static final double PRICEMAYORT = 3.0;
    private static final double PRICERRGULER = 2;
    private static final double PRICEMENOR = 1.5;
    private static final int DAYONE = 1;
    private static final int DAYTHREE = 3;
    private static final int DAYFOUR = 4;

    /**
     * Test Movie When NameCustomer Is Word.
     */
    @Test
    public void testMovieWhenNameCustomerIsWord() {

        // given:
        final Customer customer = new Customer("Test");

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
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Children("The Revenant"), DAYONE));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = PRICEMENOR;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Day Rented Is greater For Children.
     */
    @Test
    public void testMovieWhenDayRentedISGreaterForChildren() {

        // given:
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Children("The Revenant"), DAYFOUR));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = PRICEMAYORT;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Day Rented IS one Day Rented For NewRelease.
     */
    @Test
    public void testMovieWhenDayRentedIsOneDayRentedForNewRelease() {

        // given:
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewRelease("The Revenant"), DAYONE));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = PRICEMAYORT;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Day Rented Is Less For Regular.
     */

    @Test
    public void testMovieWhenDayRentedIsLessForRegular() {

        // given:
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Regular("The Revenant"), DAYONE));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = PRICERRGULER;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Day Rented Is Greater For Regular.
     */

    @Test
    public void testMovieWhenDayRentedIsGreaterForRegular() {

        // given:
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Regular("The Revenant"), DAYTHREE));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = PRICEMAYOR;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * test Movie When Result Report Detail.
     */

    @Test
    public void testMovieWhenResultReportDetail() {

        // given:
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Regular("The Revenant"), DAYTHREE));

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

