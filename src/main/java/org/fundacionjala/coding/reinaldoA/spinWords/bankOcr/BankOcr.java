package org.fundacionjala.coding.reinaldoA.spinWords.bankOcr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 3/23/2017.
 */
public final class BankOcr {

    private static final int MODULUS_FACTOR = 11;
    private static final int CORRECT_ACCOUNT_LENGTH = 9;
    private static final int CORRECT_SCANNED_ACCOUNT_LENGTH = 72;
    private static final int MULTIPLY_FACTOR = 9;
    private static final int INDEX_MODULUS_FACTOR = 9;
    private static final int SUB_STRING_START = 0;
    private static final int SUB_STRING_END = 3;
    private static final Map<Integer, String> STRING_MAP = new HashMap<>();

    static {
        STRING_MAP.put(KEY.ZERO.ordinal(),
                " _ "
                        + "| |"
                        + "|_|");
        STRING_MAP.put(KEY.ONE.ordinal(),
                "   "
                        + "  |"
                        + "  |");
        STRING_MAP.put(KEY.TWO.ordinal(),
                " _ "
                        + " _|"
                        + "|_ ");
        STRING_MAP.put(KEY.THREE.ordinal(),
                "__ "
                        + " _|"
                        + "__|");
        STRING_MAP.put(KEY.FOUR.ordinal(),
                "   "
                        + "|_|"
                        + "  |");
        STRING_MAP.put(KEY.FIVE.ordinal(),
                " _ "
                        + "|_ "
                        + " _|");
        STRING_MAP.put(KEY.SIX.ordinal(),
                " _ "
                        + "|_ "
                        + "|_|");
        STRING_MAP.put(KEY.SEVEN.ordinal(),
                "__ "
                        + "  |"
                        + "  |");
        STRING_MAP.put(KEY.EIGHT.ordinal(),
                " _ "
                        + "|_|"
                        + "|_|");
        STRING_MAP.put(KEY.NINE.ordinal(),
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
     * @param value Maping the date in my contain
     * @return "?" if the value isnot digit,
     * return a number between 0 and 9.
     */
    private static String comparationKey(final String value) {
        String key = "?";
        for (Map.Entry<Integer, String> entry :STRING_MAP.entrySet()) {
            if (entry.getValue().equals(value)) {
                key = entry.getKey().toString();
            }
        }
        return key;
    }

    /**
     * This method take and scanned account of exactly 9 digits and return
     * an array representation of them.
     *
     * @param scannedAccount String, represents the account.
     * @return an array of nine string digits.
     */
    public static String[] parseScannedNumbers(final String scannedAccount) {

        String[] scannedDigits = {"", "", "", "", "", "", "", "", ""};

        if (!lengthScannedImageIsValid(scannedAccount)) {
            int index = 0;
            int start = SUB_STRING_START;
            int end = SUB_STRING_END;

            for (int i = 0; i < scannedAccount.length(); i += SUB_STRING_END) {
                index = index % INDEX_MODULUS_FACTOR;

                scannedDigits[index] += scannedAccount.substring(start, end);

                start = end;
                end += SUB_STRING_END;
                index++;
            }
        }
        return scannedDigits;
    }

    /**
     * This method determines if an scanned account is legible.
     *
     * @param account image of type String.
     * @return true or false
     */
    private static boolean isNumber(final String account) {
        boolean isCorrect = true;

        for (int i = 0; i < account.length(); i++) {
            if (!Character.isDigit(account.charAt(i))) {
                isCorrect = false;
                break;
            }
        }
        return  isCorrect;
    }

    /**
     * This method validate if an account is correct or not.
     *
     * @param account String variable is the account to validate
     * @return true if the passed account is true, false otherwise.
     */
    public static boolean validateAccount(final String account) {
        if (account.length() == CORRECT_ACCOUNT_LENGTH && isNumber(account)) {

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

        if (!isNumber(account)) {
            status = "ILL";
        } else if (!validateAccount(account)) {
            status = "ERR";
        }
        return status;
    }


    /**
     * @param linesScannedImage this is mi data insert lines
     * @return String return string in format digit
     */
    public static String accountRepresentation(final String[] linesScannedImage) {
        StringBuilder resultaRepresentation = new StringBuilder();

        for (String number :  linesScannedImage) {
            resultaRepresentation.append(comparationKey(number));
        }

        return  resultaRepresentation.toString();
    }

    /**
     * This method validates if an scanned account has the correct digit
     * numbers.
     *
     * @param scannedAccount of String type.
     * @return true.
     */
    private static boolean lengthScannedImageIsValid(final String scannedAccount) {
        return scannedAccount.length() == CORRECT_SCANNED_ACCOUNT_LENGTH;
    }
}
