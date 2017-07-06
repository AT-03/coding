package org.fundacionjala.coding.reinaldo.average;

import java.util.stream.IntStream;

/**
 * Created by Administrator on 6/30/2017.
 *
 */
public final class Average {
    /**
     * Constructor private.
     */
    private Average() {

    }

    /**
     * This method averagesCalculate verify is empty, null or only has
     * one element or  averges.
     *
     * @param sentence array.
     * @return true if the array is not empty, null or has only one element.
     */
    public static double[] averagesCalculate(final int[] sentence) {

        return sentence == null || sentence.length < 2
                ? new double[0]
                : IntStream.range(0, sentence.length - 1)
                .mapToDouble(i -> (sentence[i] + sentence[i + 1]) / 2d).toArray();
    }
}

