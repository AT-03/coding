package org.fundacionjala.coding.juan.bank;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Juan P  on 26/03/2017.
 */
public final class BankOCR {

    private static final Map<Integer, String> MAP_NUMBERS = new HashMap<>();

    private static final int START_STRING = 0;
    private static final int END_STRING = 3;
    private static final int MODULE_NINE = 9;
    private static final int MODULE_ELEVEN = 11;
    private static final int SCANNED_LENGTH = 72;
    private static final int QUANTITY_LENGTH = 9;

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;

    static {
        MAP_NUMBERS.put(ZERO,
                " _ "
                        + "| |"
                        + "|_|");
        MAP_NUMBERS.put(ONE,
                "   "
                        + "  |"
                        + "  |");

        MAP_NUMBERS.put(TWO,
                " _ "
                        + " _|"
                        + "|_ ");

        MAP_NUMBERS.put(THREE,
                "__ "
                        + " _|"
                        + "__|");

        MAP_NUMBERS.put(FOUR,
                "   "
                        + "|_|"
                        + "  |");

        MAP_NUMBERS.put(FIVE,
                " _"
                        + "|_ "
                        + " _|");

        MAP_NUMBERS.put(SIX,
                " _ "
                        + "|_ "
                        + "|_|");

        MAP_NUMBERS.put(SEVEN,
                " _ "
                        + "  |"
                        + "  |");
        MAP_NUMBERS.put(EIGHT,
                " _ "
                        + "|_|"
                        + "|_|");

        MAP_NUMBERS.put(NINE,
                " _ "
                        + "|_|"
                        + " _|");
    }

    /**
     * Constructor.
     */

    private BankOCR() {

    }

    /**
     * @param value to get int.
     * @return characters in a range 0-9
     */

    private static String getKey(final String value) {
        String valueString = "?";
        for (Map.Entry<Integer, String> inputData : MAP_NUMBERS.entrySet()) {
            valueString = inputData.getValue().equalsIgnoreCase(value)
                    ? inputData.getKey().toString() : valueString;
        }
        return valueString;
    }

    /**
     * @param numberScanned String
     * @return true or false
     */

    public static String convertStringToNumber(final String[] numberScanned) {
        StringBuilder imageToString = new StringBuilder();

        for (String numberString : numberScanned) {
            imageToString.append(getKey(numberString));
        }
        return imageToString.toString();
    }

    /**
     * This method validate account MAP_NUMBERS.
     *
     * @param account quantity.
     * @return true or false.
     */

    static boolean validateAccountNumbers(final String account) {
        int sum = 0;
        int factorMultiple = 9;
        if ((account.length() == QUANTITY_LENGTH) && isLegible(account)) {
            String[] accountSplit = account.split("");

            for (String value : accountSplit) {
                sum += Integer.parseInt(value) * factorMultiple;
                factorMultiple--;
            }
            return sum % MODULE_ELEVEN == 0;
        }
        return false;
    }

    /**
     * Method to validate if value is legible.
     *
     * @param account account.
     * @return true or false.
     */
    static boolean isLegible(final String account) {

        for (int i = 0; i < account.length(); i++) {
            if (!Character.isDigit(account.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method return the value scanned.
     *
     * @param scanned value scanned.
     * @return value string.
     */
    static String accountRepresentation(final String[] scanned) {
        StringBuilder acctRepresentation = new StringBuilder();

        for (String string : scanned) {
            acctRepresentation.append(getKey(string));
        }

        return String.valueOf(acctRepresentation);
    }

    /**
     * Get status account.
     *
     * @param account account.
     * @return ILL if isn't legible and ERR if not validate accounts MAP_NUMBERS.
     */
    static String getStatusAccount(final String account) {
        return !isLegible(account) ? "ILL" : !validateAccountNumbers(account) ? "ERR" : " ";
    }

    /**
     * This method scans an image and returns  string.
     *
     * @param account account.
     * @return string[] with nine digits.
     */
    static String[] parseScannedString(final String account) {

        String[] scannedDigits = {"", "", "", "", "", "", "", "", ""};
        int stringFinal = 3;

        if (account.length() != SCANNED_LENGTH) {
            int index = 0;
            int start = START_STRING;
            int end = END_STRING;
            int indexModule = MODULE_NINE;

            for (int i = 0; i < account.length(); i += stringFinal) {
                index = index % indexModule;

                scannedDigits[index] += account.substring(start, end);

                start = end;
                end += stringFinal;
                index++;
            }

            return scannedDigits;
        }
        return scannedDigits;
    }
}


