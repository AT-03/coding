package org.fundacionjala.coding.pablo.FinalKata;

import org.fundacionjala.coding.pablo.MultiplesThreeAndFive.Multiples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 6/19/2017.
 */
public class MultiplesTest {


    /**
     * Unit Test about multiples of 3 and 5.
     */
    @Test
    public void test() {
        final int expectedResultOne = 23;
        final int expectedResultTwo = 78;
        final int expectedResultThree = 9168;

        final int expectedVariableOne = 10;
        final int expectedVariableTwo = 20;
        final int expectedVariableThree = 200;

        assertEquals(expectedResultOne, Multiples.solution(expectedVariableOne));
        assertEquals(expectedResultTwo, Multiples.solution(expectedVariableTwo));
        assertEquals(expectedResultThree, Multiples.solution(expectedVariableThree));
    }
}
