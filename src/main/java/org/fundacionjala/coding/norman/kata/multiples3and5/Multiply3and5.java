package org.fundacionjala.coding.norman.kata.multiples3and5;

/**
 * Created by NORMAN on 2/7/2017.
 */
public final class Multiply3and5 {

    public static final int MULTIPLY_3 = 3;
    public static final int MULTIPLY_5 = 5;

    /**
     * Contrusctor.
     */
    private Multiply3and5() {

    }

    /**
     * method plus number multiply 3 and 5.
     *
     * @param number limit to calculate multiply.
     * @return sum of multiply.
     */
    public static int solution(final int number) {

        int res = 0;
        for (int i = 1; i < number; i++) {
            if (i % MULTIPLY_3 == 0 || i % MULTIPLY_5 == 0) {
                res += i;
            }
        }
        return res;

    }
}
