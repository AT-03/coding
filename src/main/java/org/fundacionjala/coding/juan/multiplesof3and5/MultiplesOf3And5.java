package org.fundacionjala.coding.juan.multiplesof3and5;

/**
 * Created by Administrator on 6/28/2017.
 */
public class MultiplesOf3And5 {
    /**
     * Kata.
     *
     * @param num is the number.
     * @return the multiples.
     */
    public int solution(final int num) {
        int number = 0;
        final int three = 3;
        final int five = 5;
        for (int i = 0; i < num; i++) {
            if (i % three == 0 || i % five == 0) {
                number = number + i;
            }
        }
        return number;
    }
}
