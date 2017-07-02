package org.fundacionjala.coding.pablo.Evaporator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 6/28/2017.
 */

public class EvaporatorKataTest {

    /**
     * Test evaporator one.
     */
    @Test
    public void testEvaporatorOne() {
        final double content = 10;

        final double everPerDay = 10;

        final double threshold = 10;

        final int expectedResult = 22;

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test evaporator two.
     */
    @Test
    public void testEvaporatorTwo() {
        final double content = 10;

        final double everPerDay = 10;

        final double threshold = 5;

        final int expectedResult = 29;

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test evaporator three.
     */
    @Test
    public void testEvaporatorThree() {
        final double content = 100;

        final double everPerDay = 5;

        final double threshold = 5;

        final int expectedResult = 59;

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test evaporator four.
     */
    @Test
    public void testEvaporatorFour() {
        final double content = 50;

        final double everPerDay = 12;

        final double threshold = 1;

        final int expectedResult = 37;

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test evaporator five.
     */
    @Test
    public void testEvaporatorFive() {
        final double content = 47.5;

        final double everPerDay = 8;

        final double threshold = 8;

        final int expectedResult = 31;

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test evaporator six.
     */
    @Test
    public void testEvaporatorSix() {
        final double content = 100;

        final double everPerDay = 1;

        final double threshold = 1;

        final int expectedResult = 459;

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test evaporator seven.
     */
    @Test
    public void testEvaporatorSeven() {
        final double content = 100;

        final double everPerDay = 1;

        final double threshold = 1;

        final int expectedResult = 459;

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test evaporator eight.
     */
    @Test
    public void testEvaporatorEight() {
        final double content = 100;

        final double everPerDay = 1;

        final double threshold = 5;

        final int expectedResult = 299;

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test evaporator is 0.
     */
    @Test
    public void testEvaporator0s0() {
        final double content = 0;

        final double everPerDay = 0;

        final double threshold = 0;

        final int expectedResult = 0;

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        assertEquals(expectedResult, actualResult);
    }
}
