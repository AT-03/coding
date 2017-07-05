package org.fundacionjala.coding.reinaldo.ean;

import java.util.stream.IntStream;

/**
 * Created by Administrator on 6/30/2017.
 */
public final class Ean {

    private static final int DIVISOR = 10;

    /**
     * This is the constructor of Ean.
     */
    private Ean() {

    }

    /**
     * @param eanCode validate checksum.
     * @return boolean is checksum.
     */
    static boolean validate(final String eanCode) {
        final int sumToCheck = IntStream
                .range(0, eanCode.length() - 1)
                .reduce(0, (acc, index)
                        -> acc + Character.getNumericValue(eanCode.charAt(index)) * (1 + 2 * (index % 2)));

        return Character.getNumericValue(eanCode.charAt(eanCode.length() - 1)) == getAnInt(sumToCheck);

    }

    /**
     * This method return getAnInt.
     *
     * @param sumToCheck sumtocheck.
     * @return int getSum
     */
    private static int getAnInt(int sumToCheck) {
        return sumToCheck % DIVISOR == 0 ? 0 : DIVISOR - (sumToCheck % DIVISOR);
    }
}
