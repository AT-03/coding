package org.fundacionjala.coding.juan.spinwords;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;


import org.fundacionjala.coding.juan.spinWords.SpinWords;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Juan on 3/10/2017.
 */

public class SpinWordsTest {
    /**
     * Testing when the word has five letters.
     */
    @Test
    public void testspinWordsWhenTheSentenseHasFiveWords() {


        //Given
        final String sentece = "holas";
        //When
        final String actualResult = SpinWords.spinWords(sentece);
        // then
        final String exectedResult = "saloh";
        assertEquals(exectedResult, actualResult);


    }

    /**
     * Testing when the word has more than five letters.
     */
    @Test
    public void testSpinWordsWhenTheSenteseHasMoreThanFiveWords() {

        //Given
        final String sentece = "Paralelepipedo";
        //When
        final String actualResult = SpinWords.spinWords(sentece);
        // then
        final String exectedResult = "odepipelelaraP";
        assertEquals(exectedResult, actualResult);
    }

    /**
     * Testing when the sentese has spaces.
     */
    @Test
    public void testSpinWordsWhenTheSenteseHasSpaces() {

        //Given
        final String sentece = "Wellcome to the jungle";
        final String senteceA = "Esta es una prueba";
        //When
        final String actualResult = SpinWords.spinWords(sentece);
        final String actualResultA = SpinWords.spinWords(senteceA);
        // then
        final String exectedResult = "emoclleW to the elgnuj";
        final String exectedResultA = "Esta es una abeurp";
        assertEquals(exectedResult, actualResult);
        assertEquals(exectedResultA, actualResultA);
    }

    /**
     * Testing empty string.
     */
    @Test
    public void testingAnEmptyString() {
        //given
        final String sentence = null;
        //When
        final String actualResult = SpinWords.spinWords(sentence);
        //Then
        final String expectedResult = "";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Tesing a word with less than Five letters.
     */

    @Test
    public void testAwordWithLessThanFiveLetters() {
        //given
        final String sentence = "hi";
        //When
        final String actualResult = SpinWords.spinWords(sentence);
        //Then
        final String expectedResult = "hi";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test constructor.
     *
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = SpinWords.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}

