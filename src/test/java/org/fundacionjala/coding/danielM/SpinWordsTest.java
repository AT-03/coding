package org.fundacionjala.coding.danielM;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/1/2017.
 */
public class SpinWordsTest {
    /**
     * Test when sentence has words with more than 5 characters.
     */
    @Test
    //test + method_to_test + scenario
    public void testSpinWordsWhenSentenceHasWordsWithMoreThanFiveCharacters() {
        // given: (preconditions)
        final String message = "Hey fellow warriors";

        // when: (method_to_test)
        final String actualResult = SpinWords.spinWords(message);

        // then: (what you expect)
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence doesn't have words with more than 5 characters.
     */
    @Test
    public void testSpinWordsWhenSentenceDoesNotHaveWordsWithMoreThanFiveCharacters() {
        final String message = "This is a test";

        final String actualResult = SpinWords.spinWords(message);

        final String expectedResult = "This is a test";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence has words with 5 characters.
     */
    @Test
    public void testSpinWordsWhenSentenceHasWordsWithFiveCharacters() {
        final String message = "This is a table";

        final String actualResult = SpinWords.spinWords(message);

        final String expectedResult = "This is a elbat";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence has one just word.
     */
    @Test
    public void testSpinWordsWhenSentenceHasOneWord() {
        final String message = "Welcome";

        final String actualResult = SpinWords.spinWords(message);

        final String expectedResult = "emocleW";

        assertEquals(expectedResult, actualResult);
    }
}
