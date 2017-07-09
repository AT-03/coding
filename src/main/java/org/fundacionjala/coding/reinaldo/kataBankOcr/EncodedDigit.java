package org.fundacionjala.coding.reinaldo.kataBankOcr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by reinaldo on 08/07/2017.
 */
final class EncodedDigit {
    private Map<Integer, String> numberMap;

    /**
     * constructor.
     */
    private EncodedDigit() {
        numberMap = new HashMap<Integer, String>();
        fillNumber();

    }

    /**
     * method fill number digite.
     */
    private void fillNumber() {
        numberMap.put(Digit.CERO.ordinal(),
                " _ "
                        + "| |"
                        + "|_|");
        numberMap.put(Digit.ONE.ordinal(),
                "   "
                        + "  |"
                        + "  |");
        numberMap.put(Digit.TWO.ordinal(),
                " _ "
                        + " _|"
                        + "|_ ");
        numberMap.put(Digit.THREE.ordinal(),
                " _ "
                        + " _|"
                        + " _|");
        numberMap.put(Digit.FOUR.ordinal(),
                "   "
                        + "|_|"
                        + "  |");
        numberMap.put(Digit.FIVE.ordinal(),
                " _ "
                        + "|_ "
                        + " _|");
        numberMap.put(Digit.SIX.ordinal(),
                " _ "
                        + "|_ "
                        + "|_|");
        numberMap.put(Digit.SEVEN.ordinal(),
                " _ "
                        + "  |"
                        + "  |");
        numberMap.put(Digit.EIGHT.ordinal(),
                          " _ "
                        + "|_|"
                        + "|_|");
        numberMap.put(Digit.NINE.ordinal(),
                " _ "
                        + "|_|"
                        + " _|");
    }

    /**
     * @param lineNumber this is string parameter.
     * @return String.
     */
    static String comparation(final String lineNumber) {
        EncodedDigit encodedDigit = new EncodedDigit();
        Iterator<Map.Entry<Integer, String>> it = encodedDigit.numberMap.entrySet().iterator();
        String resulValue = "?";
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            if (entry.getValue().equalsIgnoreCase(lineNumber)) {
                return entry.getKey().toString();

            }
        }

        return resulValue;
    }
}

