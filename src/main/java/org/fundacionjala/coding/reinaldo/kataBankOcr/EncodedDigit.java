package org.fundacionjala.coding.reinaldo.kataBankOcr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by reinaldo on 08/07/2017.
 */
final class EncodedDigit {
    private static final Map<Integer, String> MUMBER_MAP;

    /**
     * constructor.
     */
    private EncodedDigit() {
    }

    /**
     * method fill number digite.
     */
    static {

        MUMBER_MAP = new HashMap<Integer, String>();
        MUMBER_MAP.put(Digit.CERO.ordinal(),
                " _ "
                        + "| |"
                        + "|_|");
        MUMBER_MAP.put(Digit.ONE.ordinal(),
                "   "
                        + "  |"
                        + "  |");
        MUMBER_MAP.put(Digit.TWO.ordinal(),
                " _ "
                        + " _|"
                        + "|_ ");
        MUMBER_MAP.put(Digit.THREE.ordinal(),
                " _ "
                        + " _|"
                        + " _|");
        MUMBER_MAP.put(Digit.FOUR.ordinal(),
                "   "
                        + "|_|"
                        + "  |");
        MUMBER_MAP.put(Digit.FIVE.ordinal(),
                " _ "
                        + "|_ "
                        + " _|");
        MUMBER_MAP.put(Digit.SIX.ordinal(),
                " _ "
                        + "|_ "
                        + "|_|");
        MUMBER_MAP.put(Digit.SEVEN.ordinal(),
                " _ "
                        + "  |"
                        + "  |");
        MUMBER_MAP.put(Digit.EIGHT.ordinal(),
                " _ "
                        + "|_|"
                        + "|_|");
        MUMBER_MAP.put(Digit.NINE.ordinal(),
                " _ "
                        + "|_|"
                        + " _|");
    }

    /**
     * @param lineNumber this is string parameter.
     * @return String.
     */
    static String comparation(final String lineNumber) {
        Iterator<Map.Entry<Integer, String>> it = MUMBER_MAP.entrySet().iterator();
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


