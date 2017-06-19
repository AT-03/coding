package org.fundacionjala.coding.juan;

import java.util.Arrays;

/**
 * Created by Administrator on 6/19/2017.
 */
public class Kata {

    /**
     * Kata.
     *
     * @param number is the string of numbers
     * @return the higtest and lowest numbers
     */
    public String hingAndLow(final String number) {
        String[] numbers = number.split(" ");
        Integer[] num = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(num);
        return String.format("%d %d", num[num.length - 1], num[0]);

    }

    /**
     * Kata.
     *
     * @param num is the number.
     * @return the multiples.
     */
    public int solution(final int num) {
        int number = 0;
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                number = number + i;
            }
        }
        return number;
    }


}


