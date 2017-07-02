package org.fundacionjala.coding.danielmontecinos.spinwords;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Daniel Montecinos on 3/10/2017.
 */
public class SpinWordsTest {

    /**
     * The method verifies that the Evaporator class has a private constructor.
     * @throws Exception if the constructor is not private.
     */
    @Test
    public void testSpinWordsConstructorIsPrivate() throws Exception {
        Constructor constructor = SpinWords.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

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
