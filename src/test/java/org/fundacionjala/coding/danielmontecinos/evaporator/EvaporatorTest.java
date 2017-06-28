package org.fundacionjala.coding.danielmontecinos.evaporator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The class verifies the method implementation.
 */

public class EvaporatorTest {
    /**
     * Test 1.
     */
    @Test
    public void testEvaporatorOne() {

        final double evaporatorContent = 10;
        final int percentageLostPerDay = 10;
        final int threshold = 10;

        final int actualResult = Evaporator.evaporator(evaporatorContent, percentageLostPerDay, threshold);

        final int expectedResult = 22;

        assertEquals(expectedResult, actualResult);
    }


    /**
     * Test 2.
     */
    @Test
    public void testEvaporatorTwo() {

        final double evaporatorContent = 10;

        final int percentageLostPerDay = 10;

        final int threshold = 5;

        final int actualResult = Evaporator.evaporator(evaporatorContent, percentageLostPerDay, threshold);

        final int expectedResult = 29;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void testEvaporatorThree() {

        final double evaporatorContent = 100;

        final int percentageLostPerDay = 5;

        final int threshold = 5;

        final int actualResult = Evaporator.evaporator(evaporatorContent, percentageLostPerDay, threshold);

        final int expectedResult = 59;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 4.
     */
    @Test
    public void testEvaporatorFour() {

        final double evaporatorContent = 50;

        final int percentageLostPerDay = 12;

        final int threshold = 1;

        final int actualResult = Evaporator.evaporator(evaporatorContent, percentageLostPerDay, threshold);

        final int expectedResult = 37;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 5.
     */
    @Test
    public void testEvaporatorFive() {

        final double evaporatorContent = 47.5;

        final int percentageLostPerDay = 8;

        final int threshold = 8;

        final int actualResult = Evaporator.evaporator(evaporatorContent, percentageLostPerDay, threshold);

        final int expectedResult = 31;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 6.
     */
    @Test
    public void testEvaporatorSix() {

        final double evaporatorContent = 100;

        final int percentageLostPerDay = 1;

        final int threshold = 1;

        final int actualResult = Evaporator.evaporator(evaporatorContent, percentageLostPerDay, threshold);

        final int expectedResult = 459;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 7.
     */
    @Test
    public void testEvaporatorSeven() {

        final double evaporatorContent = 10;

        final int percentageLostPerDay = 1;

        final int threshold = 1;

        final int actualResult = Evaporator.evaporator(evaporatorContent, percentageLostPerDay, threshold);

        final int expectedResult = 459;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 8.
     */
    @Test
    public void testEvaporatorEight() {

        final double evaporatorContent = 100;

        final int percentageLostPerDay = 1;

        final int threshold = 5;

        final int actualResult = Evaporator.evaporator(evaporatorContent, percentageLostPerDay, threshold);

        final int expectedResult = 299;

        assertEquals(expectedResult, actualResult);
    }

}
