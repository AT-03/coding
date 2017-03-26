package org.fundacionjala.coding.pablo.FinalKata;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Pablo on 26/03/2017.
 */
public class SolutionTest {

    /**
     * Test about Basic Test.
     */

    @Test
    public void basicTests() {

        final int[] arrayIntegers1 = new int[]{2, 2, 2, 2, 2};
        final int[] arrayIntegers2 = new int[]{2, -2, 2, -2, 2};
        final int[] arrayIntegers3 = new int[]{1, 3, 5, 1, -10};

        //When
        double[] actualArray1 = Solution.averages(arrayIntegers1);
        double[] actualArray2 = Solution.averages(arrayIntegers2);
        double[] actualArray3 = Solution.averages(arrayIntegers3);

        //final
        final   double[] expectedArray1 = new double[]{2, 2, 2, 2};
        final   double[] expectedArray2 = new double[]{0, 0, 0, 0};
        final  double[] expectedArray3 = new double[]{2, 4, 3, -4.5};
        assertEquals(Arrays.toString(actualArray1), Arrays.toString(expectedArray1));
        assertEquals(Arrays.toString(actualArray2), Arrays.toString(expectedArray2));
        assertEquals(Arrays.toString(actualArray3), Arrays.toString(expectedArray3));

    }

    /**
     * Test about null empty tests.
     */

    @Test
    public void nullEmptyTests() {
        assertEquals("input 'null' should return an empty array"
                , 0, Solution.averages(null).length);
        assertEquals("Empty array as input should return an empty array"
                , 0, Solution.averages(new int[0]).length);
        assertEquals("Array with only one value as input should return an empty array"
                , 0, Solution.averages(new int[] {2}).length);
    }
}
