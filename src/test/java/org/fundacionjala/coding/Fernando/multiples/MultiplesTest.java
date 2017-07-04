package org.fundacionjala.coding.Fernando.multiples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 03/07/2017.
 */
public class MultiplesTest {

    private static final int TWENTY_THREE = 23;
    private static final int TEN = 10;
    /**
     * Test multiples.
     */
    @Test
    public void test() {
        assertEquals(TWENTY_THREE, Multiples.solution(TEN));
    }
}
