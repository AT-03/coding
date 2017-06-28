package org.fundacionjala.coding.juan.highestandlowest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 6/28/2017.
 */
public class HightesAndLowestTest {
    private HightesAndLowest hightesAndLowest = new HightesAndLowest();

    /**
     * Test.
     */
    @Test
    public void someTest() {
        assertEquals(hightesAndLowest.hingAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), "542 -214");
    }

    /**
     * Test.
     */
    @Test
    public void plusMinusTest() {
        assertEquals(hightesAndLowest.hingAndLow("1 -1"), "1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusPlusTest() {
        assertEquals(hightesAndLowest.hingAndLow("1 1"), "1 1");
    }

    /**
     * Test.
     */
    @Test
    public void minusMinusTest() {
        assertEquals(hightesAndLowest.hingAndLow("-1 -1"), "-1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusMinusZeroTest() {
        assertEquals(hightesAndLowest.hingAndLow("1 -1 0"), "1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusPlusZeroTest() {
        assertEquals(hightesAndLowest.hingAndLow("1 1 0"), "1 0");
    }

    /**
     * Test.
     */
    @Test
    public void minusMinusZeroTest() {
        assertEquals(hightesAndLowest.hingAndLow("-1 -1 0"), "0 -1");
    }

    /**
     * Test.
     */
    @Test
    public void singleTest() {
        assertEquals(hightesAndLowest.hingAndLow("42"), "42 42");
    }

}

