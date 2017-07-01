package org.fundacionjala.coding.pablo.Movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 7/1/2017.
 */
public class CustomerTest {

    /**
     * Test when the customer name is given.
     */
    @Test
    public void whenTheCustomerNameIsGiven() {

        // given:
        final Customer customer = new Customer("Pablo");

        // when:
        final String expectedResult = "Pablo";

        // then:
        final String actualResult = customer.getName();

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when rented day is less to children.
     */
    @Test
    public void whenTheRentedDayIsLessToChildren() {

        int daysRented = 2;

        // given:
        final Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Children("The Revenant"), daysRented));

        // when:
        final double actualResult = customer.calculateTotalAmount();

        // then:
        final double expectedResult = 1.5;

        assertEquals(expectedResult, actualResult, 0);
    }
}
