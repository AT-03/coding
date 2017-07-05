package org.fundacionjala.coding.pablo.FinalKata;

/**
 * Created by Pablo on 26/03/2017.
 */
public final class Solution {

    /**
     * Constructor.
     */

    private Solution() {
    }

    /**
     * This Write a method, which gets an array of integers and returns an array of the averages,
     * of each integer and its follower, if any.
     * @param ints int[], array of integers and returns.
     * @return result, array of the averages.
     */

    public static double[] averages(final int[] ints) {
        if (ints == null || ints.length == 0 || ints.length == 1) {
                return new double[0];
        }

        double[] result = new double[ints.length - 1];

        for (int i = 0; i < ints.length - 1; i++) {
            result[i] = (double) (ints[i] + ints[i + 1]) / 2;
        }

        return result;
    }
}
