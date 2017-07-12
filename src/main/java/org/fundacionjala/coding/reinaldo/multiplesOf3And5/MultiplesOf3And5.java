package org.fundacionjala.coding.reinaldo.multiplesOf3And5;

import java.util.stream.IntStream;

/**
 * Created by Administrator on 6/30/2017.
 */
final class MultiplesOf3And5 {
    private static final int NUMBERTHREE = 3;
    private static final int NUMBERFIVE = 5;

    /**
     * This is the constructor MultiplesOf3And5 class.
     */
    private MultiplesOf3And5() {

    }

    /**
     * This is the method return a int number.
     *
     * @param number getSolution
     * @return int getSolution
     */
    static int getSolution(final int number) {

        return IntStream.range(NUMBERTHREE, number)
                .filter(num -> num % NUMBERTHREE == 0 || num % NUMBERFIVE == 0)
                .sum();
    }
}
