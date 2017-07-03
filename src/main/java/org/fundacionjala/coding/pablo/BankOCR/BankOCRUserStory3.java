package org.fundacionjala.coding.pablo.BankOCR;

import static org.fundacionjala.coding.pablo.BankOCR.BankOCRUserStory2.isLegible;
import static org.fundacionjala.coding.pablo.BankOCR.BankOCRUserStory2.validateAccountNumbers;

/**
 * Created by Administrator on 7/3/2017.
 */
public final class BankOCRUserStory3 {

    /**
     * Constructor.
     */
    private BankOCRUserStory3() {

    }

    /**
     * Get status account.
     * @param account account.
     * @return ILL if isn't legible and ERR if not validate accounts numbers.
     */
    static String getStatusAccount(final String account) {
        if (!isLegible(account)) {
            return "ILL";
        } else if (!validateAccountNumbers(account)) {
            return "ERR";
        }
        return "";
    }
}
