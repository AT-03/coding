package org.fundacionjala.coding.juan.highestandlowest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 6/28/2017.
 */
public class HightestAndLowestTest {


    /**
     * Test.
     */
    @Test
    public void someTest() {
        assertEquals(HightestAndLowest.hingAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), "542 -214");
    }

    /**
     * Test.
     */
    @Test
    public void plusMinusTest() {
        assertEquals(HightestAndLowest.hingAndLow("1 -1"), "1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusPlusTest() {
        assertEquals(HightestAndLowest.hingAndLow("1 1"), "1 1");
    }

    /**
     * Test.
     */
    @Test
    public void minusMinusTest() {
        assertEquals(HightestAndLowest.hingAndLow("-1 -1"), "-1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusMinusZeroTest() {
        assertEquals(HightestAndLowest.hingAndLow("1 -1 0"), "1 -1");
    }

    /**
     * Test.
     */
    @Test
    public void plusPlusZeroTest() {
        assertEquals(HightestAndLowest.hingAndLow("1 1 0"), "1 0");
    }

    /**
     * Test.
     */
    @Test
    public void minusMinusZeroTest() {
        assertEquals(HightestAndLowest.hingAndLow("-1 -1 0"), "0 -1");
    }

    /**
     * Test.
     */
    @Test
    public void singleTest() {
        assertEquals(HightestAndLowest.hingAndLow("42"), "42 42");
    }

    /**
     * Test constructor.
     *
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = HightestAndLowest.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}

