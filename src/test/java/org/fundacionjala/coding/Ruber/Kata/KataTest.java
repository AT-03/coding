package org.fundacionjala.coding.Ruber.Kata;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ruber Cuellar on 6/19/2017.
 */
public class KataTest {

    /**
     * Test.
     */
    @Test
    public void someTest() {
        Assert.assertEquals(Kata.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), "542 -214");
    }

    /**
     * Test.
     */
    @Test
    public void plusMinusTest() {
        Assert.assertEquals(Kata.highAndLow("1 -1"), "1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusPlusTest() {
        Assert.assertEquals(Kata.highAndLow("1 1"), "1 1");
    }

    /**
     * Test.
     */
    @Test
    public void minusMinusTest() {
        Assert.assertEquals(Kata.highAndLow("-1 -1"), "-1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusMinusZeroTest() {
        Assert.assertEquals(Kata.highAndLow("1 -1 0"), "1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusPlusZeroTest() {
        Assert.assertEquals(Kata.highAndLow("1 1 0"), "1 0");
    }

    /**
     * Test.
     */
    @Test
    public void minusMinusZeroTest() {
        Assert.assertEquals(Kata.highAndLow("-1 -1 0"), "0 -1");
    }

    /**
     * Test.
     */
    @Test
    public void singleTest() {
        Assert.assertEquals(Kata.highAndLow("42"), "42 42");
    }
}
