/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.org.fundacionjala.coding.BanckOCR;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Optimus
 */
public final class BankOCR {

    /**
     * This enum type will contain the key values.
     */
    private enum KEY {
        ZERO(0), 
        ONE(1), 
        TWO(2),
        THREE(3),
        FOUR(4), 
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9);

        /**
         * Construct for Enum type.
         *
         * @param i of int type.
         */
        KEY(final int i) {
        }
    }

    private static final int TOTAL_DIGITS = 11;
    private static final int CORRECT_LENGTH = 9;
    private static final int MULT_FACTOR = 9;
    private static final Map<Integer, String> NUMBERS = new HashMap<>();
    static {
        NUMBERS.put(KEY.ZERO.ordinal(),
                          " _ "
                        + "| |"
                        + "|_|");
        NUMBERS.put(KEY.ONE.ordinal(),
                          "  |"
                        + "  |"
                        + "  |");
        NUMBERS.put(KEY.TWO.ordinal(),
                          " _ "
                        + " _|"
                        + "|_ ");
        NUMBERS.put(KEY.THREE.ordinal(),
                          "__ "
                        + " _|"
                        + "__|");
        NUMBERS.put(KEY.FOUR.ordinal(),
                          "   "
                        + "|_|"
                        + "  |");
        NUMBERS.put(KEY.FIVE.ordinal(),
                          " __"
                        + "|__"
                        + " __|");
        NUMBERS.put(KEY.SIX.ordinal(),
                          " __"
                        + "|__"
                        + "|__|");
        NUMBERS.put(KEY.SEVEN.ordinal(),
                          "__ "
                        + "  |"
                        + "  |");
        NUMBERS.put(KEY.EIGHT.ordinal(),
                          " _ "
                        + "|_|"
                        + "|_|");
        NUMBERS.put(KEY.NINE.ordinal(),
                          " _ "
                        + "|_|"
                        + " _|");
    }
    /**
     * Constructor private.
     */
    private BankOCR() {
    }
    /**
     * @param value used to obtain its int representation
     * @return "?" if the value is not in range 0-9 otherwise
     * return a number between 0 and 9.
     */
    private static String getKey(final String value) {
        String key = "?";
        for (Map.Entry<Integer, String> entry : NUMBERS.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(value)) {
                key = entry.getKey().toString();
            }
        }
        return key;
    }
    /**
     * This method determines if an scanned account is legible.
     *
     * @param account image of type String.
     * @return true or false
     */
    private static boolean legible(final String account) {
        boolean Correct = true;

        for (int i = 0; i < account.length(); i++) {
            if (!Character.isDigit(account.charAt(i))) {
                Correct = false;
                break;
            }
        }
        return Correct;
    }
    /**
     * This method validate if an account is correct or not.
     *
     * @param account String variable is the account to validate
     * @return true if the passed account is true, false otherwise.
     */
    public static boolean validate(final String account) {
        if (account.length() == CORRECT_LENGTH && 
                legible(account)) {

            String[] acct = account.split("");

            int checksum = 0;
            int factor = MULT_FACTOR;

            for (String value : acct) {
                checksum += Integer.parseInt(value) * factor;
                factor--;
            }

            return checksum % TOTAL_DIGITS == 0;
        } else {
            return false;
        }
    }
    /**
     * This method is in charge to give one of three statues to the account".
     * "", "ERR" or "ILL"
     *
     * @param account String variable to determine its status.
     * @return an String result with the values mentioned earlier.
     */
    public static String getAccountStatus(final String account) {
        String status = "";

        if (!legible(account)) {
            status = "ILL";
        } else if (!validate(account)) {
            status = "ERR";
        }
        return status;
    }

    /**
     * This method returns the string representation of the scanned image.
     *
     * @param scannedImage array string.
     * @return String representation of scanned image.
     */
    public static String Representation(final String[] scannedImage) {
        StringBuilder acctRepresentation = new StringBuilder();

        for (String number : scannedImage) {
            acctRepresentation.append(getKey(number));
        }

        return acctRepresentation.toString();
    }
}
