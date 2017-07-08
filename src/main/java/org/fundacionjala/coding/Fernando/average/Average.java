package org.fundacionjala.coding.Fernando.average;

/**
 * Write a description of class Average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class Average {

    /**
     * Constructor Average.
     */
    private Average() {
    }

    /**
     * @param num the method has a int value.
     * @return double value.
     */
    public static double[] average(final int[] num) {
        double[] res = {};
        if (num != null && num.length != 0) {
            return average(num, 0);
        }
        return res;
    }

    /**
     * @param num  the method has a int value.
     * @param pos1 param.
     * @return double value.
     */
    private static double[] average(final int[] num, final int pos1) {
        double[] res = new double[num.length - 1];
        for (int pos = 0; pos < num.length - 1; pos++) {
            double prom = (double) (num[pos] + num[pos + 1]) / 2;
            res[pos] = prom;
        }
        return res;

    }
}
