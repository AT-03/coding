package org.fundacionjala.coding.juan.test;

/**
 * Created by Juan on 3/23/2017.
 */
final class ArrayAverage {

    /**
     * constructor.
     */
    private ArrayAverage() {
    }

    /**
     * this function will calculate the averrage of a given array.
     *
     * @param arrayInt is the given array
     * @return final array.
     */
    public static double[] getArrayAverage(final int[] arrayInt) {
        if (arrayInt == null || arrayInt.length == 0 || arrayInt.length == 1) {
            return new double[0];
        }
        double[] finalArray = new double[arrayInt.length - 1];
        for (int i = 0; i < arrayInt.length - 1; i++) {
            finalArray[i] = (double) (arrayInt[i] + arrayInt[i + 1]) / 2;

        }
        return finalArray;
    }

}
