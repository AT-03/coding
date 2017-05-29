package org.fundacionjala.coding.reinaldoA.spinWords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by reinaldo on 06/03/2017.
 */


/**
 * Tests for {@link SpinWords}.
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
     * Test when sentence has  one just word rey.
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
