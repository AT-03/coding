package org.fundacionjala.coding.Ruber.Evaporator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ruber Cuellar on 6/28/2017.
 */

public class EvaporatorTest {
    private static final int INT_22 = 22;
    private static final int INT_29 = 29;
    private static final int INT_59 = 59;
    private static final int INT_37 = 37;
    private static final int INT_31 = 31;
    private static final int INT_459 = 459;
    private static final int INT_299 = 299;
    private static final double DOUBLE_10 = 10;
    private static final double DOUBLE_5 = 5;
    private static final double DOUBLE_50 = 50;
    private static final double DOUBLE_12 = 12;
    private static final double DOUBLE_1 = 1;
    private static final double DOUBLE_47_5 = 47.5;
    private static final double DOUBLE_8 = 8;
    private static final double DOUBLE_100 = 100;
    /**
     * Test.
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(INT_22, Evaporator.evaporator(DOUBLE_10, DOUBLE_10, DOUBLE_10));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorTwo() {
        assertEquals(INT_29, Evaporator.evaporator(DOUBLE_10, DOUBLE_10, DOUBLE_5));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorThree() {
        assertEquals(INT_59, Evaporator.evaporator(DOUBLE_100, DOUBLE_5, DOUBLE_5));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorFour() {
        assertEquals(INT_37, Evaporator.evaporator(DOUBLE_50, DOUBLE_12, DOUBLE_1));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorFive() {
        assertEquals(INT_31, Evaporator.evaporator(DOUBLE_47_5, DOUBLE_8, DOUBLE_8));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorSix() {
        assertEquals(INT_459, Evaporator.evaporator(DOUBLE_100, DOUBLE_1, DOUBLE_1));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorSeven() {
        assertEquals(INT_459, Evaporator.evaporator(DOUBLE_10, DOUBLE_1, DOUBLE_1));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorEight() {
        assertEquals(INT_299, Evaporator.evaporator(DOUBLE_100, DOUBLE_1, DOUBLE_5));
    }

    /**
     * Constructor test.
     * @throws Exception Exception
     */
    @Test
    public void testEvaporator() throws Exception {
        Constructor evaporatorConstructor = Evaporator.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(evaporatorConstructor.getModifiers()));
        evaporatorConstructor.setAccessible(true);
        evaporatorConstructor.newInstance();
    }

}


