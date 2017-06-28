package org.fundacionjala.coding.juan.gas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 6/28/2017.
 */
public class EvaporatorTest {
    private Evaporator evaporator = new Evaporator();

    /**
     * test.
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, evaporator.evaporator(10, 10, 10));
    }

    /**
     * test.
     */
    @Test
    public void testEvaporatorTwo() {
        assertEquals(29, evaporator.evaporator(10, 10, 5));
    }

    /**
     * test.
     */
    @Test
    public void testEvaporatorThree() {
        assertEquals(59, evaporator.evaporator(100, 5, 5));
    }

    /**
     * test.
     */
    @Test
    public void testEvaporatorFour() {
        assertEquals(37, evaporator.evaporator(50, 12, 1));
    }

    /**
     * test.
     */
    @Test
    public void testEvaporatorFive() {
        assertEquals(31, evaporator.evaporator(47.5, 8, 8));
    }

    /**
     * test.
     */
    @Test
    public void testEvaporatorSix() {
        assertEquals(459, evaporator.evaporator(100, 1, 1));
    }

    /**
     * test.
     */
    @Test
    public void testEvaporatorSeven() {
        assertEquals(459, evaporator.evaporator(10, 1, 1));
    }

    /**
     * test.
     */
    @Test
    public void testEvaporatorEight() {
        assertEquals(299, evaporator.evaporator(100, 1, 5));
    }

}

