package org.fundacionjala.coding.reinaldo.kataBankOcr;

import java.util.Arrays;
import java.util.List;

/**
 * Created by reinaldo on 08/07/2017.
 */
final class BankOcrKata {
    private static final int MODULUS_FACTOR = 11;
    private static final int INCREMENT_BY_THREE = 3;
    private static final int TAM_CHARACTERS = 26;

    /**
     * This is the constructor bankOcrKata.
     */
    private BankOcrKata() {
    }

    /**
     * This method decode a List<String>.
     *
     * @param listAccountNumber listAccount
     * @return String list
     */
    static String decode(final List<String> listAccountNumber) {
        int charsPerCharacter = INCREMENT_BY_THREE;
        int index = 0;
        StringBuilder accountNumber = new StringBuilder();

        while (index <= TAM_CHARACTERS) {

            accountNumber.append(EncodedDigit.comparation(getDigitString(listAccountNumber, charsPerCharacter, index)));
            charsPerCharacter += INCREMENT_BY_THREE;
            index += INCREMENT_BY_THREE;

        }

        return accountNumber.toString();
    }

    /**
     * This method return the a digite in strings for found on map.
     *
     * @param listAccountNumber listAccount
     * @param charsPerCharacter charsper
     * @param index             index
     * @return String string
     */
    private static String getDigitString(final List<String> listAccountNumber,
                                         final int charsPerCharacter, final int index) {
        return String.format("%s%s%s",
                listAccountNumber.get(0).substring(index, charsPerCharacter),
                listAccountNumber.get(1).substring(index, charsPerCharacter),
                listAccountNumber.get(2).substring(index, charsPerCharacter));
    }


    /**
     * @param dateNamber parameter.
     * @return ResultErrIll.
     * this is my constructor 12/03/2017.
     */
    static String codeCheck(final String dateNamber) {
        return (dateNamber.matches("(.*)[?](.*)") ? "ILL" : (checkSumAcount(dateNamber) != 0) ? "ERR" : "OK");
    }

    /**
     * @param accountNumber parameter.
     * @return int.
     */
    static int checkSumAcount(final String accountNumber) {

        int multiplyByNine = 9;
        List<String> listAcountNumber = Arrays.asList(accountNumber.split(""));
        int suma = 0;

        for (String wordItem : listAcountNumber) {
            suma += Integer.parseInt(wordItem) * multiplyByNine--;
        }

        return suma % MODULUS_FACTOR;
    }

}
