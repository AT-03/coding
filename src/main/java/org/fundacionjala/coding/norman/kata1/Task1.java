package org.fundacionjala.coding.norman.kata1;

/**
 * Norman.
 *
 */
public final class Task1 {
    /**
     * Validate a given EAN-Code. Return true if the given EAN-Code is valid, otherwise false.
     * You can assume the given code is syntactically valid, i.e. it only consists of numbers and it exactly
     * has a length of 13 characters.
     * Examples
     * EANValidator.validate("4003301018398") // True
     * EANValidator.validate("4003301018392") // False
     */


    private static final int DIGIT_MULTIPLIER = 3;
    private static final int DIVISIBILITY_FACTOR = 10;


    /**
     * Constructor private.
     */

    private Task1() {
    }

    /**
     * Takes an string number to verify it is checksum it's correct.
     *
     * @param eAN String number with exactly 13 digits.
     * @return true if the checksum is ok.
     */

    public static boolean validate(final String eAN) {
        int sum = 0;


        for (int i = 1; i < eAN.length(); i++) {
            int numericValue = Character.getNumericValue(eAN.charAt(i - 1));
            sum += i % 2 == 0 ? numericValue * DIGIT_MULTIPLIER : numericValue;
        }

        int module = sum % DIVISIBILITY_FACTOR;
        int check = module != 0 ? DIVISIBILITY_FACTOR - module : 0;

        return check == Character.getNumericValue(eAN.charAt(eAN.length() - 1));

    }


}



