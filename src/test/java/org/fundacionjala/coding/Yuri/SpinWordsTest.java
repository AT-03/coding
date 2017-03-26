package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Katas.SpinWords;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by YVayneR on 3/25/2017.
 */
public class SpinWordsTest {
    /**
     * this test helps to verify that is possible to reverse a word with size higher or equals to five.
     */
    @Test
    public void testWordsWithFiveSize() {
        final String word = "Welcome";
        final String expectedResult = "emocleW";
        SpinWords test = new SpinWords();
        Assert.assertEquals(expectedResult, test.spinWords(word));
    }

    /**
     * this test helps to verify that is possible to reverse words with five or more letters using a sentence.
     */
    @Test
    public void testSentenceWithManyWords() {
        final String word = "Hey fellow warriors";
        final String expectedResult = "Hey wollef sroirraw";
        SpinWords test = new SpinWords();
        Assert.assertEquals(expectedResult, test.spinWords(word));
    }
}
