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
     * @param eanCode String number with exactly 13 digits.
     * @return true if the checksum is ok.
     */

    static boolean validate(final String eanCode) {
        int sum, module;
        int check = 0;

        if (eanCode.length() == EAN_CORRECTLY_LENGTH) {

            int[] digits = eanCode.chars().map(Character::getNumericValue).toArray();

            sum = IntStream.rangeClosed(1, digits.length)
                    .map(i -> i % 2 == 0 ? digits[i - 1] * ODD_DIGIT_MULTIPLIER : digits[i - 1])
                    .sum();

            module = sum % DIVISIBILITY_FACTOR;
            check = module != 0 ? DIVISIBILITY_FACTOR - module : 0;

        }
        return check == Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
    }
}
