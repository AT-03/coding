package org.fundacionjala.coding.pablo.Evaporator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 6/28/2017.
 */

public class EvaporatorKataTest {

    /**
     * Test one.
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, EvaporatorKata.evaporator(10, 10, 10));
    }

    /**
     * Test two.
     */
    @Test
    public void testEvaporatorTwo() {
        assertEquals(29, EvaporatorKata.evaporator(10, 10, 5));
    }

    /**
     * Test three.
     */
    @Test
    public void testEvaporatorThree() {
        assertEquals(59, EvaporatorKata.evaporator(100, 5, 5));
    }

    /**
     * Test four.
     */
    @Test
    public void testEvaporatorFour() {
        assertEquals(37, EvaporatorKata.evaporator(50, 12, 1));
    }

    /**
     * Test five.
     */
    @Test
    public void testEvaporatorFive() {
        assertEquals(31, EvaporatorKata.evaporator(47.5, 8, 8));
    }

    /**
     * Test six.
     */
    @Test
    public void testEvaporatorSix() {
        assertEquals(459, EvaporatorKata.evaporator(100, 1, 1));
    }

    /**
     * Test seven.
     */
    @Test
    public void testEvaporatorSeven() {
        assertEquals(459, EvaporatorKata.evaporator(10, 1, 1));
    }

    /**
     * Test eight.
     */
    @Test
    public void testEvaporatorEight() {
        assertEquals(299, EvaporatorKata.evaporator(100, 1, 5));
    }

    /**
     * Test constructor.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = EvaporatorKata.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
