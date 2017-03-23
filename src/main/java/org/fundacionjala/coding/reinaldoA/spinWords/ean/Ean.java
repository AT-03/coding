package org.fundacionjala.coding.reinaldoA.spinWords.ean;



/**
 * Created by reinaldo on 12/03/2017.
 */

public final class Ean {
    private static final int ODD_DIGIT_MULTIPLIER = 3;
    private static final int DIVISIBILITY_FACTOR = 10;
    private static int sum = 0;

    /**
     * Constructor private.
     */

    private Ean() {
    }

    /**
     * @param sentence validate checksum.
     * @return boolean is checksum.
     */
    public static boolean checksumValidate(final String sentence) {
        int comparation = Integer.parseInt(sentence.substring(sentence.length() - 1));
        for (int iterator = 0; iterator < sentence.length() - 1; iterator++) {
            int datoint = Integer.parseInt(sentence.substring(iterator, iterator + 1));
            sum += (iterator % 2) != 0 ? datoint * ODD_DIGIT_MULTIPLIER : datoint;
        }
        return (sum % DIVISIBILITY_FACTOR != 0 ? DIVISIBILITY_FACTOR - (sum % DIVISIBILITY_FACTOR) : 0) == comparation;
    }
}
