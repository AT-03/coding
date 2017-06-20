package org.fundacionjala.coding.danielmontecinos.highestandlowest;

import java.util.stream.Stream;

/**
 * Created by Administrator on 6/19/2017.
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
    public static String highAndLowest(final String numbers) {
        int[] digits = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();

        int high, lowest;
        high = digits[0];
        lowest = digits[0];

        for (int number : digits) {
            if (number > high) {
                high = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        return String.format("%d %d", high, lowest);
    }
}
