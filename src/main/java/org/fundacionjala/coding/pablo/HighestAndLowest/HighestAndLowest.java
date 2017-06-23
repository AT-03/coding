package org.fundacionjala.coding.pablo.HighestAndLowest;


/**
 * Created by Administrator on 6/19/2017.
 */
public final class HighestAndLowest {

    /**
     * Constructor.
     */

    private HighestAndLowest() {
    }

    /**
     * Output string must be two numbers separated by a single space, and highest number is first.
     *
     * @param value value final.
     * @return Highest and lowest.
     */

    public static String highAndLow(final String value) {
        String[] s = value.split(" ");
        int valueMajor = Integer.parseInt(s[0]);
        int valueMinor = valueMajor;
        for (String value1 : s) {
            if (Integer.parseInt(value1) > valueMajor) {
                valueMajor = Integer.parseInt(value1);
            }
            if (Integer.parseInt(value1) < valueMinor) {
                valueMinor = Integer.parseInt(value1);
            }
        }

        return String.format("%d %d", valueMajor, valueMinor);

    }
}

