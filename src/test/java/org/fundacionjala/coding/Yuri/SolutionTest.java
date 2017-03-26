package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Exam.KataAverage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
/**
 * Created by YVayneR on 3/23/2017.
 */
public class SolutionTest {
    /**
     * this test helps to verify the averages for values of an array.
     */
    @Test
    public void basicTests() {
        final double[] expectedResult01 = {2, 2, 2, 2};
        final int[] array01 = {2, 2, 2, 2, 2};
        assertEquals(Arrays.toString(expectedResult01), Arrays.toString(KataAverage.averages(array01)));
        final double[] expectedResult02 = {0, 0, 0, 0};
        final int[] array02 = {2, -2, 2, -2, 2};
        assertEquals(Arrays.toString(expectedResult02), Arrays.toString(KataAverage.averages(array02)));
        final double[] expectedResult03 = {2, 4, 3, -4.5};
        final int[] array03 = {1, 3, 5, 1, -10};
        assertEquals(Arrays.toString(expectedResult03), Arrays.toString(KataAverage.averages(array03)));
    }

    /**
     * this test helps to verify the exceptions for the arrays values.
     */
    @Test
    public void nullEmptyTests() {
        final String message01 = "input 'null' should return an empty array";
        assertEquals(message01, 0, KataAverage.averages(null).length);
        final String message02 = "Empty array as input should return an empty array";
        assertEquals(message02, 0, KataAverage.averages(new int[0]).length);
        final String message03 = "Array with only one value as input should return an empty array";
        assertEquals(message03, 0, KataAverage.averages(new int[]{2}).length);
    }
}
