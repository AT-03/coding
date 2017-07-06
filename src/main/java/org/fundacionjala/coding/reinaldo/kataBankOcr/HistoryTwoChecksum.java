package org.fundacionjala.coding.reinaldo.kataBankOcr;

import java.util.Arrays;
import java.util.List;

/**
 * Created by reinaldo on 14/03/2017.
 */
public class HistoryTwoChecksum extends FileNumberBankOcr {

    private int multiplyByNine = 9;
    private static final int MODULUS_FACTOR = 11;

    /**
     * HistoryTwoChecksum.
     */
    public HistoryTwoChecksum() {
        super();
    }

    /**
     * @param accountNumber parameter.
     * @return int.
     */
    public int checkSumAcount(final String accountNumber) {
        List<String> listaCadena = Arrays.asList(accountNumber.split(""));
        int suma = 0;
        for (String dato : listaCadena) {
            suma += Integer.parseInt(dato) * multiplyByNine--;
        }
        return suma % MODULUS_FACTOR;

    }
}
