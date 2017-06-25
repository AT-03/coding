package org.fundacionjala.coding.Fernando.haghestandlowest;

/**
 * Created by PC on 24/06/2017.
 */
public final class HighAndLow {

    /**
     * Method constructor.
     */
    private HighAndLow() {
    }

    /**
     * This method get the high and low number.
     *
     * @param numbers to get the high and low number.
     * @return String method.
     */
    static String highAndLowest(final String numbers) {
        String[] value = numbers.split(" ");
        int majorNumber = Integer.parseInt(value[0]);
        int minorNumber = majorNumber;
        for (String res : value) {
            int num = Integer.parseInt(res);
            if (num > majorNumber) {
                majorNumber = Integer.parseInt(res);
            }
            if (num < minorNumber) {
                minorNumber = Integer.parseInt(res);
            }
        }

        return String.format("%d %d", majorNumber, minorNumber);
    }
}
