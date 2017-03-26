package org.fundacionjala.coding.juan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/10/2017.
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


}

