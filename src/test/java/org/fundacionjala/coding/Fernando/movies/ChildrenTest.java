package org.fundacionjala.coding.Fernando.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 24/06/2017.
 */
public class ChildrenTest {

    /**
     * Test to verify the amount rent less than three days.
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {
        // given:
        Children childrenInstance = new Children("Toy Story");

        // when:
        final double actualResult = childrenInstance.calculateAmount(2);

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
        Children children = new Children("Moana");

        // when:
        final double actualResult = children.calculateAmount(10);

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
        Children children = new Children("Moana");

        // when:
        final int actualResult = children.calculateFrequentRenterPoints(1);

        // then:
        final int expectedResult = 1;
        assertEquals(expectedResult, actualResult);

        // given:

        // when:
        final int actualResultTwo = children.calculateFrequentRenterPoints(3);

        // then:
        final int expectedResultTwo = 1;
        assertEquals(expectedResultTwo, actualResultTwo);

    }

}
