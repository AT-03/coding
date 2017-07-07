package org.fundacionjala.coding.Fernando.checkSum;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * The test class CheckSumTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckSumTest {

    /**
     * Test Constructor.
     * @throws Exception if the constructor is not private.
     */
    @Test
    public void testCheckSumConstructorIsPrivate() throws Exception {
        Constructor constructor = CheckSum.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test when sentence is empty.
     */
    @Test
    public void testWhenSentenceISEmpty() {

        // given:
        final String sentence = "4003301018398";

        // when:
        final boolean actualResult = CheckSum.canValues(sentence);

        assertTrue(actualResult);
    }

    /**
     * Test when sentence has more than one word major that five.
     */
    @Test
    public void testWhenSentenceHasMoreThanOneWordMajorThatFive() {

        // given:
        final String sentence = "1234567890200";

        // when:
        final boolean actualResult = CheckSum.canValues(sentence);

        assertFalse(actualResult);
    }
}
