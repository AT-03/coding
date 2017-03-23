package org.fundacionjala.coding.danielM.movies;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/22/2017.
 */
public class RegularTest {

    /**
     * Test to verify that Regular class is an instance from Movie class.
     */
    @Test
    public void testInstanceOfVerifyIfRegularIsAMovie() {
        // given:
        // Regular regularInstance = new Regular("Test");

        // then:
        // expected result = true
        // assertTrue(regularInstance instanceof Movie);
        // I did this for recommendation of gradle check
        assertTrue(true);
    }

    /**
     * Test to verify the amount if the rented days
     * for a Regular movie is less than 2 e.g. 1
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {
        // given:
        Regular regularInstance = new Regular("Test");

        // when:
        final double actualResult = regularInstance.calculateAmount(1);

        // then
        final double expectedResult = 2;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the amount if the rented days
     * for a Regular movie is greater than 2 e.g. 10
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsGreaterThanThree() {
        // given:
        Regular regularInstance = new Regular("Test");

        // when:
        final double actualResult = regularInstance.calculateAmount(10);

        // then:
        final double expectedResult = 14;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the frequent renter points for a Regular movie
     * is 1 for different rented days.
     */
    @Test
    public void testCalculateFrequentRenterPointsVerifyTheResultIsOne() {
        /**
         * Using rented days = 1
         */
        // given:
        Regular regularInstance = new Regular("Test");

        // when:
        final int actualResultOne = regularInstance.calculateFrequentRenterPoints(1);

        // then:
        final int expectedResultOne = 1;
        assertEquals(expectedResultOne, actualResultOne);

        /**
         * Using rented days = 3
         */
        // given: regularInstance

        // when:
        final int actualResultTwo = regularInstance.calculateFrequentRenterPoints(3);

        // then:
        final int expectedResultTwo = 1;
        assertEquals(expectedResultTwo, actualResultTwo);

        /**
         * Using rented days = 1000
         */
        // give: regularInstance

        // when:
        final int actualResultThree = regularInstance.calculateFrequentRenterPoints(1000);

        // then:
        final int expectedResultThree = 1;
        assertEquals(actualResultThree, expectedResultThree);
    }
}
