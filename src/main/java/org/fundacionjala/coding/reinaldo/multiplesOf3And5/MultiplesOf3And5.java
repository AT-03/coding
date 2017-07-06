package org.fundacionjala.coding.reinaldo.multiplesOf3And5;

import java.util.stream.IntStream;

/**
 * Created by Administrator on 6/30/2017.
 */
final class MultiplesOf3And5 {
    private static final int NUMBERDIVISOR = 3;
    private static final int NUMBERDIVISORCINCO = 5;

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

        return IntStream.range(NUMBERDIVISOR, number)
                .filter(num -> num % NUMBERDIVISOR == 0 || num % NUMBERDIVISORCINCO == 0)
                .sum();
    }
}
