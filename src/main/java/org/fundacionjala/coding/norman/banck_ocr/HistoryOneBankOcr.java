package org.fundacionjala.coding.norman.banck_ocr;

import java.util.List;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class HistoryOneBankOcr extends FileNumberBankOcr {
    /**
     * This is my constructor BankOCR.
     */
    public HistoryOneBankOcr() {
        super();

    }

    /**
     * @param lines this is mi data insert lines.
     * @return String return string in format digit.
     * change y
     */
    public String verificationLineNumber(final List<String> lines) {
        StringBuilder resulta = new StringBuilder();
        for (String line : lines) {
            resulta.append(super.comparation(line));
        }
        return resulta.toString();
    }
}
