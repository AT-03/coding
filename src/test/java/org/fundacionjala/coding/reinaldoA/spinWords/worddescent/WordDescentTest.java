package org.fundacionjala.coding.reinaldoA.spinWords.worddescent;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 5/29/2017.
 */
public class WordDescentTest {
    @Test
    public void testchangeWord() {
        // given:
        final String sentence = "wait for me";

        // when:
        final String actualResult = WordDescent.getWordDescenden(sentence);

        // then:
        final String expectedResult = "wiat for me";
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testchangeWordTwo() {
       // "sort the inner content in descending order" -> "srot the inner ctonnet in dsnnieedcg oredr"
        // given:
        final String sentence = "sort the inner content in descending order";

        // when:
        final String actualResult = WordDescent.getWordDescenden(sentence);

        // then:
        final String expectedResult = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testchangeWordThree() {
        // "this kata is easy" -> "tihs ktaa is esay"
        // given:
        final String sentence = "this kata is easy";

        // when:
        final String actualResult = WordDescent.getWordDescenden(sentence);

        // then:
        final String expectedResult = "tihs ktaa is esay";
        assertEquals(expectedResult, actualResult);
    }
}