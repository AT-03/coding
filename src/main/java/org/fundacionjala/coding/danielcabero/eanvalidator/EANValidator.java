package org.fundacionjala.coding.danielcabero.eanvalidator;

/**
 * Created administrat on 3/10/2017.
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

    public static boolean validate(final String eAN) {
        int sum = 0;

        if (!checkCorrectLength(eAN)) {
            return false;
        } else {
            for (int i = 1; i < eAN.length(); i++) {
                int numericValue = Character.getNumericValue(eAN.charAt(i - 1));
                sum += i % 2 == 0 ? numericValue * ODD_DIGIT_MULTIPLIER : numericValue;
            }

            int module = sum % DIVISIBILITY_FACTOR;
            int check = module != 0 ? DIVISIBILITY_FACTOR - module : 0;

            return check == Character.getNumericValue(eAN.charAt(eAN.length() - 1));
        }
    }

    /**
     * Takes an String number digits and returns true if the String length
     * is exactly 13.
     *
     * @param stringNumber number
     * @return true if stringNumber length is exactly 13.
     */
   public static boolean checkCorrectLength(final String stringNumber) {
        return stringNumber.length() == EAN_CORRECTLY_LENGTH;
    }
}
