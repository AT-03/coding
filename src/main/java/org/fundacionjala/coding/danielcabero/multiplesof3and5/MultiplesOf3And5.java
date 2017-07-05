package org.fundacionjala.coding.danielcabero.multiplesof3and5;

/**
 * Created by Administrator on 6/19/2017.
 */

public final class MultiplesOf3And5 {

    private static final int THREE = 3;
    private static final int FIVE = 5;

    /**
     * Constructor.
     */
    private MultiplesOf3And5() {
    }

    /**
     * @param number for the calculate sum multiples of the 3 and 5.
     * @return <code>int</code> sum the multiples between 3 and 5.
     */
    public static int solution(final int number) {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i % THREE == 0 || i % FIVE == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
