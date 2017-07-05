package org.fundacionjala.coding.Fernando.multiples;

/**
 * Created by PC on 24/06/2017.
 */
public abstract class Multiples {

    public static final int FIVE = 5;
    private static final int THREE = 3;

    /**
     * Method Constructor.
     */
    private Multiples() {
    }

    /**
     * The method get the sum of multiples of 3 and 5.
     *
     * @param number to calculate the sum.
     * @return int of the sum multiples of 3 and 5.
     */
    public static int solution(final int number) {
        int res = 0;
        for (int i = 0; i < number; i++) {
            if (i % THREE == 0 || i % FIVE == 0) {
                res += i;
            }
        }
        return res;
    }
}
