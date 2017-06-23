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
        int expectedResultOne = 23;
        int expectedResultTwo = 78;
        int expectedResultThree = 9168;

        int expectedVariableOne = 10;
        int expectedVariableTwo = 20;
        int expectedVariableThree = 200;

        assertEquals(expectedResultOne, Multiples.solution(expectedVariableOne));
        assertEquals(expectedResultTwo, Multiples.solution(expectedVariableTwo));
        assertEquals(expectedResultThree, Multiples.solution(expectedVariableThree));
    }
}
