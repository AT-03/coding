
package org.fundacionjala.coding.juan.movies;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Juan Pablo
 */
public class CustomerTest {

    private static final double MINORPRICE = 1.5;
    private static final int DAYONE = 1;


    /**
     * Test Movie When NameCustomer Is Word.
     */
    @Test
    public void testingGivenaCustomerName() {

        // given:
        final Customer customer = new Customer("Jorge");

        // when:
        final String actualResult = customer.getName();

        // then:
        final String expectedResult = "Jorge";

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

        assertEquals(MINORPRICE, actualResult, 0);
    }
}
