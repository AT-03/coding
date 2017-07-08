package org.fundacionjala.coding.Fernando.StringInv;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

/**
 * The test class CadInvTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CadInvTest {

    /**
     * Test Constructor.
     * @throws Exception if the constructor is not private.
     */
    @Test
    public void testStringInv() throws Exception {
        Constructor evaporatorConstructor = StringInv.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(evaporatorConstructor.getModifiers()));
        evaporatorConstructor.setAccessible(true);
        evaporatorConstructor.newInstance();
    }


    /**
     * Test when sentence is empty.
     */
    @Test
    public void testWhenSentenceIsEmpty() {

        // given:
        final String sentence = "";

        // when:
        final String actualResult = StringInv.stringInv(sentence);

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
        final String actualResult = StringInv.stringInv(sentence);

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
        final String actualResult = StringInv.stringInv(sentence);

        // then:
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResult);
    }
}
