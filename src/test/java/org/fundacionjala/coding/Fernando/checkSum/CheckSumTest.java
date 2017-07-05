package org.fundacionjala.coding.Fernando.checkSum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The test class CheckSumTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckSumTest {

    private CheckSum cs;

    /**
     * Create check sum.
     */
    @Before
    public void checkSum() {
        cs = new CheckSum();
    }

    /**
     * Test when sentence is empty.
     */
    @Test
    public void testWhenSentenceISEmpty() {

        // given:
        final String sentence = "4003301018398";

        // when:
        final boolean actualResult = cs.canValues(sentence);

        // then
        final boolean expectedResult = true;
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Test when sentence has more than one word major that five.
     */
    @Test
    public void testWhenSentenceHasMoreThanOneWordMajorThatFive() {

        // given:
        final String sentence = "1234567890200";

        // when:
        final boolean actualResult = cs.canValues(sentence);

        // then
        final boolean expectedResult = false;
        assertEquals(actualResult, expectedResult);
    }
}
