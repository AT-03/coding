package org.fundacionjala.coding.Yuri.Exam;

/**
 * Created by YVayneR on 3/23/2017.
 */
public final class KataAverage {
    /**
     * method constructor.
     */
    private KataAverage() {

    }
    /**
     * This method helps to get the averages for an integer array.
     * @param numbers the numbers.
     * @return the array with average.
     */
    public static double[] averages(final int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[0];
        }
        int limitAverage = numbers.length - 1;
        int secondPointer = 1;
        double[] average = new double[limitAverage];
        for (int i = 0; i < limitAverage; i++) {
                average[i] = calculateAverage(numbers[i], numbers[secondPointer]);
                secondPointer++;
        }
        return average;
    }

    /**
     * this method helps to calculate the average with two numbers.
     * @param num1 the number 1.
     * @param num2 thu number 2.
     * @return the average.
     */
    public static double calculateAverage(final int num1, final int num2) {
        return (double) (num1 + num2) / 2;
    }
}
