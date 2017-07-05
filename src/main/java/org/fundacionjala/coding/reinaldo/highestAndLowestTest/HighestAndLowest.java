package org.fundacionjala.coding.reinaldo.highestAndLowestTest;

import java.util.stream.Stream;

/**
 * Created by Administrator on 6/30/2017.
 */
final class HighestAndLowest {
    /**
     * Private constructor.
     */
    private HighestAndLowest() {
    }

    /**
     * the method return the highAndLowest.
     *
     * @param numbers highAndLowest test
     * @return String highAndLowest string
     */
    static String highAndLowest(final String numbers) {


        int high = Stream.of(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .max().getAsInt();

        int low = Stream.of(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .min().getAsInt();

        return String.format("%d %d", high, low);
    }

    /**
     * This method retorn a convertDigits.
     *
     * @param numbers digit array int.
     * @return int[] digits
     */
    private static int[] convertDigits(final String numbers) {
        return Stream.of(numbers.split(" "))
                .mapToInt(Integer::parseInt).toArray();

    }

}
