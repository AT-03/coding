package org.fundacionjala.coding.Fernando.bankOCR;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by PC on 24/06/2017.
 */
public final class BankOCR {

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
    private static final Map<Integer, String> MAP = new HashMap<>();
    static final int VALIDATOR = 11;

    static {
        MAP.put(ZERO,
                " _ "
                        + "| |"
                        + "|_|");
        MAP.put(ONE,
                "   "
                        + "  |"
                        + "  |");
        MAP.put(TWO,
                " _ "
                        + " _|"
                        + "|_ ");
        MAP.put(THREE,
                "__ "
                        + " _|"
                        + "__|");
        MAP.put(FOUR,
                "   "
                        + "|_|"
                        + "  |");
        MAP.put(FIVE,
                " _ "
                        + "|_ "
                        + " _|");
        MAP.put(SIX,
                " _ "
                        + "|_ "
                        + "|_|");
        MAP.put(SEVEN,
                "__ "
                        + "  |"
                        + "  |");
        MAP.put(EIGHT,
                " _ "
                        + "|_|"
                        + "|_|");
        MAP.put(NINE,
                " _ "
                        + "|_|"
                        + " _|");
    }

    /**
     * Constructor bankOCR.
     */
    private BankOCR() {

    }

    /**
     * @param value of string numbers.
     * @return String of value number.
     */
    private static String getMapKey(final String value) {
        String res = "?";
        for (Map.Entry<Integer, String> entry : MAP.entrySet()) {
            if (entry.getValue().equals(value)) {
                res = entry.getKey().toString();
            }
        }
        return res;
    }

    /**
     * @param cad value of string numbers.
     * @return String to get the all numbers.
     */
    public static String parseDigit(final String[] cad) {
        String res = "";
        StringBuilder value = new StringBuilder();
        for (String data : cad) {
            String key = getMapKey(data);
            res = value.append(key).toString();
        }

        return res;
    }

    /**
     * @param cad value of string numbers.
     * @return String to get the ERR o ILL error result.
     */
    public static String accountStatus(final String cad) {
        String res = "";
        if (!digit(cad)) {
            res = "ILL";
        } else if (!validAccountNumbers(cad)) {
            res = "ERR";
        }
        return res;
    }

    /**
     * @param data value of string numbers.
     * @return boolean to get if is a valid digit.
     */
    private static boolean digit(final String data) {
        return Stream.of(data.split("")).
                filter(a -> Character.isDigit(a.charAt(0))).count() > 0;
    }

    /**
     * @param input String value.
     * @return boolean valor if is valid account number.
     */
    public static boolean validAccountNumbers(final String input) {
        int suma = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int multiplier = 1;
            int x = (int) (input.charAt(i)) * multiplier;
            suma += x;
            multiplier++;
        }
        return suma % VALIDATOR == 0;
    }

}

