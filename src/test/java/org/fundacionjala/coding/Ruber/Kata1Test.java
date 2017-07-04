package org.fundacionjala.coding.Ruber;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Ruber Cuellar on 3/6/2017.
 */
public class Kata1Test {

    /**
     * Words with more than 5 characters.
     */
    @Test
    public void testKata1WordsWithMoreThanFiveCharacters() {
        // given
        final String sentence = "Hey fellow warriors";

        // when
        final String actualResult = Kata1.start(sentence);

        // then
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Words without 5 characters.
     */
    @Test
    public void testKata1WordsWhenSentenceDoesNotHaveWordsWithMoreThanFiveCharacters() {
        // given
        final String sentence = "This is a test";

        // when
        final String actualResult = Kata1.start(sentence);

        // then
        final String expectedResult = "This is a test";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Words when sentence has words with five characters.
     */
    @Test
    public void testKata1WordsWhenSentenceHasWordsWithFiveCharacters() {
        // given
        final String sentence = "This is a table";

        // when
        final String actualResult = Kata1.start(sentence);

        // then
        final String expectedResult = "This is a elbat";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Words when sentence has one word with 5 characters.
     */
    @Test
    public void testKata1WordsWhenSentenceHasOneWord() {
        // given
        final String sentence = "Welcome";

        // when
        final String actualResult = Kata1.start(sentence);

        // then
        final String expectedResult = "emocleW";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Constructor test.
     * @throws Exception Exception
     */
    @Test
    public void testConstructor() throws Exception {
        Constructor constructor = Kata1.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
