package org.fundacionjala.coding.Ruber.Exam;

/**
 * Created by Ruber Cuellar on 3/23/2017.
 */
public final class Kata {

    /**
     * Constructor.
     */
    private Kata() {
    }

    /**
     * To get the boolean[] average.
     * @param numbers The numbers to validate
     * @return double[] with the averages
     */
    public static double[] averages(final int[] numbers) {
        double[] average = new double[] {};

        if (numbers == null || numbers.length < 2) {
            return average;
        }

        average = new double[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            average[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
        }
        return average;
    }
}

