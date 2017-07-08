package org.fundacionjala.coding.Fernando.evaporator;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by PC on 28/06/2017.
 */
public class EvaporatorTest {

    /**
     * Test one.
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, Evaporator.evaporator(10, 10, 10));
    }

    /**
     * Test two.
     */
    @Test
    public void testEvaporatorTwo() {
        assertEquals(29, Evaporator.evaporator(10, 10, 5));
    }

    /**
     * Test three.
     */
    @Test
    public void testEvaporatorThree() {
        assertEquals(59, Evaporator.evaporator(100, 5, 5));
    }

    /**
     * Test four.
     */
    @Test
    public void testEvaporatorFour() {
        assertEquals(37, Evaporator.evaporator(50, 12, 1));
    }

    /**
     * Test five.
     */
    @Test
    public void testEvaporatorFive() {
        assertEquals(31, Evaporator.evaporator(47.5, 8, 8));
    }

    /**
     * Test six.
     */
    @Test
    public void testEvaporatorSix() {
        assertEquals(459, Evaporator.evaporator(100, 1, 1));
    }

    /**
     * Test seven.
     */
    @Test
    public void testEvaporatorSeven() {
        assertEquals(459, Evaporator.evaporator(10, 1, 1));
    }

    /**
     * Test eight.
     */
    @Test
    public void testEvaporatorEight() {
        assertEquals(299, Evaporator.evaporator(100, 1, 5));
    }

    /**
     * Test constructor.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = Evaporator.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}


