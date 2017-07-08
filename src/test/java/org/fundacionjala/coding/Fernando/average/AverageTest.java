package org.fundacionjala.coding.Fernando.average;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * The test class AverageTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AverageTest {

    /**
     * Test Constructor.
     * @throws Exception if the constructor is not private.
     */
    @Test
    public void testAverageConstructorIsPrivate() throws Exception {
        Constructor constructor = Average.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test to get the prom when we have 5 elements.
     */
    @Test
    public void testPromWhenHave5Elements() {

        // given:
        final int[] num = {2, 2, 2, 2, 2};

        // when:
        final double[] actualResult = Average.average(num);

        // then:
        final double[] expectedResult = {2.0, 2.0, 2.0, 2.0};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * Test to get the prom when we have differents elements.
     */
    @Test
    public void testPromWhenHaveDifferentData() {

        // given:

        final int[] num = {1, 3, 5, 1, -10};

        // when:
        final double[] actualResult = Average.average(num);

        // then:
        final double[] expectedResult = {2.0, 4.0, 3.0, -4.5};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * Test to get the prom when we have the same elements.
     */
    @Test
    public void testPromWhenHaveTheSameData() {

        // given:
        final int[] num = {2, -2, 2, -2, 2};

        // when:
        final double[] actualResult = Average.average(num);

        // then:
        final double[] expectedResult = {0.0, 0.0, 0.0, 0.0};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * Test to get the prom when the array is null.
     */
    @Test
    public void testPromWhenTheArrayIsNull() {

        // given:
        final int[] num = null;

        // when:
        final double[] actualResult = Average.average(num);

        // then:
        final double[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * Test to get the prom when we have the array empty.
     */
    @Test
    public void testPromWhenTheArrayIsEmpty() {

        // give:
        final int[] num = {};

        // when:
        final double[] actualResult = Average.average(num);

        // then:
        final double[] expectedResult = {};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * Test to get the prom when we have one element.
     */
    @Test
    public void testPromWhenTheArrayHasOneElement() {

        // given:
        final int[] num = {2};

        // when:
        final double[] actualResult = Average.average(num);

        // then:
        final double[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}
