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
        final int checksum = sumToCheck % DIVISOR == 0 ? 0 : DIVISOR - (sumToCheck % DIVISOR);

        return Character.getNumericValue(eanCode.charAt(eanCode.length() - 1)) == checksum;

    }
}
