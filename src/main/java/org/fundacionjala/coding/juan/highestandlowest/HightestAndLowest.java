package org.fundacionjala.coding.juan.highestandlowest;

import java.util.Arrays;

/**
 * Created by Administrator on 6/28/2017.
 */
public final class HightestAndLowest {

    /**
     * Constructor.
     */
    private HightestAndLowest() {
    }

    /**
     * Kata.
     *
     * @param number is the string of numbers
     * @return the higtest and lowest numbers
     */
    public static String hingAndLow(final String number) {
        String[] numbers = number.split(" ");
        Integer[] num = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(num);
        return String.format("%d %d", num[num.length - 1], num[0]);

    }
}
