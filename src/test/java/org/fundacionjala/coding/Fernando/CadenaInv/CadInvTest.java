package org.fundacionjala.coding.Fernando.CadenaInv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The test class CadInvTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CadInvTest {
    /**
     * Test when sentence is empty.
     */
    @Test
    public void testWhenSentenceIsEmpty() {
        CadInv cadI = new CadInv();
        // given:
        final String sentence = "";

        // when:
        final String actualResult = cadI.cadenaInv(sentence);

        // then:
        final String expectedResult = "";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence has no words major to five.
     */
    @Test
    public void testWhenSentenceHasNoWordsMajorToFive() {
        CadInv cadI = new CadInv();
        //Hey fellow warriors
        // give:
        final String sentence = "Hi guys how are you";

        // when:
        final String actualResult = cadI.cadenaInv(sentence);

        // then:
        final String expectedResult = "Hi guys how are you";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when sentence has more than one word major that five.
     */
    @Test
    public void testWhenSentenceHasMoreThanOneWordMajorThatFive() {
        CadInv cadI = new CadInv();
        // give:
        final String sentence = "Hey fellow warriors";

        // when:
        final String actualResult = cadI.cadenaInv(sentence);

        // then:
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResult);
    }
}
