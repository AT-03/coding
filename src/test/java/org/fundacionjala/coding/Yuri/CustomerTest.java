package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Movie.Customer;
import org.fundacionjala.coding.Yuri.Movie.NewRelease;
import org.fundacionjala.coding.Yuri.Movie.Regular;
import org.fundacionjala.coding.Yuri.Movie.Rental;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by YVayneR on 3/25/2017.
 */
public class CustomerTest {
    private Customer customer;
    @Before
    public void beforeTestMethod() {
        customer = new Customer("Yuri");
        customer.addRental(new Rental(new NewRelease("The Raw"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
    }
    @Test
    public void TestGetCustomerName(){
        String expectedResult = "Yuri";
        String customerName = "Yuri";
        Assert.assertEquals(expectedResult, customer.getName());
    }

    @Test
    public void TestCalculateTotalAmountForCustomer(){
        double expectedResult = 8;
        double actualResult = customer.calculateTotalAmount();
        Assert.assertEquals(Double.toString(expectedResult),Double.toString(actualResult));
    }

    @Test
    public void TestCalculateTotalFrequentRenterPoints(){
        double expectedResult = 3;
        double actualResult = customer.calculateTotalFrequentRenterPoints();
        Assert.assertEquals(Double.toString(expectedResult), Double.toString(actualResult));
    }

    @Test
    public void TestGenerateDetailForCustomer() {
        String expectedResult = "Rental Record for Yuri\n" +
                "\tThe Raw\t6.0\n" +
                "\tTerminator\t2.0\n" +
                "Amount owed is 8.0\n" +
                "You earned 3 frequent renter points";
        String actualResult = customer.generateDetail();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
