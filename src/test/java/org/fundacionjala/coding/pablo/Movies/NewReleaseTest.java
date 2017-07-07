package org.fundacionjala.coding.pablo.Movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/23/2017.
 */
public class NewReleaseTest {

    /**
     * Test for calculate rented days less than 3.
     */

    @Test
    public void calculateRentedDaysLessThan3() {

        //given
        Movie newRelease = new NewRelease("TestNewRelease");

        //when
        final double actualResult = newRelease.calculateAmount(2);

        //then
        final double expectedResult = 6.0;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test for calculate Rented Days Greater Than 3.
     */

    @Test
    public void calculateRentedDaysGreaterThan3() {

        //given
        Movie newRelease = new NewRelease("TestNewRelease");

        //when
        final double actualResult = newRelease.calculateAmount(5);

        //then
        final double expectedResult = 15;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test to calculated calculate frequent renter points.
     */
    @Test
    public void calculateFrequentRenterPoints() {
        //given
        Movie children = new Children("TestNewRelease");

        //when
        final double expectedResult = 1;

        //then
        final double actualResult = children.calculateFrequentRenterPoints(2);
        assertEquals(expectedResult, actualResult, 1);
    }
}
