package org.fundacionjala.coding.pablo.BankOCR;

import static org.fundacionjala.coding.pablo.BankOCR.BankOCRUserStory1.getKey;

/**
 * Created by Administrator on 7/3/2017.
 */
public final class BankOCRUserStory2 {

    private static final int MODULE_ELEVEN = 11;
    private static final int QUANTITY_LENGTH = 9;

    /**
     * Constructor.
     */
    private BankOCRUserStory2() {
    }

    /**
     * This method validate account numbers.
     *
     * @param account quantity.
     * @return true or false.
     */
    static boolean validateAccountNumbers(final String account) {
        int sum = 0;
        int factorMultiple = 9;
        if ((account.length() == QUANTITY_LENGTH) && isLegible(account)) {
            String[] accountSplit = account.split("");

            for (String value : accountSplit) {
                sum += Integer.parseInt(value) * factorMultiple;
                factorMultiple--;
            }

            if ((sum % MODULE_ELEVEN) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to validate if value is legible.
     *
     * @param account account.
     * @return true or false.
     */
    protected static boolean isLegible(final String account) {

        for (int i = 0; i < account.length(); i++) {
            if (!Character.isDigit(account.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method return the value scanned.
     *
     * @param scanned value scanned.
     * @return value string.
     */
    static String accountRepresentation(final String[] scanned) {
        StringBuilder acctRepresentation = new StringBuilder();

        for (String string : scanned) {
            acctRepresentation.append(getKey(string));
        }

        return String.valueOf(acctRepresentation);
    }
}
