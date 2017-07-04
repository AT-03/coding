package org.fundacionjala.coding.norman.kata.highestandlowest;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by NORMAN on 2/7/2017.
 */
public final class HighestAndLowest {
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
        Arrays.sort(digits);

        return String.format("%d %d", digits[digits.length - 1], digits[0]);
    }
}
