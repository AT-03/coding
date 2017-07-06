package org.fundacionjala.coding.norman.banck_ocr;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class HistoryThreeErrFall extends HistoryTwoChecksum {

    /**
     * this is my constructor 12/03/2017.
     */
    public HistoryThreeErrFall() {
        super();
    }

    /**
     * @param dateNamber parameter.
     * @return ResultErrIll.
     * this is my constructor 12/03/2017.
     */
    public String verificateNumber(final String dateNamber) {
        return (dateNamber.matches("(.*)[?](.*)") ? "ILL" : (checkSumAcount(dateNamber) != 0) ? "ERR" : "OK");
    }
}
