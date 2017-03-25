package org.fundacionjala.coding.Fernando.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fernando.
 */
public class CustomerTest {
    /**
     * testSpinWordsWhenCustomeIsTest.
     */
    @Test
    public void testSpinWordsWhenCustomeIsTest() {

        Customer customer = new Customer("Carlos");
        // given:
        customer.addRental(new Rental(new Children("The Revenant"), 2));

        // when:
        final String actualResult = customer.getName();

        // then:
        final String expectedResult = "Carlos";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * testChildrenCaluculateAmountOne
     */
    @Test
    public void testChildrenCaluculateAmountOne() {
        // given
        Children c = new Children("Test");

        // when:
        final double actualResult = c.calculateAmount(1);

        // then
        final double expectedResult = 1.5;
        assertEquals(0, expectedResult, actualResult);

    }

    /**
     * testtestChildrenCaluculateAmountTwo
     */
    @Test
    public void testtestChildrenCaluculateAmountTwo() {
        // given:
        Children c = new Children("Test");

        // when:
        final double actualResult = c.calculateAmount(20);

        // then:
        final double expectedResult = 20.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * testtesttestNewReleaseCaluculateAmountOne
     */
    @Test
    public void testtesttestNewReleaseCaluculateAmountOne() {
        // given:
        NewRelease n = new NewRelease("Test");

        // when:
        final double actualResult = n.calculateAmount(1);

        // then
        final double expectedResult = 3;
        assertEquals(0, expectedResult, actualResult);
    }
}
