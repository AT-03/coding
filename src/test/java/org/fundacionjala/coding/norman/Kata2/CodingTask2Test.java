package org.fundacionjala.coding.norman.Kata2;

//import org.junit.jupiter.api.Test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
// import org.junit.jupiter.api.Test;


/**
 * Created by Administrator on 3/20/2017.
 */

public class CodingTask2Test {


    /**
     * Test when testValidateReverse2Words.
     */
    @Test
    public void testValidateReverse2Words() {
        // given:
        final String stringReverse = "Hey fellow warriors";

        // when:
        final String actualResult = CodingTask2.functionReverse(stringReverse);

        // then:
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when testValidateNoReverse.
     */
    @Test
    public void testValidateNoReverse() {
        // given:
        final String stringReverse = "This is a test";

        // when:
        final String actualResult = CodingTask2.functionReverse(stringReverse);

        // then:
        assertEquals(stringReverse, actualResult);
    }

    /**
     * Test when testValidateReverse1WordInMidle.
     */
    @Test
    public void testValidateReverse1WordInMidle() {
        // given:
        final String stringReverse = "This is another test";

        // when:
        final String actualResult = CodingTask2.functionReverse(stringReverse);

        // then:
        final String expectedResult = "This is rehtona test";
        assertEquals(expectedResult, actualResult);
    }


    //spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
    //spinWords( "This is a test") => returns "This is a test"
    //spinWords( "This is another test" )=> returns "This is rehtona test"

}
