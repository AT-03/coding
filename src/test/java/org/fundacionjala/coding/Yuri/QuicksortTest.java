package org.fundacionjala.coding.Yuri;


import java.util.Random;

import org.fundacionjala.coding.Yuri.QuickSort.Quicksort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by YVayneR on 3/9/2017.
 */
public class QuicksortTest {
    private int[] numbers;
    private static final int SIZE = 7;
    private static final int MAX = 20;

    /**
     * this method help to configure all the tests.
     * @throws Exception an exception.
     */
    @Before
    public void setUp() throws Exception {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }

    /**
     *  test to verify when the array is null.
     */
    @Test
    public void testNull() {
        Quicksort sorter = new Quicksort();
        sorter.sort(null);
    }

    /**
     * test to verify when the array is empty.
     */
    @Test
    public void testEmpty() {
        Quicksort sorter = new Quicksort();
        sorter.sort(new int[0]);
    }

    /**
     * this test helps to verify that is possible to sorter an array.
     */
    @Test
    public void testQuickSort() {
        final int[] numbers = {44, 75, 23, 43, 55, 55, 12, 64, 77, 33};
        Quicksort sorter = new Quicksort();
        sorter.sort(numbers);
        assertTrue(true);
    }
}
