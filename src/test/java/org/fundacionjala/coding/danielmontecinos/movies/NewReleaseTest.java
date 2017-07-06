package org.fundacionjala.coding.danielmontecinos.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class to test NewRelease class.
 */
public class NewReleaseTest {
    private static Movie newReleaseInstance;

    /**
     * Method to create a NewRelease instance.
     */
    @Before
    public void setUp() {
        newReleaseInstance = new NewRelease("Test");
    }


    /**
     * Test to verify the amount if the rented days
     * for a NewRelease movie is less than 3 e.g. 1
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {

        final double actualResult = newReleaseInstance.calculateAmount(1);

        // then
        final double expectedResult = 3;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the amount if the rented days
     * for a NewRelease movie is greater than 3 e.g. 10
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsGreaterThanThree() {
        final double actualResult = newReleaseInstance.calculateAmount(10);

        final double expectedResult = 30;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the frequent renter points for a NewRelease movie
     * is 1 for different rented days.
     */
    @Test
    public void testCalculateFrequentRenterPointsVerifyTheResultIsOne() {
        final int actualResultOne = newReleaseInstance.calculateFrequentRenterPoints(1);

        final int expectedResultOne = 1;
        assertEquals(expectedResultOne, actualResultOne);

        final int actualResultTwo = newReleaseInstance.calculateFrequentRenterPoints(3);

        final int expectedResultTwo = 2;
        assertEquals(expectedResultTwo, actualResultTwo);

        final int actualResultThree = newReleaseInstance.calculateFrequentRenterPoints(1000);

        final int expectedResultThree = 2;
        assertEquals(actualResultThree, expectedResultThree);
    }
}
