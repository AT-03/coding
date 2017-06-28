package org.fundacionjala.coding.danielmontecinos.multiplesof3and5;

import java.util.stream.IntStream;

/**
 * Created by Administrator on 6/19/2017.
 */

public final class MultiplesOf3And5 {

    public static final int SECOND_DIVISOR = 5;
    private static final int FIRST_DIVISOR = 3;

    /**
     * Private Constructor.
     */
    private MultiplesOf3And5() {
    }

    /**
     * The method returns the sum of all multiples of 3 and 5 below a limit passed.
     *
     * @param number is the limit number to calculate the sum.
     * @return the sum of the the multiples of 3 and 5 below number.
     */
    public static int getSolution(final int number) {
        return IntStream.range(FIRST_DIVISOR, number)
                .filter(num -> num % FIRST_DIVISOR == 0 || num % SECOND_DIVISOR == 0)
                .sum();
    }
}
