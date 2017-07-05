package org.fundacionjala.coding.Fernando.checkSum;

/**
 * Write a description of class checkSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckSum {
    static final int THREE = 3;
    static final int ONE = 1;
    static final int TEN = 10;
    static final int TWO = 2;
    static final int EIGHT = 8;
    static final int ZERO = 0;
    static final int SIZEVALUE = 13;

    /**
     * @param value data.
     * @return boolean of cant values.
     */
    public boolean canValues(final String value) {
        int sum = ZERO;
        if (value.length() != SIZEVALUE) {
            return false;
        }
            for (int i = ONE; i < value.length(); i++) {
                int num = Character.getNumericValue(value.charAt(i - 1));
                sum += i % 2 == 0 ? num * THREE : num;
            }
            return validNum(sum) == Character.getNumericValue(value.charAt(value.length() - 1));
    }
    /**
     * @param sum of values.
     * @return int of number valid.
     */
    public int validNum(final int sum) {
        int result = sum % TEN;
        return result != 0 ? TEN - result : 0;

    }

}
