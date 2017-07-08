package org.fundacionjala.coding.norman.eanvalidator;

/**
 * Created by NORMAN on 2/7/2017.
 */
public final class EANValidator {
    private static final int ODD_DIGIT_MULTIPLIER = 3;
    private static final int DIVISIBILITY_FACTOR = 10;

    /**
     * Constructor private.
     */

    private EANValidator() {
    }

    /**
     * Takes an string number to verify it is checksum it's correct.
     *
     * @param eAN String number with exactly 13 digits.
     * @return true if the checksum is ok.
     */

    static boolean validate(final String eAN) {
        int sum = 0;


        for (int i = 1; i < eAN.length(); i++) {
            int numericValue = Character.getNumericValue(eAN.charAt(i - 1));
            sum += i % 2 == 0 ? numericValue * ODD_DIGIT_MULTIPLIER : numericValue;
        }

        int module = sum % DIVISIBILITY_FACTOR;
        int check = module != 0 ? DIVISIBILITY_FACTOR - module : 0;

        return check == Character.getNumericValue(eAN.charAt(eAN.length() - 1));

    }

}
