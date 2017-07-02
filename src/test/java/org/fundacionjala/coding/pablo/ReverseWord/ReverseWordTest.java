package org.fundacionjala.coding.pablo.ReverseWord;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 3/21/2017.
 */
public class ReverseWordTest {

    /**
     * Test constructor.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = ReverseWord.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test verify if a word have five letters.
     */
    @Test
    public void verifyIfAWordHaveFiveLetters() {


        //given
        final String input = "hello";

        //when
        final String actualResult = ReverseWord.reverseWord(input);

        //then
        final String expectedResult = "olleh";
        assertEquals(expectedResult, actualResult);

    }

    /**
     * Test verify if a word have more than five letters.
     */
    @Test
    public void verifyIfAWordHaveMoreThanFiveLetters() {


        //given
        final String input = "friend";

        //when
        final String actualResult = ReverseWord.reverseWord(input);

        //then
        final String expectedResult = "dneirf";
        assertEquals(expectedResult, actualResult);

    }

    /**
     * Test verify if a word has not five letters.
     */
    @Test
    public void verifyIfAWordHasNotFiveLetters() {


        //given
        final String input = "Hi";

        //when
        final String actualResult = ReverseWord.reverseWord(input);

        //then
        final String expectedResult = "Hi";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test verify a sentence.
     */
    @Test
    public void verifyASentence() {


        //given
        final String input = "Hello they are my friends";

        //when
        final String actualResult = ReverseWord.reverseWord(input);

        //then
        final String expectedResult = "olleH they are my sdneirf";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test verify if is a null.
     */
    @Test
    public void verifyANull() {


        //given
        final String input = null;

        //when
        final String actualResult = ReverseWord.reverseWord(input);

        //then
        final String expectedResult = "";
        assertEquals(expectedResult, actualResult);
    }
}
