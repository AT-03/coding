package org.fundacionjala.coding.Fernando.StringInv;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The test class CadInvTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CadInvTest {

    private StringInv cadI;

    /**
     * SpinWord.
     */
    @Before
    public void spinWord() {
        cadI = new StringInv();
    }

    /**
     * Test when sentence is empty.
     */
    @Test
    public void testWhenSentenceIsEmpty() {

        // given:
        final String sentence = "";

        // when:
        final String actualResult = cadI.stringInv(sentence);

        // then:
        final String expectedResult = "";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence has no words major to five.
     */
    @Test
    public void testWhenSentenceHasNoWordsMajorToFive() {

        // give:
        final String sentence = "Hi guys how are you";

        // when:
        final String actualResult = cadI.stringInv(sentence);

        // then:
        final String expectedResult = "Hi guys how are you";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence has more than one word major that five.
     */
    @Test
    public void testWhenSentenceHasMoreThanOneWordMajorThatFive() {

        // give:
        final String sentence = "Hey fellow warriors";

        // when:
        final String actualResult = cadI.stringInv(sentence);

        // then:
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResult);
    }
}
