package org.fundacionjala.coding.Fernando.multiples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 03/07/2017.
 */
public class MultiplesTest {

    private static final int TWENTY_THREE = 23;
    private static final int TEN = 10;


    /**
     * Unit Test about multiples of 3 and 5.
     *
     * Test one.
     */
    @Test
    public void testOne() {
        final int expectedResult = 23;

        final int actualResult = 10;

        assertEquals(expectedResult, Multiples.solution(actualResult));
    }

    /**
     * Unit Test about multiples of 3 and 5.
     *
     * Test two.
     */
    @Test
    public void testTwo() {
        final int expectedResult = 78;

        final int actualResult = 20;

        assertEquals(expectedResult, Multiples.solution(actualResult));
    }

    /**
     * Unit Test about multiples of 3 and 5.
     *
     * Test three.
     */
    @Test
    public void testThree() {
        final int expectedResult = 9168;

        final int actualResult = 200;

        assertEquals(expectedResult, Multiples.solution(actualResult));
    }

    /**
     * Unit test if is zero.
     */
    @Test
    public void testFour() {
        final int expectedResult = 0;

        final int actualResult = 0;

        assertEquals(expectedResult, Multiples.solution(actualResult));
    }
}
