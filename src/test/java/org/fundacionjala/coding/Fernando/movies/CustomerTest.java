package org.fundacionjala.coding.Fernando.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 25/06/2017.
 */
public class CustomerTest {

    /**
     * testSpinWordsWhenCustomeIsTest.
     */
    @Test
    public void testSpinWordsWhenCustomeIsTest() {

        Customer customer = new Customer("David");
        // given:
        customer.addRental(new Rental(new Children("The Revenant"), 2));

        // when:
        final String actualResult = customer.getName();

        // then:
        final String expectedResult = "David";
        assertEquals(expectedResult, actualResult);
    }

}
