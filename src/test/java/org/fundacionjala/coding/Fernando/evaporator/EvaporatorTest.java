package org.fundacionjala.coding.Fernando.evaporator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 28/06/2017.
 */
public class EvaporatorTest {

    /**
     * Test evaporator one.
     */
    @Test
    public void testEvaporatorOne() {

        final int expectedResult = 22;
        final double actualResult = 10;

        assertEquals(expectedResult,
                Evaporator.evaporator(actualResult, actualResult, actualResult));
    }

    /**
     * Test evaporator two.
     */
    @Test
    public void testEvaporatorTwo() {
        final int expectedResult = 29;
        final double actualResultOne = 10;
        final double actualResultTwo = 5;

        assertEquals(expectedResult,
                Evaporator.evaporator(actualResultOne, actualResultOne, actualResultTwo));
    }

    /**
     * Test evaporator three.
     */
    @Test
    public void testEvaporatorThree() {

        final int expectedResult = 59;
        final double actualResultOne = 100;
        final double actualResultTwo = 5;

        assertEquals(expectedResult,
                Evaporator.evaporator(actualResultOne, actualResultTwo, actualResultTwo));
    }

    /**
     * Test evaporator four.
     */
    @Test
    public void testEvaporatorFour() {

        final int expectedResult = 37;
        final double actualResultOne = 50;
        final double actualResultTwo = 12;
        final double actualResultThre = 1;

        assertEquals(expectedResult,
                Evaporator.evaporator(actualResultOne, actualResultTwo, actualResultThre));
    }

    /**
     * Test evaporator five.
     */
    @Test
    public void testEvaporatorFive() {

        final int expectedResult = 31;
        final double actualResultOne = 4;
        final double actualResultTwo = 8;
        final double actualResultThre = 8;

        assertEquals(expectedResult,
                Evaporator.evaporator(actualResultOne, actualResultTwo, actualResultThre));
    }

    /**
     * Test evaporator six.
     */
    @Test
    public void testEvaporatorSix() {

        final int expectedResult = 459;
        final double actualResultOne = 100;
        final double actualResultTwo = 1;
        final double actualResultThre = 1;

        assertEquals(expectedResult,
                Evaporator.evaporator(actualResultOne, actualResultTwo, actualResultThre));
    }

    /**
     * Test evaporator seven.
     */
    @Test
    public void testEvaporatorSeven() {

        final int expectedResult = 459;
        final double actualResultOne = 10;
        final double actualResultTwo = 1;
        final double actualResultThre = 1;

        assertEquals(expectedResult,
                Evaporator.evaporator(actualResultOne, actualResultTwo, actualResultThre));
    }

    /**
     * Test evaporator eight.
     */
    @Test
    public void testEvaporatorEight() {

        final int expectedResult = 299;
        final double actualResultOne = 100;
        final double actualResultTwo = 1;
        final double actualResultThre = 5;

        assertEquals(expectedResult,
                Evaporator.evaporator(actualResultOne, actualResultTwo, actualResultThre));
    }

}


