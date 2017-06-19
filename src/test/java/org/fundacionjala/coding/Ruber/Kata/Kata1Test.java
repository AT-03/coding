package org.fundacionjala.coding.Ruber.Kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ruber Cuellar on 6/19/2017.
 */
public class Kata1Test {
    public static final int TEST1 = 23;
    public static final int TEST2 = 78;
    public static final int TEST3 = 9168;
    public static final int RESULT1 = 10;
    public static final int RESULT2 = 20;
    public static final int RESULT3 = 200;


    /**
     * Test.
     */
    @Test
    public void test() {
        assertEquals(TEST1, Kata1.solution(RESULT1));
        assertEquals(TEST2, Kata1.solution(RESULT2));
        assertEquals(TEST3, Kata1.solution(RESULT3));
    }
}
