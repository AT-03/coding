package org.fundacionjala.coding.pablo.reverseWord;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 3/14/2017.
 */
public class reverseWordTest {
    @Test
    public void verify(){
        reverseWord rw = new reverseWord();

        String input = "Hi how are you my friend";
        String expected = "Hi how are you my dneirf";
        assertEquals(expected, rw.reverseWord(input));
    }
}