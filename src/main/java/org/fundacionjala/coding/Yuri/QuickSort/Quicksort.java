package org.fundacionjala.coding.Yuri.QuickSort;

/**
 * Created by YVayneR on 3/10/2017.
 * Quicksort is a divide and conquer algorithm. Quicksort first divides a large array into two smaller sub-arrays:
 * the low elements and the high elements. Quicksort can then recursively sort the sub-arrays.
 * e.g : numbers = {55,15,21,5,1,12,14} the array should be sorted like this.
 *       numbers = {1,5,12,14,15,21,55}
 */
public class Quicksort {
    private int[] numbers;
    private int number;

    /**
     * this method helps to verify if the array with values are valid or not null.
     * @param values the integers values to be sorted.
     */
    public void sort(final int[] values) {
        // check for empty or null array
        if (values == null || values.length == 0) {
            return;
        }
        this.numbers = values;
        number = values.length;
        quickSort(0, number - 1);
    }

    /**
     * this is the method that implement the quicksort algorithm to sort an array.
     * @param low this is value of the low pointer.
     * @param high this is value of the high pointer.
     */
    private void quickSort(final int low, final int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high - low) / 2];
        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }
            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }

    /**
     * this method helps to exchange values of the array.
     * @param i the value in the left side.
     * @param j the value in the right side.
     */
    private void exchange(final int i, final int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    /**
     * this method helps to display the array values.
     * @param numbers the array to be displayed.
     */
    public void showArray(final int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    /**
     * this method return the numbers to be sorted.
     * @return the numbers sorted.
     */
    public int[] getNumbers() {
        return numbers;
    }
}
