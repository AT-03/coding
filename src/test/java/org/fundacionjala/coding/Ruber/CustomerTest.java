package org.fundacionjala.coding.Ruber;

import org.fundacionjala.coding.Ruber.movies.Regular;
import org.fundacionjala.coding.Ruber.movies.Childrens;
import org.fundacionjala.coding.Ruber.movies.Release;
import org.fundacionjala.coding.Ruber.movies.Customer;
import org.fundacionjala.coding.Ruber.movies.Rental;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ruber Cuellar on 3/23/2017.
 */
public class CustomerTest {
    /**
     * Test Release and Regular.
     */
    @Test
    public void testReleaseAndRegular() {
        // given
        Customer customer = new Customer("Ruber");
        customer.addRental(new Rental(new Release("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));

        // when
        //final StringBuilder actualResult = customer.getResult();
        final String actualResult = customer.getResult().toString();

        // then
        final String expectedResult = "Rental Record for Ruber\n"
                + "The Revenant\t6.0\n"
                + "Terminator\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3";
        /*final StringBuilder expectedResult =  new StringBuilder();
        expectedResult.append("Rental Record for Ruber\n"
                + "The Revenant\t6.0\n"
                + "Terminator\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3");*/
        assertEquals(actualResult, expectedResult);

        // Clean up
        customer.removeRentals();
    }


    /**
     * Test release, regular and childres.
     */
    @Test
    public void testReleaseRegularChildrens() {
        // given
        Customer customer = new Customer("Ruber");
        customer.addRental(new Rental(new Release("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        customer.addRental(new Rental(new Childrens("Cars"), 2));

        // when
        final String actualResult = customer.getResult().toString();

        // then
        final String expectedResult = "Rental Record for Ruber\n"
                + "The Revenant\t6.0\n"
                + "Terminator\t2.0\n"
                + "Cars\t1.5\n"
                + "Amount owed is 9.5\n"
                + "You earned 4";

        assertEquals(actualResult, expectedResult);

        // Clean up
        customer.removeRentals();

    }


    /**
     * Test Release and Regular.
     */
    @Test
    public void testRegular() {
        // given
        Customer customer = new Customer("Ruber");
        customer.addRental(new Rental(new Regular("Terminator"), 2));

        // when
        final String actualResult;
        actualResult = customer.getResult().toString();

        // then
        final String expectedResult = "Rental Record for Ruber\n"
                + "Terminator\t2.0\n"
                + "Amount owed is 2.0\n"
                + "You earned 1";
        assertEquals(actualResult, expectedResult);

        // Cleanup
        customer.removeRentals();
    }

    /**
     * Test Release.
     */
    @Test
    public void testRelease() {
        // given
        Customer customer = new Customer("Ruber");
        customer.addRental(new Rental(new Release("Logan"), 2));

        // when
        final String actualResult = customer.getResult().toString();

        // then
        final String expectedResult = "Rental Record for Ruber\n"
                + "Logan\t6.0\n"
                + "Amount owed is 6.0\n"
                + "You earned 2";
        assertEquals(actualResult, expectedResult);

        // cleanup
        customer.removeRentals();
    }

    /**
     * Test Children.
     */
    @Test
    public void testChildrens() {
        // given
        Customer customer = new Customer("Ruber");
        customer.addRental(new Rental(new Childrens("Cars"), 2));

        // when
        final String actualResult = customer.getResult().toString();

        // then
        final String expectedResult = "Rental Record for Ruber\n"
                + "Cars\t1.5\n"
                + "Amount owed is 1.5\n"
                + "You earned 1";
        assertEquals(actualResult, expectedResult);

        // cleanup
        customer.removeRentals();
    }
}
