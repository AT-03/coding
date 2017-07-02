package org.fundacionjala.coding.pablo.FinalKata;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Pablo on 26/03/2017.
 */
public class SolutionTest {

    /**
     * Test about Basic Test one.
     */
    @Test
    public void basicTestsOne() {

        final int[] arrayIntegers = new int[]{2, 2, 2, 2, 2};

        //When
        double[] actualArray = Solution.averages(arrayIntegers);

        //final
        final   double[] expectedArray = new double[]{2, 2, 2, 2};
        assertEquals(Arrays.toString(actualArray), Arrays.toString(expectedArray));
    }

    /**
     * Test about Basic Test two.
     */
    @Test
    public void basicTestsTwo() {

        final int[] arrayIntegers = new int[]{2, -2, 2, -2, 2};

        //When
        double[] actualArray = Solution.averages(arrayIntegers);

        //final
        final   double[] expectedArray = new double[]{0, 0, 0, 0};
        assertEquals(Arrays.toString(actualArray), Arrays.toString(expectedArray));
    }

    /**
     * Test about Basic Test three.
     */
    @Test
    public void basicTestsThree() {

        final int[] arrayIntegers = new int[]{1, 3, 5, 1, -10};

        //When
        double[] actualArray = Solution.averages(arrayIntegers);

        //final
        final  double[] expectedArray = new double[]{2, 4, 3, -4.5};
        assertEquals(Arrays.toString(actualArray), Arrays.toString(expectedArray));
    }

    /**
     * Test if is empty.
     */
    @Test
    public void whenIsEmpty() {
        int[] empty = new int[]{2};

        // when
        double[] actualArray = Solution.averages(empty);

        //final
        int zero = 0;
        assertEquals(zero, actualArray.length);
    }

    /**
     * Test if is null.
     */
    @Test
    public void ifIsNull() {
        int[] nullValue = null;

        // when
        double[] actualArray = Solution.averages(nullValue);

        //final
        int zero = 0;
        assertEquals(zero, actualArray.length);
    }

    /**
     * Test return an empty array.
     */
    @Test
    public void whenReturnAnEmptyArray() {
        int[] emptyArray = new int[]{2};

        // when
        double[] actualArray = Solution.averages(emptyArray);

        //final
        int zero = 0;
        assertEquals(zero, actualArray.length);
    }
}
