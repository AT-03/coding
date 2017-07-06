package org.fundacionjala.coding.danielmontecinos.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test Children class.
 */
public class ChildrenTest {
    private static Movie childrenInstance;

    /**
     * Method to create a Children instance.
     */
    @Before
    public void setUp() {
        childrenInstance = new Children("Test");
    }

    /**
     * Test to verify the amount if the rented days
     * for a Children movie is less than 3 e.g. 1
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {
        final double actualResult = childrenInstance.calculateAmount(1);

        final double expectedResult = 1.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the amount if the rented days
     * for a Children movie is greater than 3 e.g. 10
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsGreaterThanThree() {
        final double actualResult = childrenInstance.calculateAmount(10);

        final double expectedResult = 10.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the frequent renter points for a Children movie
     * is 1 for different rented days.
     */
    @Test
    public void testCalculateFrequentRenterPointsVerifyTheResultIsOne() {
        final int actualResultOne = childrenInstance.calculateFrequentRenterPoints(1);

        final int expectedResultOne = 1;
        assertEquals(expectedResultOne, actualResultOne);

        final int actualResultTwo = childrenInstance.calculateFrequentRenterPoints(3);

        final int expectedResultTwo = 1;
        assertEquals(expectedResultTwo, actualResultTwo);

        final int actualResultThree = childrenInstance.calculateFrequentRenterPoints(1000);

        final int expectedResultThree = 1;
        assertEquals(actualResultThree, expectedResultThree);
    }
}
