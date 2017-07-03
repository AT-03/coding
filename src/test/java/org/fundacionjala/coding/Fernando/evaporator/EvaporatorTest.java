package org.fundacionjala.coding.Fernando.evaporator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 28/06/2017.
 */
public class EvaporatorTest {

    private static final int EXPECTED_RESULT_ONE = 22;
    private static final int EXPECTED_RESULT_TWO = 29;
    private static final int EXPECTED_RESULT_THREE = 59;
    private static final int EXPECTED_RESULT_FOUR = 37;
    private static final int EXPECTED_RESULT_FIVE = 31;
    private static final int EXPECTED_RESULT_SIX = 459;
    private static final int EXPECTED_RESULT_SEVEN = 299;
    private static final double ACTUAL_RESULT_TEN = 10;
    private static final double ACTUAL_RESULT_FIVE = 5;
    private static final double ACTUAL_RESULT_FIFTY = 50;
    private static final double ACTUAL_RESULT_TWELVE = 12;
    private static final double ACTUAL_RESULT_ONE = 1;
    private static final double ACTUAL_RESULT_FOUR = 47.5;
    private static final double ACTUAL_RESULT_EIGHT = 8;
    private static final double ACTUAL_RESULT_ONEHUNDRED = 100;

    /**
     * Test evaporator one.
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(EXPECTED_RESULT_ONE,
                Evaporator.evaporator(ACTUAL_RESULT_TEN, ACTUAL_RESULT_TEN, ACTUAL_RESULT_TEN));
    }

    /**
     * Test evaporator two.
     */
    @Test
    public void testEvaporatorTwo() {
        assertEquals(EXPECTED_RESULT_TWO,
                Evaporator.evaporator(ACTUAL_RESULT_TEN, ACTUAL_RESULT_TEN, ACTUAL_RESULT_FIVE));
    }

    /**
     * Test evaporator three.
     */
    @Test
    public void testEvaporatorThree() {
        assertEquals(EXPECTED_RESULT_THREE,
                Evaporator.evaporator(ACTUAL_RESULT_ONEHUNDRED, ACTUAL_RESULT_FIVE, ACTUAL_RESULT_FIVE));
    }

    /**
     * Test evaporator four.
     */
    @Test
    public void testEvaporatorFour() {
        assertEquals(EXPECTED_RESULT_FOUR,
                Evaporator.evaporator(ACTUAL_RESULT_FIFTY, ACTUAL_RESULT_TWELVE, ACTUAL_RESULT_ONE));
    }

    /**
     * Test evaporator five.
     */
    @Test
    public void testEvaporatorFive() {
        assertEquals(EXPECTED_RESULT_FIVE,
                Evaporator.evaporator(ACTUAL_RESULT_FOUR, ACTUAL_RESULT_EIGHT, ACTUAL_RESULT_EIGHT));
    }

    /**
     * Test evaporator six.
     */
    @Test
    public void testEvaporatorSix() {
        assertEquals(EXPECTED_RESULT_SIX,
                Evaporator.evaporator(ACTUAL_RESULT_ONEHUNDRED, ACTUAL_RESULT_ONE, ACTUAL_RESULT_ONE));
    }

    /**
     * Test evaporator seven.
     */
    @Test
    public void testEvaporatorSeven() {
        assertEquals(EXPECTED_RESULT_SIX,
                Evaporator.evaporator(ACTUAL_RESULT_TEN, ACTUAL_RESULT_ONE, ACTUAL_RESULT_ONE));
    }

    /**
     * Test evaporator eight.
     */
    @Test
    public void testEvaporatorEight() {
        assertEquals(EXPECTED_RESULT_SEVEN,
                Evaporator.evaporator(ACTUAL_RESULT_ONEHUNDRED, ACTUAL_RESULT_ONE, ACTUAL_RESULT_FIVE));
    }

}


