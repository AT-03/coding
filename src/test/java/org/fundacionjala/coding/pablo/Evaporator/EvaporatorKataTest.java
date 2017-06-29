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

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        final int expectedResult = 22;

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

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        final int expectedResult = 29;

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

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        final int expectedResult = 59;

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

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        final int expectedResult = 37;

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

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        final int expectedResult = 31;

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

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        final int expectedResult = 459;

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

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        final int expectedResult = 459;

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

        final int actualResult = EvaporatorKata.evaporator(content, everPerDay, threshold);

        final int expectedResult = 299;

        assertEquals(expectedResult, actualResult);
    }
}
