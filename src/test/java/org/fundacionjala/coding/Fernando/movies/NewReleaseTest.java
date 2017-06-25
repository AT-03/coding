package org.fundacionjala.coding.Fernando.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 25/06/2017.
 */
public class NewReleaseTest {

    /**
     * Test to verify the amount rent less than three days.
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {
        // given:
        NewRelease release = new NewRelease("Toy Story");

        // when:
        final double actualResult = release.calculateAmount(2);

        // then
        final double expectedResult = 1.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the amount rent more than three days.
     */
    @Test
    public void testToCalculateRentMovieMoreThanThreeDays() {
        // given:
        NewRelease release = new NewRelease("Moana");

        // when:
        final double actualResult = release.calculateAmount(10);

        // then:
        final double expectedResult = 10.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the frequent renter for different days.
     */
    @Test
    public void testToCalculateTheFrequentRentDifferentDays() {
        // given:
        NewRelease release = new NewRelease("Toy Story");

        // when:
        final int actualResult = release.calculateFrequentRenterPoints(1);

        // then:
        final int expectedResult = 1;
        assertEquals(expectedResult, actualResult);

        // given:

        // when:
        final int actualResultTwo = release.calculateFrequentRenterPoints(3);

        // then:
        final int expectedResultTwo = 2;
        assertEquals(expectedResultTwo, actualResultTwo);

    }

}
