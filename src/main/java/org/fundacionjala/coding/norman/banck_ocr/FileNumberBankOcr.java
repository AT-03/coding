package org.fundacionjala.coding.norman.banck_ocr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class FileNumberBankOcr {
    private Map<Integer, String> numberMap;

    /**
     * constructor.
     */
    FileNumberBankOcr() {
        numberMap = new HashMap<Integer, String>();
        fillNumber();

    }

    /**
     * method fill number digite.
     */
    public void fillNumber() {
        numberMap.put(Digit.CERO.ordinal(),
                " _ "
                        + "| |"
                        + "|_|");
        numberMap.put(Digit.ONE.ordinal(),
                "  |"
                        + "  |"
                        + "  |");
        numberMap.put(Digit.TWO.ordinal(),
                " _ "
                        + " _|"
                        + "|_ ");
        numberMap.put(Digit.THREE.ordinal(),
                "__ "
                        + " _|"
                        + "__|");
        numberMap.put(Digit.FOUR.ordinal(),
                "   "
                        + "|_|"
                        + "  |");
        numberMap.put(Digit.FIVE.ordinal(),
                " __"
                        + "|__"
                        + " __|");
        numberMap.put(Digit.SIX.ordinal(),
                " __"
                        + "|__"
                        + "|__|");
        numberMap.put(Digit.SEVEN.ordinal(),
                "__ "
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
    public String comparation(final String lineNumber) {
        Iterator<Map.Entry<Integer, String>> it = numberMap.entrySet().iterator();
        String resulValue = "?";
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            if (entry.getValue().toString().equalsIgnoreCase(lineNumber)) {
                resulValue = entry.getKey().toString();
            }
        }

        return resulValue;
    }
}
