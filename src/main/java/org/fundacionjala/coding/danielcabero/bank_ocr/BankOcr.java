package org.fundacionjala.coding.danielcabero.bank_ocr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by administrator on 3/10/2017.
 */

final class BankOcr {

    private static final int MODULUS_FACTOR = 11;
    private static final int ACCOUNT_LENGTH = 9;
    private static final int SCANNED_ACCOUNT_LENGTH = 72;
    private static final int MULTIPLY_FACTOR = 9;
    private static final int INDEX_MODULUS_FACTOR = 9;
    private static final int NUMBER_START = 0;
    private static final int NUMBER_END = 3;
    private static final Map<Integer, String> MAPS_OF_NUMBERS = new HashMap<>();

    static {
        MAPS_OF_NUMBERS.put(NUMBERS.ZERO.ordinal(),
                " _ "
                        + "| |"
                        + "|_|");
        MAPS_OF_NUMBERS.put(NUMBERS.ONE.ordinal(),
                "   "
                        + "  |"
                        + "  |");
        MAPS_OF_NUMBERS.put(NUMBERS.TWO.ordinal(),
                " _ "
                        + " _|"
                        + "|_ ");
        MAPS_OF_NUMBERS.put(NUMBERS.THREE.ordinal(),
                "__ "
                        + " _|"
                        + "__|");
        MAPS_OF_NUMBERS.put(NUMBERS.FOUR.ordinal(),
                "   "
                        + "|_|"
                        + "  |");
        MAPS_OF_NUMBERS.put(NUMBERS.FIVE.ordinal(),
                " _ "
                        + "|_ "
                        + " _|");
        MAPS_OF_NUMBERS.put(NUMBERS.SIX.ordinal(),
                " _ "
                        + "|_ "
                        + "|_|");
        MAPS_OF_NUMBERS.put(NUMBERS.SEVEN.ordinal(),
                "__ "
                        + "  |"
                        + "  |");
        MAPS_OF_NUMBERS.put(NUMBERS.EIGHT.ordinal(),
                " _ "
                        + "|_|"
                        + "|_|");
        MAPS_OF_NUMBERS.put(NUMBERS.NINE.ordinal(),
                " _ "
                        + "|_|"
                        + " _|");
    }

    /**
     * Constructor private.
     */
    private BankOcr() {

    }

    /**
     * @param value used to obtain its int representation
     * @return "?" if the value is not in range 0-9 otherwise
     * return a number between 0 and 9.
     */
    private static String getKey(final String value) {
        String key = "?";
        for (Map.Entry<Integer, String> entry : MAPS_OF_NUMBERS.entrySet()) {
            if (entry.getValue().equals(value)) {
                key = entry.getKey().toString();
            }
        }
        return key;
    }

    /**
     * This method determines if an scanned numberAccount is between the paraments corrects.
     *
     * @param numberAccount image of type String.
     * @return <code>true</code> \\ <code>false</code>
     */
    private static boolean isCorrectLength(final String numberAccount) {
        if (numberAccount.length() == ACCOUNT_LENGTH && sizeImageIsValid(numberAccount)) {

            String[] acct = numberAccount.split("");

            int checksum = 0;
            int factor = MULTIPLY_FACTOR;

            for (String value : acct) {
                checksum += Integer.parseInt(value) * factor;
                factor--;
            }

            return checksum % MODULUS_FACTOR == 0;
        } else {
            return false;
        }
    }

    /**
     * This method validate if an account is correct or not.
     *
     * @param account String variable is the account to validate
     * @return true if the passed account is true, false otherwise.
     */
    static boolean validateNumberAccount(final String account) {
        int checksum = 0;
        int multi = MULTIPLY_FACTOR;
        for (char num : account.toString().toCharArray()) {
            checksum += Integer.parseInt(String.valueOf(num)) * multi;
            multi--;
        }
        return checksum % MODULUS_FACTOR == 0;
    }

    /**
     * This method is in charge to give one of three posibilities errors to the numberAccountUser".
     * "", "ERR" or "ILL"
     *
     * @param numberAccountUser String variable to determine its status.
     * @return an String result with the values mentioned earlier.
     */
    static String getNumberAccount(final String numberAccountUser) {
        String error = "";

        if (!isCorrectLength(numberAccountUser)) {
            error = "ILL";
        } else if (!validateNumberAccount(numberAccountUser)) {
            error = "ERR";
        }
        return error;
    }

    /**
     * This method returns the string representation of the scanned image.
     *
     * @param scannedImage array string.
     * @return String representation of scanned image.
     */
    static String numberAccountPresentImage(final String[] scannedImage) {
        StringBuilder actPresent = new StringBuilder();

        for (String number : scannedImage) {
            actPresent.append(getKey(number));
        }
        return actPresent.toString();
    }

    /**
     * This method validates if an scanned account has the correct digit
     * numbers.
     *
     * @param scannedAccount of String type.
     * @return true.
     */
    private static boolean sizeImageIsValid(final String scannedAccount) {
        return scannedAccount.length() == SCANNED_ACCOUNT_LENGTH;
    }

    /**
     * This enum type will contain the key values.
     */
    private enum NUMBERS {
        ZERO(0), ONE(1), TWO(2), THREE(3),
        FOUR(4), FIVE(5), SIX(6),
        SEVEN(7), EIGHT(8), NINE(9);

        /**
         * Construct for Enum type.
         *
         * @param i of int type.
         */
        NUMBERS(final int i) {
        }
    }
}
