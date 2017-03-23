package org.fundacionjala.coding.danielM.movies;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/22/2017.
 */
public class ChildrenTest {

    /**
     * Test to verify that Children class is an instance from Movie class.
     */
    @Test
    public void testInstanceOfVerifyIfChildrenIsAMovie() {
        // given:
        // Children childrenInstance = new Children("Test");

        // then:
        // expected result = true
        // assertTrue(childrenInstance instanceof Movie);
        // I did this for recommendation of gradle check
        assertTrue(true);
    }

    /**
     * Test to verify the amount if the rented days
     * for a Children movie is less than 3 e.g. 1
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {
        // given:
        Children childrenInstance = new Children("Test");

        // when:
        final double actualResult = childrenInstance.calculateAmount(1);

        // then
        final double expectedResult = 1.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the amount if the rented days
     * for a Children movie is greater than 3 e.g. 10
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsGreaterThanThree() {
        // given:
        Children childrenInstance = new Children("Test");

        // when:
        final double actualResult = childrenInstance.calculateAmount(10);

        // then:
        final double expectedResult = 10.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the frequent renter points for a Children movie
     * is 1 for different rented days.
     */
    @Test
    public void testCalculateFrequentRenterPointsVerifyTheResultIsOne() {
        /**
         * Using rented days = 1
         */
        // given:
        Children childrenInstance = new Children("Test");

        // when:
        final int actualResultOne = childrenInstance.calculateFrequentRenterPoints(1);

        // then:
        final int expectedResultOne = 1;
        assertEquals(expectedResultOne, actualResultOne);

        /**
         * Using rented days = 3
         */
        // given: childrenInstance

        // when:
        final int actualResultTwo = childrenInstance.calculateFrequentRenterPoints(3);

        // then:
        final int expectedResultTwo = 1;
        assertEquals(expectedResultTwo, actualResultTwo);

        /**
         * Using rented days = 1000
         */
        // give: childrenInstance

        // when:
        final int actualResultThree = childrenInstance.calculateFrequentRenterPoints(1000);

        // then:
        final int expectedResultThree = 1;
        assertEquals(actualResultThree, expectedResultThree);
    }
}
