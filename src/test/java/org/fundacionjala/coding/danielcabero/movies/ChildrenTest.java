package org.fundacionjala.coding.danielcabero.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by administrator on 3/10/2017.
 */
public class ChildrenTest {
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
        // given:
        Children childrenInstance = new Children("Test");

        // when:
        final int actualResultOne = childrenInstance.frequentPointsRenter(1);

        // then:
        final int expectedResultOne = 1;
        assertEquals(expectedResultOne, actualResultOne);

        // given: childrenInstance

        // when:
        final int actualResultTwo = childrenInstance.frequentPointsRenter(3);

        // then:
        final int expectedResultTwo = 1;
        assertEquals(expectedResultTwo, actualResultTwo);

        // give: childrenInstance

        // when:
        final int actualResultThree = childrenInstance.frequentPointsRenter(1000);

        // then:
        final int expectedResultThree = 1;
        assertEquals(actualResultThree, expectedResultThree);
    }

}
