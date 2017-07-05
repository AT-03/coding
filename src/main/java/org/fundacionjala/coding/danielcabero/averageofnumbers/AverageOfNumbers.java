package org.fundacionjala.coding.danielcabero.averageofnumbers;

import java.util.stream.IntStream;

/**
 * Created by administrator on 6/20/2017.
 */

public final class AverageOfNumbers {

    /**
     * Private constructor.
     */
    private AverageOfNumbers() {
    }

    /**
     * The method returns the average of the elements in the array as a double array.
     *
     * @param numbers is an array of int numbers.
     * @return the average of the numbers as an array.
     */
    public static double[] numberAverages(final int[] numbers) {
        return (numbers == null || numbers.length <= 1)
                ? new double[]{}
                : IntStream.range(0, numbers.length - 1)
                .mapToDouble(i -> (numbers[i] + numbers[i + 1]) / 2.0)
                .toArray();
    }
}
