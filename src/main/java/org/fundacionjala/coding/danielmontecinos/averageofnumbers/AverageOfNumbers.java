package org.fundacionjala.coding.danielmontecinos.averageofnumbers;

import java.util.stream.IntStream;

/**
 * Class Average of Numbers.
 */

final class AverageOfNumbers {

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
    static double[] averages(final int[] numbers) {
        return (numbers == null || numbers.length <= 1)
                ? new double[]{}
                : IntStream.range(0, numbers.length - 1)
                .mapToDouble(i -> (numbers[i] + numbers[i + 1]) / 2.0)
                .toArray();
    }
}
