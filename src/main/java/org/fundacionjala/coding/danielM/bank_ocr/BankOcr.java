package org.fundacionjala.coding.danielM.bank_ocr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 3/10/2017.
 */
public final class BankOcr {

    /**
     * This enum type will contain the key values.
     */
    private enum KEY {
        ZERO(0), ONE(1), TWO(2), THREE(3),
        FOUR(4), FIVE(5), SIX(6),
        SEVEN(7), EIGHT(8), NINE(9);

        /**
         * Construct for Enum type.
         *
         * @param i of int type.
         */
        KEY(final int i) {
        }
    }

    private static final int MODULUS_FACTOR = 11;
    private static final int CORRECT_ACCOUNT_LENGTH = 9;
    private static final int MULTIPLY_FACTOR = 9;
    private static Map<Integer, String> stringMap = new HashMap<>();

    static {
        stringMap.put(KEY.ZERO.ordinal(),
                          " _ "
                        + "| |"
                        + "|_|");
        stringMap.put(KEY.ONE.ordinal(),
                          "  |"
                        + "  |"
                        + "  |");
        stringMap.put(KEY.TWO.ordinal(),
                          " _ "
                        + " _|"
                        + "|_ ");
        stringMap.put(KEY.THREE.ordinal(),
                          "__ "
                        + " _|"
                        + "__|");
        stringMap.put(KEY.FOUR.ordinal(),
                          "   "
                        + "|_|"
                        + "  |");
        stringMap.put(KEY.FIVE.ordinal(),
                          " __"
                        + "|__"
                        + " __|");
        stringMap.put(KEY.SIX.ordinal(),
                          " __"
                        + "|__"
                        + "|__|");
        stringMap.put(KEY.SEVEN.ordinal(),
                          "__ "
                        + "  |"
                        + "  |");
        stringMap.put(KEY.EIGHT.ordinal(),
                          " _ "
                        + "|_|"
                        + "|_|");
        stringMap.put(KEY.NINE.ordinal(),
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
        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
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
    private static boolean isLegible(final String account) {
        boolean isCorrect = true;

        for (int i = 0; i < account.length(); i++) {
            if (!Character.isDigit(account.charAt(i))) {
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }

    /**
     * This method validate if an account is correct or not.
     *
     * @param account String variable is the account to validate
     * @return true if the passed account is true, false otherwise.
     */
    public static boolean validateAccount(final String account) {
        if (account.length() == CORRECT_ACCOUNT_LENGTH && isLegible(account)) {

            String[] acct = account.split("");

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
     * This method is in charge to give one of three statues to the account".
     * "", "ERR" or "ILL"
     *
     * @param account String variable to determine its status.
     * @return an String result with the values mentioned earlier.
     */
    public static String getAccountStatus(final String account) {
        String status = "";

        if (!isLegible(account)) {
            status = "ILL";
        } else if (!validateAccount(account)) {
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
    public static String accountRepresentation(final String[] scannedImage) {
        StringBuilder acctRepresentation = new StringBuilder();

        for (String number : scannedImage) {
            acctRepresentation.append(getKey(number));
        }

        return acctRepresentation.toString();
    }
}
