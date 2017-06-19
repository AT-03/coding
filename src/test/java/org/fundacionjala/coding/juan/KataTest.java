package org.fundacionjala.coding.juan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 6/19/2017.
 */
public class KataTest {
    private Kata kata = new Kata();

    /**
     * Test.
     */
    @Test
    public void someTest() {
        assertEquals(kata.hingAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), "542 -214");
    }

    /**
     * Test.
     */
    @Test
    public void plusMinusTest() {
        assertEquals(kata.hingAndLow("1 -1"), "1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusPlusTest() {
        assertEquals(kata.hingAndLow("1 1"), "1 1");
    }

    /**
     * Test.
     */
    @Test
    public void minusMinusTest() {
        assertEquals(kata.hingAndLow("-1 -1"), "-1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusMinusZeroTest() {
        assertEquals(kata.hingAndLow("1 -1 0"), "1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusPlusZeroTest() {
        assertEquals(kata.hingAndLow("1 1 0"), "1 0");
    }

    /**
     * Test.
     */
    @Test
    public void minusMinusZeroTest() {
        assertEquals(kata.hingAndLow("-1 -1 0"), "0 -1");
    }

    /**
     * Test.
     */
    @Test
    public void singleTest() {
        assertEquals(kata.hingAndLow("42"), "42 42");
    }

    /**
     * KAta.
     */
    @Test
    public void test() {

        assertEquals(23, kata.solution(10));
        assertEquals(78, kata.solution(20));
        assertEquals(9168, kata.solution(200));
    }
}
