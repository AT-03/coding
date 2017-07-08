package org.fundacionjala.coding.danielmontecinos.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test Regular class.
 */
public class RegularTest {

    private Movie regularInstance;

    /**
     * Method to create a Regular instance.
     */
    @Before
    public void setUp() {
        regularInstance = new Regular("Test");
    }

    /**
     * Test to verify the amount if the rented days
     * for a Regular movie is less than 2 e.g. 1
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {
        final double actualResult = regularInstance.calculateAmount(1);

        final double expectedResult = 2;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the amount if the rented days
     * for a Regular movie is greater than 2 e.g. 10
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsGreaterThanThree() {
        final double actualResult = regularInstance.calculateAmount(10);

        final double expectedResult = 14;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the frequent renter points for a Regular movie
     * is 1 for different rented days.
     */
    @Test
    public void testCalculateFrequentRenterPointsVerifyTheResultIsOne() {
        final int actualResultOne = regularInstance.calculateFrequentRenterPoints(1);

        final int expectedResultOne = 1;
        assertEquals(expectedResultOne, actualResultOne);

        final int actualResultTwo = regularInstance.calculateFrequentRenterPoints(3);

        final int expectedResultTwo = 1;
        assertEquals(expectedResultTwo, actualResultTwo);

        final int actualResultThree = regularInstance.calculateFrequentRenterPoints(1000);

        final int expectedResultThree = 1;
        assertEquals(actualResultThree, expectedResultThree);
    }
}
