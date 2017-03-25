package org.fundacionjala.coding.Fernando.Exam;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * The test class PromTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PromTest {
    /*
 * testPromWhenHave5Elements.
 */
    @Test
    public void testPromWhenHave5Elements() {
        Prom p = new Prom();
        // given:
        final int[] num = {2, 2, 2, 2, 2};

        // when:
        final double[] actualResult = p.promedio(num);

        // then:
        final double[] expectedResult = {2.0, 2.0, 2.0, 2.0};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /*
     * testPromWhenHave5Elements.
     */
    @Test
    public void testPromWhenHaveDiferentData() {
        Prom p = new Prom();
        // given: 
        final int[] num = {1, 3, 5, 1, -10};

        // when:
        final double[] actualResult = p.promedio(num);

        // then:
        final double[] expectedResult = {2.0, 4.0, 3.0, -4.5};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /*
     * testPromWhenHave5Elements.
     */
    @Test
    public void testPromWhenHaveTheSameData() {
        Prom p = new Prom();
        // given:
        final int[] num = {2, -2, 2, -2, 2};

        // when:
        final double[] actualResult = p.promedio(num);

        // then:
        final double[] expectedResult = {0.0, 0.0, 0.0, 0.0};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /*
     * testPromWhenHave5Elements.
     */
    @Test
    public void testPromWhenTheArrayIsNull() {
        Prom p = new Prom();
        // given:
        final int[] num = null;

        // when:
        final double[] actualResult = p.promedio(num);

        // then:
        final double[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /*
     * testPromWhenHave5Elements.
     */
    @Test
    public void testPromWhenTheArrayIsEmpty() {
        Prom p = new Prom();
        // give:
        final int[] num = {};

        // when:
        final double[] actualResult = p.promedio(num);

        // then:
        final double[] expectedResult = {};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /*
     * testPromWhenHave5Elements.
     */
    @Test
    public void testPromWhenTheArrayHasOneElement() {
        Prom p = new Prom();
        // given:
        final int[] num = {2};

        // when:
        final double[] actualResult = p.promedio(num);

        // then:
        final double[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}
