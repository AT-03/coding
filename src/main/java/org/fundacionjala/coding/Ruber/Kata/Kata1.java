package org.fundacionjala.coding.Ruber.Kata;

/**
 * Created by Ruber Cuellar on 6/19/2017.
 */
public final class Kata1 {
    public static final int NUMBER_THREE = 3;
    public static final int NUMBER_FIVE = 5;

    /**
     * Constructor.
     */
    private Kata1() {
    }

    /**
     * To return numbers 3 5.
     * @param number The number
     * @return int
     */
    public static int solution(final int number) {
        int total = 0;
        int newNumber = 0;
        while (newNumber < number) {
            if (newNumber % NUMBER_THREE == 0 || newNumber % NUMBER_FIVE == 0) {
                total += newNumber;
            }
            newNumber++;
        }
        return total;
    }
}
