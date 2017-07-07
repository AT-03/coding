package org.fundacionjala.coding.juan.eanvalidator;

/**
 * @author Juan Pablo
 */
public final class EanValidator {
    /**
     * constructor.
     */
    private EanValidator() {

    }

    /**
     * @param eanCode is the code provided as input.
     * @return the validation.
     */
    public static boolean validating(final String eanCode) {
        char[] code = eanCode.toCharArray();
        int checkSum = 0;
        int digit = 0;
        for (int i = 0; i < code.length; i++) {
            digit = (code[i]);
            checkSum += ((i + 1) % 2 == 0) ? digit * 3 : digit;
        }
        digit = (code[code.length - 1]);
        return checkSum % 10 == 0 || 10 - (checkSum % 10) == digit;
    }
}
