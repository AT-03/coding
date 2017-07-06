package org.fundacionjala.coding.norman.average;

import java.util.stream.IntStream;

/**
 * Created by NORMAN on 2/7/2017.
 */
public final class Average {
    /**
     * Contructor.
     */
    private Average() {

    }

    /**
     * average to array.
     *
     * @param numbers array.
     * @return array.
     */

    public static double[] averages(final int[] numbers) {
        return (numbers == null || numbers.length <= 1)
                ? new double[]{}
                : IntStream.range(0, numbers.length - 1)
                .mapToDouble(i -> (numbers[i] + numbers[i + 1]) / 2.0)
                .toArray();
    }
}
