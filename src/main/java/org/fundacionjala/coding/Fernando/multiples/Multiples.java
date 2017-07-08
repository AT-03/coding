package org.fundacionjala.coding.Fernando.multiples;

/**
 * Created by PC on 24/06/2017.
 */
public  final class Multiples {

    public static final int FIVE = 5;
    private static final int THREE = 3;

    /**
     * Constructor.
     */
    private Multiples() {
    }

    /**
     * @param num parameter.
     * @return int value multiples of 3 and 5.
     */

    public static int solution(final int num) {
        int res = 0;
        for (int i = 0; i < num; i++) {
            if (i % THREE == 0 || i % FIVE == 0) {
                res += i;
            }
        }
        return res;
    }
}
