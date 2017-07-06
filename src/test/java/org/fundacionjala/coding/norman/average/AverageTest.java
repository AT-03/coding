package org.fundacionjala.coding.norman.average;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class AverageTest {

    /**
     * Constructor test.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = Average.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
    /**
     * The method verifies test1.
     */
    @Test
    public void test1() {
        final int[] arrayNumbers = new int[]{2, 2, 2, 2, 2};

        final double[] actualResult = Average.averages(arrayNumbers);

        final double[] expectedResult = new double[]{2, 2, 2, 2};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * The method verifies test2.
     */
    @Test
    public void test2() {
        final int[] arrayNumbers = new int[]{2, -2, 2, -2, 2};

        final double[] actualResult = Average.averages(arrayNumbers);

        final double[] expectedResult = new double[]{0, 0, 0, 0};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }


    /**
     * The method verifies test3.
     */
    @Test
    public void test3() {

        final int[] arrayNumbers = new int[]{1, 3, 5, 1, -10};

        final double[] actualResult = Average.averages(arrayNumbers);

        final double[] expectedResult = new double[]{2, 4, 3, -4.5};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }


    /**
     * The method verifies test4.
     */
    @Test
    public void test4() {

        final int[] arrayNumbers = new int[]{};

        final double[] actualResult = Average.averages(arrayNumbers);

        final double[] expectedResult = new double[]{};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * The method verifies test5.
     */
    @Test
    public void test5() {

        final int[] arrayNumbers = new int[]{1};

        final double[] actualResult = Average.averages(arrayNumbers);

        final double[] expectedResult = new double[]{};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * The method verifies test6.
     */
    @Test
    public void test6() {
        final int[] arrayNumbers = null;

        final double[] actualResult = Average.averages(arrayNumbers);

        final double[] expectedResult = new double[]{};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}
