package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Exam.KataAverage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;
import java.util.Arrays;
/**
 * Created by YVayneR on 3/23/2017.
 */
public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[] { 2, 2, 2, 2 }), Arrays.toString(KataAverage.averages(new int[] { 2, 2, 2, 2, 2 })));
        assertEquals(Arrays.toString(new double[] { 0, 0, 0, 0 }), Arrays.toString(KataAverage.averages(new int[] { 2, -2, 2, -2, 2 })));
        assertEquals(Arrays.toString(new double[] { 2, 4, 3, -4.5 }), Arrays.toString(KataAverage.averages(new int[] { 1, 3, 5, 1, -10 })));
    }

    @Test
    public void nullEmptyTests() {
        assertEquals("input 'null' should return an empty array", 0, KataAverage.averages(null).length);
        assertEquals("Empty array as input should return an empty array", 0, KataAverage.averages(new int[0]).length);
        assertEquals("Array with only one value as input should return an empty array", 0, KataAverage.averages(new int[] { 2 }).length);
    }
}
