package org.fundacionjala.coding.norman.kata.multiples3and5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class Multiply3and5Test {
    /**
     * Test of multiply 3 and 5.
     */
    @Test
    public void test() {
        assertEquals(23, Multiply3and5.solution(10));
        assertEquals(78, Multiply3and5.solution(20));
        assertEquals(9168, Multiply3and5.solution(200));
    }

}
