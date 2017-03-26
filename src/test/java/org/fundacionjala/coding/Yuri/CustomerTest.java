package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Movie.Customer;
import org.fundacionjala.coding.Yuri.Movie.NewRelease;
import org.fundacionjala.coding.Yuri.Movie.Regular;
import org.fundacionjala.coding.Yuri.Movie.Rental;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by YVayneR on 3/25/2017.
 */
public class CustomerTest {
    private Customer customer;

    /**
     * Method to set up the tests.
     */
    @Before
    public void beforeTestMethod() {
        customer = new Customer("Yuri");
        customer.addRental(new Rental(new NewRelease("The Raw"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
    }

    /**
     * This test helps to verify that is possible to get the customer name.
     */
    @Test
    public void testGetCustomerName() {
        final String expectedResult = "Yuri";
        final String customerName = "Yuri";
        Assert.assertEquals(expectedResult, customer.getName());
    }

    /**
     * This method helps to calculate the total amount for a customer movie rent.
     */
    @Test
    public void testCalculateTotalAmountForCustomer() {
        final double expectedResult = 8;
        final double actualResult = customer.calculateTotalAmount();
        Assert.assertEquals(Double.toString(expectedResult), Double.toString(actualResult));
    }

    /**
     * This method helps to verify that is possible to get the total frequent renter points.
     */
    @Test
    public void testCalculateTotalFrequentRenterPoints() {
        final double expectedResult = 3;
        final double actualResult = customer.calculateTotalFrequentRenterPoints();
        Assert.assertEquals(Double.toString(expectedResult), Double.toString(actualResult));
    }

    /**
     * This test helps to verify that is possible to generate a report detailed for a rent.
     */
    @Test
    public void testGenerateDetailForCustomer() {
        final String expectedResult = "Rental Record for Yuri\n"
                + "\tThe Raw\t6.0\n"
                + "\tTerminator\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3 frequent renter points";
        String actualResult = customer.generateDetail();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
