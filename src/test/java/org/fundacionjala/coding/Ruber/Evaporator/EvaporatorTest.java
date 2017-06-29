package org.fundacionjala.coding.Ruber.Evaporator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ruber Cuellar on 6/28/2017.
 */

public class EvaporatorTest {

    /**
     * Test.
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, Evaporator.evaporator(10, 10, 10));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorTwo() {
        assertEquals(29, Evaporator.evaporator(10, 10, 5));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorThree() {
        assertEquals(59, Evaporator.evaporator(100, 5, 5));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorFour() {
        assertEquals(37, Evaporator.evaporator(50, 12, 1));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorFive() {
        assertEquals(31, Evaporator.evaporator(47.5, 8, 8));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorSix() {
        assertEquals(459, Evaporator.evaporator(100, 1, 1));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorSeven() {
        assertEquals(459, Evaporator.evaporator(10, 1, 1));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorEight() {
        assertEquals(299, Evaporator.evaporator(100, 1, 5));
    }

}


