package org.fundacionjala.coding.norman.kata.spinwords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class SpinWordsTest {
    /**
     * Test when sentence has words with more than 5 characters.
     */
    @Test
    public void testSpinWordsWhenSentenceHasWordsWithMoreThanFiveCharacters() {
        // given:
        final String sentence = "Hey fellow warriors";

        // when:
        final String actualResult = SpinWords.spinWords(sentence);

        // then:
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence doesn't have words with more than 5 characters.
     */
    @Test
    public void testSpinWordsWhenSentenceDoesNotHaveWordsWithMoreThanFiveCharacters() {
        // given:
        final String sentence = "This is a test";

        // when:
        final String actualResult = SpinWords.spinWords(sentence);

        // then:
        final String expectedResult = "This is a test";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence has words with 5 characters.
     */
    @Test
    public void testSpinWordsWhenSentenceHasWordsWithFiveCharacters() {
        // given:
        final String sentence = "This is a table";

        // when:
        final String actualResult = SpinWords.spinWords(sentence);

        // then:
        final String expectedResult = "This is a elbat";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence has one just word.
     */
    @Test
    public void testSpinWordsWhenSentenceHasOneWord() {
        // given:
        final String sentence = "Welcome";

        // when:
        final String actualResult = SpinWords.spinWords(sentence);

        // then:
        final String expectedResult = "emocleW";
        assertEquals(expectedResult, actualResult);
    }


}
