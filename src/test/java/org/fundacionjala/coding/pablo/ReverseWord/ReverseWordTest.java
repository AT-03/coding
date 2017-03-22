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

        final String input = "Hi how are you my friend";

        final String actual = ReverseWord.reverseWord(input);

        final String expected = "Hi how are you my dneirf";
        assertEquals(expected, actual);
    }

}
