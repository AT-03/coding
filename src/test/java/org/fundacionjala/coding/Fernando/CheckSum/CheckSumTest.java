package org.fundacionjala.coding.Fernando.CheckSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The test class CheckSumTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckSumTest {
    /**
     * The test class CheckSumTest.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    @Test
    public void testWhenSentenceHasNoString() {
        CheckSum ejercicio = new CheckSum();
        // given:
        final String sentence = " ";

        // when:
        final boolean actualResult = ejercicio.canValores(sentence);

        // then
        final boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * The test class CheckSumTest.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    @Test
    public void testWhenSentenceHasNoWordsMajorToFive() {
        CheckSum ejercicio = new CheckSum();
        // given:
        final String sentence = "12345";

        // when:
        final boolean actualResult = ejercicio.canValores(sentence);

        // then
        final boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * The test class CheckSumTest.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    @Test
    public void testWhenSentenceHasMoreThanOneWordMajorThatFive() {
        CheckSum ejercicio = new CheckSum();
        // given:
        final String sentence = "123456789";

        // when:
        final boolean actualResult = ejercicio.canValores(sentence);

        // then
        final boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }
}
