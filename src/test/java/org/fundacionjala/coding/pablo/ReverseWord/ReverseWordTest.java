package org.fundacionjala.coding.pablo.ReverseWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/21/2017.
 */
public class ReverseWordTest {

    /**
     * Test about ReverseWord class.
     */

    @Test
    public void verify() {


        //given
        final String input = "Hi how are you my friend";

        //when
        final String actualResult = ReverseWord.reverseWord(input);

        //then
        final String expectedResult = "Hi how are you my dneirf";
        assertEquals(expectedResult, actualResult);

    }
}
