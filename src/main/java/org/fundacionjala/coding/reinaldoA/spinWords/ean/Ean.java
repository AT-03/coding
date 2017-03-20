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
     * @param datoEa validate checksum.
     * @return boolean is checksum.
     */
    public static boolean validate(final String datoEa) {

        int comparation = Integer.parseInt(datoEa.substring(datoEa.length() - 1));
        for (int dato = 0; dato < datoEa.length() - 1; dato++) {
            int datoint = Integer.parseInt(datoEa.substring(dato, dato + 1));
            sum += (dato % 2) != 0 ? datoint * ODD_DIGIT_MULTIPLIER : datoint;
        }
        return (sum % DIVISIBILITY_FACTOR != 0 ? DIVISIBILITY_FACTOR - (sum % DIVISIBILITY_FACTOR) : 0) == comparation;
    }
}
