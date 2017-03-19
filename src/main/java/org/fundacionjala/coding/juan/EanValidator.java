package org.fundacionjala.coding.juan;

/**
 * @author Juan Pablo
 */
public final class EanValidator {
    /**
     * CONSTRUCTOR.
     */
    private EanValidator() {

    }
    /**
     * @param eanCode is the code provided as input.
     *                @return  the validation.
     */

    public static boolean validating(final String eanCode) {
        int sum = 0;
        int checksum = 0;
        final int finalNumber = 12;
        final int multiply = 3;
        final int finalFactor = 10;
        final int aux = 48;
        for (int i = 0; i < finalNumber; i++) {
            if (i % 2 != 0) {
                sum += ((eanCode.charAt(i) - aux) * multiply);
            } else {
                sum += (eanCode.charAt(i) - aux);
            }
        }
        if (sum % finalFactor !=0) {
            checksum = (finalFactor - (sum % finalFactor));
        }
        if (eanCode.charAt(eanCode.length() - 1) - aux == checksum) {
            return true;
        }
        return false;
    }
}
