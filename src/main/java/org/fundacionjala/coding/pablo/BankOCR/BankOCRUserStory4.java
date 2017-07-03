package org.fundacionjala.coding.pablo.BankOCR;

/**
 * Created by Administrator on 7/3/2017.
 */
public final class BankOCRUserStory4 {

    private static final int SCANNED_LENGTH = 72;

    /**
     * Constructor.
     */
    private BankOCRUserStory4() {

    }


    /**
     * This method scans an image and returns it in string.
     *
     * @param account account.
     * @return string[] with nine digits.
     */
    static String[] parseScannedFigures(final String account) {

        String[] scannedDigits = {"", "", "", "", "", "", "", "", ""};
        int stringFinal = 3;

        if (account.length() != SCANNED_LENGTH) {
            int index = 0;
            int start = 0;
            int end = 3;
            int indexModule = 9;

            for (int i = 0; i < account.length(); i += stringFinal) {
                index = index % indexModule;

                scannedDigits[index] += account.substring(start, end);

                start = end;
                end += stringFinal;
                index++;
            }

            return scannedDigits;
        }
        return new String[]{"", "", "", "", "", "", "", "", ""};
    }
}
