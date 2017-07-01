package org.fundacionjala.coding.pablo.HighestAndLowest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 6/19/2017.
 */
public class HighestAndLowestTest {

    /**
     * Verify some test.
     */
    @Test
    public void someTest() {
        final String numbers = "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6";

        final String actualResult = HighestAndLowest.highAndLow(numbers);

        final String expectedResult = "542 -214";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify plus minus test.
     */
    @Test
    public void plusMinusTest() {
        final String numbers = "1 -1";

        final String actualResult = HighestAndLowest.highAndLow(numbers);

        final String expectedResult = "1 -1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify plus plus test.
     */
    @Test
    public void plusPlusTest() {
        final String numbers = "1 1";

        final String actualResult = HighestAndLowest.highAndLow(numbers);

        final String expectedResult = "1 1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify minus minus test.
     */
    @Test
    public void minusMinusTest() {
        final String numbers = "-1 -1";

        final String actualResult = HighestAndLowest.highAndLow(numbers);

        final String expectedResult = "-1 -1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify plus minus zero test.
     */
    @Test
    public void plusMinusZeroTest() {
        final String numbers = "1 -1 0";

        final String actualResult = HighestAndLowest.highAndLow(numbers);

        final String expectedResult = "1 -1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify plus plus zero test.
     */
    @Test
    public void plusPlusZeroTest() {
        final String numbers = "1 1 0";

        final String actualResult = HighestAndLowest.highAndLow(numbers);

        final String expectedResult = "1 0";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify minus minus zero test.
     */
    @Test
    public void minusMinusZeroTest() {
        final String numbers = "-1 -1 0";

        final String actualResult = HighestAndLowest.highAndLow(numbers);

        final String expectedResult = "0 -1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify single test.
     */
    @Test
    public void singleTest() {
        final String numbers = "42";

        final String actualResult = HighestAndLowest.highAndLow(numbers);

        final String expectedResult = "42 42";

        assertEquals(expectedResult, actualResult);
    }
}
