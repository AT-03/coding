package org.fundacionjala.coding.Yuri.Katas;

/**
 * Created by YVayneR on 3/13/2017.
 */
public class EanCode {
    private String number;
    public static final int CONSTANT = 10;
    public static final int CONSTANT_ODD = 3;
    public static final int NUMBER_LAST_POSITION = 12;
    /**
     * this is constructor method.
     * @param number this is the number with 12 digits to verify the checksum
     */
    public EanCode(final String number) {
        this.number = number;
    }

    /**
     * this method helps to verify if the number typed is equal to 12 digits concat with checksum.
     * @return <code>true</code> if the number is valid.
     *         <code>false</code> otherwise
     */
    public boolean isValidCode() {
        return number.equals(removeChecksum().concat(calculateCheckSum()));
    }

    /**
     * this method helps to verify the checksum.
     * @return a string with the checksum value
     */
    public String calculateCheckSum() {
        int checkSum = CONSTANT - (getDigitsSum() % CONSTANT);
        return Integer.toString(checkSum);
    }

    /**
     * This method helps to sum the 11 digits , depends its position to multiply for 1 or 3.
     * @return the total sum of the 11 digits
     */
    public int  getDigitsSum() {
        int result = 0;
        for (int i = 0; i < removeChecksum().length(); i++) {
            if (i % 2 == 0) {
                result = result + (getSpecificDigit(i));
            } else {
                result = result + (getSpecificDigit(i) * CONSTANT_ODD);
            }
        }
        return result;
    }
    /**
     * this method helps to retrieve a digit of the number according a position value.
     * @param position this is the position of the character to be retrieved
     * @return the digit
     */
    public int getSpecificDigit(final int position) {
        return Character.getNumericValue(number.charAt(position));
    }

    /**
     * this method helps to remove the thirteen position of the number.
     * @return the number without the the thirteen position
     */
    public String removeChecksum() {
        return number.substring(0, NUMBER_LAST_POSITION);
    }
}
