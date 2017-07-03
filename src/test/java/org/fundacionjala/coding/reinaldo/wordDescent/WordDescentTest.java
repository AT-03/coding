package org.fundacionjala.coding.reinaldo.wordDescent;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 6/30/2017.
 */
public class WordDescentTest {

    /**
     * Test when WordDescentTest change Word.
     */
    @Test
    public void testchangeWord() {

        // given:
        final String sentence = "wait for me";

        // when:
        final String actualResult = WordDescent.getWordDescent(sentence);

        // then:
        final String expectedResult = "wiat for me";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when WordDescentTest testchange Word Two.
     */
    @Test
    public void testchangeWordTwo() {

        // given:
        final String sentence = "sort the inner content in descending order";

        // when:
        final String actualResult = WordDescent.getWordDescent(sentence);

        // then:
        final String expectedResult = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when WordDescentTest testchange Word Three.
     */
    @Test
    public void testchangeWordThree() {
        // given:
        final String sentence = "this kata is easy";

        // when:
        final String actualResult = WordDescent.getWordDescent(sentence);

        // then:
        final String expectedResult = "tihs ktaa is esay";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test constructor.
     *
     * @throws Exception construct
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = WordDescent.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
