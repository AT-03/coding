package org.fundacionjala.coding.pablo.Movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PABLO on 7/1/2017.
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

    /**
     * Test customer class.
     */
    @Test
    public void testCustomer() {
        // given
        Customer customer = new Customer("Pablo");
        customer.addRental(new Rental(new NewRelease("The Avengers"), 2));
        customer.addRental(new Rental(new Regular("Iron Man"), 1));

        // when
        final String actualResult = customer.generateDetail();

        // then
        final String expectedResult = "Rental Record for Pablo\n"
                + "\tThe Avengers\t\t6.0\tDays Rental 2\n"
                + "\tIron Man\t\t2.0\tDays Rental 1\n"
                + "Amount owed is 8.0\n"
                + "You earned 3 frequent renter points";
        assertEquals(actualResult, expectedResult);
    }
}
