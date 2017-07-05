package org.fundacionjala.coding.danielcabero.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by administrator on 3/10/2017.
 */
public class NewReleaseTest {

    /**
     * Test to verify the amount if the rented days
     * for a NewRelease movie is less than 3 e.g. 1
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {
        // given:
        NewRelease newReleaseInstance = new NewRelease("Test");

        // when:
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
        // given:
        NewRelease newReleaseInstance = new NewRelease("Test");

        // when:
        final double actualResult = newReleaseInstance.calculateAmount(10);

        // then:
        final double expectedResult = 30;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the frequent renter points for a NewRelease movie
     * is 1 for different rented days.
     */
    @Test
    public void testCalculateFrequentRenterPointsVerifyTheResultIsOne() {
        // given:
        NewRelease newReleaseInstance = new NewRelease("Test");

        // when:
        final int actualResultOne = newReleaseInstance.frequentPointsRenter(1);

        // then:
        final int expectedResultOne = 1;
        assertEquals(expectedResultOne, actualResultOne);

        // given: newReleaseInstance

        // when:
        final int actualResultTwo = newReleaseInstance.frequentPointsRenter(3);

        // then:
        final int expectedResultTwo = 2;
        assertEquals(expectedResultTwo, actualResultTwo);

        // give:

        // when:
        final int actualResultThree = newReleaseInstance.frequentPointsRenter(1000);

        // then:
        final int expectedResultThree = 2;
        assertEquals(actualResultThree, expectedResultThree);
    }

}
