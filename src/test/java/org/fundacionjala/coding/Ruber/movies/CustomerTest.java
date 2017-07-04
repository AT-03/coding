package org.fundacionjala.coding.Ruber.movies;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ruber Cuellar on 6/21/2017.
 */
public class CustomerTest {
    private Customer customer;

    /**
     * Creating customer.
     */
    @Before
    public void createCustomer() {
        customer = new Customer("Ruber");
    }

    /**
     * Test Release and Regular.
     */
    @Test
    public void testReleaseAndRegular() {
        // given
        customer.addRental(new Rental(new Release("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));

        // when
        //final StringBuilder actualResult = customer.getResult();
        final String actualResult = customer.getResult().toString();

        // then
        final String expectedResult = String.format("Rental Record for Ruber%n"
            + "The Revenant\t6.0%n"
            + "Terminator\t2.0%n"
            + "Amount owed is 8.0%n"
            + "You earned 3");
        assertEquals(actualResult, expectedResult);

    }


    /**
     * Test release, regular and childres.
     */
    @Test
    public void testReleaseRegularChildrens() {
        // given
        customer.addRental(new Rental(new Release("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        customer.addRental(new Rental(new Childrens("Cars"), 2));

        // when
        final String actualResult = customer.getResult().toString();

        // then
        final String expectedResult = String.format("Rental Record for Ruber%n"
            + "The Revenant\t6.0%n"
            + "Terminator\t2.0%n"
            + "Cars\t1.5%n"
            + "Amount owed is 9.5%n"
            + "You earned 4");

        assertEquals(actualResult, expectedResult);

    }


    /**
     * Test Release and Regular.
     */
    @Test
    public void testRegular() {
        // given
        customer.addRental(new Rental(new Regular("Terminator"), 2));

        // when
        final String actualResult;
        actualResult = customer.getResult().toString();

        // then
        final String expectedResult = String.format("Rental Record for Ruber%n"
            + "Terminator\t2.0%n"
            + "Amount owed is 2.0%n"
            + "You earned 1");
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Test Release.
     */
    @Test
    public void testRelease() {
        // given
        customer.addRental(new Rental(new Release("Logan"), 2));

        // when
        final String actualResult = customer.getResult().toString();

        // then
        final String expectedResult = String.format("Rental Record for Ruber%n"
            + "Logan\t6.0%n"
            + "Amount owed is 6.0%n"
            + "You earned 2");
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Test Children.
     */
    @Test
    public void testChildrens() {
        // given
        customer.addRental(new Rental(new Childrens("Cars"), 2));

        // when
        final String actualResult = customer.getResult().toString();

        // then
        final String expectedResult = String.format("Rental Record for Ruber%n"
            + "Cars\t1.5%n"
            + "Amount owed is 1.5%n"
            + "You earned 1");
        assertEquals(actualResult, expectedResult);
    }


    /**
     * Removing rentals.
     */
    @After
    public void beforeRemoveRentals() {
        customer.removeRentals();
    }
}
