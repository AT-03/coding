package org.fundacionjala.coding.pablo.ReverseWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
<<<<<<< HEAD
 * Created by PABLO on 3/21/2017.
=======
 * Created by Administrator on 3/21/2017.
>>>>>>> origin/develop
 */
public class ReverseWordTest {

    /**
     * Test about ReverseWord class.
     */

    @Test
    public void verify() {

<<<<<<< HEAD
        //given
        final String input = "Hi how are you my friend";

        //when
        final String actualResult = ReverseWord.reverseWord(input);

        //then
        final String expectedResult = "Hi how are you my dneirf";
        assertEquals(expectedResult, actualResult);
=======
        final String input = "Hi how are you my friend";

        final String actual = ReverseWord.reverseWord(input);

        final String expected = "Hi how are you my dneirf";
        assertEquals(expected, actual);
>>>>>>> origin/develop
    }

}
