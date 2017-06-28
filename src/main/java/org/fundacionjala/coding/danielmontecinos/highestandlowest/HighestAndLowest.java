package org.fundacionjala.coding.danielmontecinos.highestandlowest;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Administrator on 6/19/2017.
 */

final class HighestAndLowest {

    /**
     * Private constructor.
     */
    private HighestAndLowest() {
    }

    /**
     * The method return the highest and lowest value of a number array.
     *
     * @param numbers is the String of numbers.
     * @return a String with the highest and lowest values.
     */
    static String highAndLowest(final String numbers) {
        int[] digits = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();

        int high = Arrays.stream(digits).max().getAsInt();

        int lowest = Arrays.stream(digits).min().getAsInt();

        return String.format("%d %d", high, lowest);
    }
}
