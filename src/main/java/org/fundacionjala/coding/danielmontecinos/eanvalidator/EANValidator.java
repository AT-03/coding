package org.fundacionjala.coding.danielmontecinos.eanvalidator;

import java.util.stream.IntStream;

/**
 * Class EANValidator.
 */

final class EANValidator {
    private static final int ODD_DIGIT_MULTIPLIER = 3;
    private static final int DIVISIBILITY_FACTOR = 10;
    private static final int EAN_CORRECTLY_LENGTH = 13;

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
        int sum, module;
        int check = 0;

        if (checkCorrectLength(eAN)) {

            int[] digits = eAN.chars().map(Character::getNumericValue).toArray();

            sum = IntStream.rangeClosed(1, digits.length)
                    .map(i -> i % 2 == 0 ? digits[i - 1] * ODD_DIGIT_MULTIPLIER : digits[i - 1])
                    .sum();

            module = sum % DIVISIBILITY_FACTOR;
            check = module != 0 ? DIVISIBILITY_FACTOR - module : 0;

        }
        return check == Character.getNumericValue(eAN.charAt(eAN.length() - 1));
    }

    /**
     * Takes an String number digits and returns true if the String length
     * is exactly 13.
     *
     * @param stringNumber number
     * @return true if stringNumber length is exactly 13.
     */
    static boolean checkCorrectLength(final String stringNumber) {
        return stringNumber.length() == EAN_CORRECTLY_LENGTH;
    }
}
