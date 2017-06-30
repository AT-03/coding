package org.fundacionjala.coding.pablo.Movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/23/2017.
 */
public class ChildrenTest {

    /**
     * Test for calculate rented days less than 3.
     */

    @Test
    public void calculateRentedDaysLessThan3() {

        //given
        Movie children = new Children("TestChildren");

        //when
        final double actualResult = children.calculateAmount(2);

        //then
        final double expectedResult = 1.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test for calculate Rented Days Greater Than 3.
     */

    @Test
    public void calculateRentedDaysGreaterThan3() {

        //given
        Movie children = new Children("TestChildren");

        //when
        final double actualResult = children.calculateAmount(5);

        //then
        final double expectedResult = 4.5;
        assertEquals(0, expectedResult, actualResult);
    }
}
