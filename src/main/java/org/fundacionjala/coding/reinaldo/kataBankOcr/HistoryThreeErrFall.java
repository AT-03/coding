package org.fundacionjala.coding.reinaldo.kataBankOcr;

/**
 * Created by reinaldo on 14/03/2017.
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
