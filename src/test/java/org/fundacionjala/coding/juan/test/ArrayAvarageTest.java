package org.fundacionjala.coding.juan.test;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/23/20.
 */

public class ArrayAvarageTest {
    /**
     * Basics tests.
     */

    @Test
    public void basicTests() {

        //Given
       final int[] array1 = new int[]{2, 2, 2, 2, 2};
       final int[] array2 = new int[]{2, -2, 2, -2, 2};
       final int[] array3 = new int[]{1, 3, 5, 1, -10};

        //When
        double[] actualArray1 = Arrayaarage.getArrayAverage(array1);
        double[] actualArray2 = Arrayaarage.getArrayAverage(array2);
        double[] actualArray3 = Arrayaarage.getArrayAverage(array3);

        //final
      final   double[] expectedArray1 = new double[]{2, 2, 2, 2};
      final   double[] expectedArray2 = new double[]{0, 0, 0, 0};
       final  double[] expectedArray3 = new double[]{2, 4, 3, -4.5};
        assertEquals(Arrays.toString(actualArray1), Arrays.toString(expectedArray1));
        assertEquals(Arrays.toString(actualArray2), Arrays.toString(expectedArray2));
        assertEquals(Arrays.toString(actualArray3), Arrays.toString(expectedArray3));
    }
    /**
     * testing null and empty values.
     */

    @Test
    public void nullEmptyTests() {
        //Given
        int[] array1 = null;
        int[] array2 = new int[0];
        int[] array3 = new int[]{2};

        // when
        double[] actualArray1 = Arrayaarage.getArrayAverage(array1);
        double[] actualArray2 = Arrayaarage.getArrayAverage(array2);
        double[] actualArray3 = Arrayaarage.getArrayAverage(array3);

        //final
        int zero = 0;

        assertEquals(zero, actualArray1.length);
        assertEquals(zero, actualArray2.length);
        assertEquals(zero, actualArray3.length);
        //Arrayaarage average = new Arrayaarage();

    }
}

