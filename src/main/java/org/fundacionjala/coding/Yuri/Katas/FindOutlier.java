package org.fundacionjala.coding.Yuri.Katas;

/**
 * Created by Win7-VM-01 on 28/02/2017.
 * Description:
 You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single
 integer N. Write a method that takes the array as an argument and returns N.
 For example:
 [2, 4, 0, 100, 4, 11, 2602, 36]
 Should return: 11
 [160, 3, 1719, 19, 11, 13, -21]
 Should return: 160
 */
public final class FindOutlier {
    /**
     * Constructor method of the class.
     */
    private FindOutlier() {
    }
    /**
     * this method helps to find the different number for a set of numbers that could be odd or even.
     * @param integers the set of numbers to evaluate.
     * @return the different number
     */
     public static int find(final int[] integers) {
        int liar = 0;
        boolean flag = isEven(integers);
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0 && flag) {
                liar = integers[i];
            } else {
                if (integers[i] % 2 == 0 && !flag) {
                    liar = integers[i];
                }
            }
        }
        return liar;
    }

    /**
     * this method helps to verify if the integers numbers are even or odd.
     * @param integers the set of numbers.
     * @return <code>true</code> if the three first values are odd.
     *         <code>false</code> otherwise if the values are even.
     */
     public static boolean isEven(final int[] integers) {
        int even = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even++;
            }
        }
        return even > 1;
    }
}
