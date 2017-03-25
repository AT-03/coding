package org.fundacionjala.coding.Fernando.CheckSum;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The test class CheckSumTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckSumTest {
    /**
     * Test when sentence is empty.
     */
    @Test
    public void testWhenSentenceISEmpty() {
        CheckSum cs = new CheckSum();
        // given:
        final String sentence = "4003301018398";

        // when:
        final boolean actualResult = cs.canValores(sentence);

        // then
        final boolean expectedResult = false;
        assertTrue(actualResult);
    }

    /**
     * Test when sentence has more than one word major that five.
     */
    @Test
    public void testWhenSentenceHasMoreThanOneWordMajorThatFive() {
        CheckSum cs = new CheckSum();
        // given:
        final String sentence = "1234567890200";

        // when:
        final boolean actualResult = cs.canValores(sentence);

        // then
        final boolean expectedResult = true;
        assertFalse(actualResult);
    }
}
