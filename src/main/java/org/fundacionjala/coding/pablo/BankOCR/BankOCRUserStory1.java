package org.fundacionjala.coding.pablo.BankOCR;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Administrator on 3/23/2017.
 */
public final class BankOCRUserStory1 {
    private static Map<Integer, String> mapNum = new HashMap<>();

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
        mapNum.put(ZERO,
                " _ "
                        + "| |"
                        + "|_|");
        mapNum.put(ONE,
                "   "
                        + "  |"
                        + "  |");

        mapNum.put(TWO,
                " _ "
                        + " _|"
                        + "|_ ");

        mapNum.put(THREE,
                "__ "
                        + " _|"
                        + "__|");

        mapNum.put(FOUR,
                "   "
                        + "|_|"
                        + "  |");

        mapNum.put(FIVE,
                " _"
                        + "|_ "
                        + " _|");

        mapNum.put(SIX,
                " _ "
                        + "|_ "
                        + "|_|");

        mapNum.put(SEVEN,
                " _ "
                        + "  |"
                        + "  |");
        mapNum.put(EIGHT,
                " _ "
                        + "|_|"
                        + "|_|");

        mapNum.put(NINE,
                " _ "
                        + "|_|"
                        + " _|");
    }

    /**
     * Constructor.
     */

    protected BankOCRUserStory1() {

    }

    /**
     *
     * @param value to get int.
     * @return characters in a range 0-9
     */

    private static String getKey(final String value) {
        String valueString = "?";
        for (Map.Entry<Integer, String> inputData : mapNum.entrySet()) {
            valueString = inputData.getValue().equalsIgnoreCase(value)
                    ? inputData.getKey().toString() : valueString;
        }
        return valueString;
    }

    /**
     *
     * @param numberScanned String
     * @return true or false
     */

    public static String numberConvertedToString(final String[] numberScanned) {
        StringBuilder imageToString = new StringBuilder();

        for (String numberString : numberScanned) {
            imageToString.append(getKey(numberString));
        }

        return imageToString.toString();
    }
}
