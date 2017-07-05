package org.fundacionjala.coding.pablo.MultiplesThreeAndFive;

/**
 * Created by Administrator on 6/19/2017.
 */
public final class Multiples {
    private static final int MULTIPLE_THREE = 3;
    private static final int MULTIPLE_FIVE = 5;

    /**
     * Constructor.
     */

    private Multiples() {

    }

    /**
     * Found multiples of 3 and 5.
     * @param num Quantity
     * @return aux value multiples of 3 and 5.
     */

    public static int solution(final int num) {
        int aux = 0;
        for (int i = 0; i < num; i++) {
            if (i % MULTIPLE_THREE == 0 || i % MULTIPLE_FIVE == 0) {
                aux += i;
            }
        }
        return aux;
    }
}
