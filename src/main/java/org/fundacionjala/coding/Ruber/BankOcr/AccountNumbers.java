package org.fundacionjala.coding.Ruber.BankOcr;

import java.util.HashMap;
import java.util.Map;

/**
 * Account Numbers class.
 * Created by Ruber Cuellar on 3/14/2017.
 */
public final class AccountNumbers {

    public static final int MULTIPLY = 9;
    public static final int ACCOUNT_LENGTH = 9;
    public static final int DIV_CHECKSUM = 11;
    private static Map<String, String> numbers = new HashMap<>();

    /**
     * Constructor.
     */
    private AccountNumbers() {
    }

    static {
        numbers.put("   "
                + "  |"
                + "  |", "1");
        numbers.put(" _ "
                + " _| "
                + "|_ ", "2");
        numbers.put(" _ "
                + " _|"
                + " _|", "3");
        numbers.put("   "
                + "|_|"
                + "  |", "4");
        numbers.put(" _ "
                + "|_ "
                + " _|", "5");
        numbers.put(" _ "
                + "|_ "
                + "|_|", "6");
        numbers.put(" _ "
                + "  |"
                + "  |", "7");
        numbers.put(" _ "
                + "|_|"
                + "|_|", "8");
        numbers.put(" _ "
                + "|_|"
                + " _|", "9");
        numbers.put(" _ "
                + "| |"
                + "|_|", "0");
    }

    /**
     * This method verifies if a entry exists.
     * @param entry The string to check
     * @return String containing the value
     */
    public static String exists(final String entry) {
        String value = "?";
        for (Map.Entry<String, String> num : numbers.entrySet()) {
            if (num.getKey().equals(entry)) {
                value = num.getValue();
            }
        }
        return value;
    }

    /**
     * This method converts an array String into String.
     * @param numbersRead String's array
     * @return String containing the number converted
     */
    public static StringBuffer convert(final String [] numbersRead) {
        StringBuffer numGenerated = new StringBuffer();
        if (validLength(numbersRead)) {
            for (String read : numbersRead) {
                numGenerated.append(exists(read));
            }
        }
        return numGenerated;
    }

    /**
     * This method validate the account length.
     * @param account The account's array string
     * @return boolean with validation
     */
    public static boolean validLength(final String [] account) {
        return account.length == ACCOUNT_LENGTH;
    }

    /**
     * This method validate if a account is valid according to the checksum.
     * @param account The account's to validate
     * @return boolean with the validation
     */
    public static boolean validAccount(final String account) {
        int checksum = 0;
        int multi = MULTIPLY;
        char[] charArray = account.toCharArray();
        for (char num : charArray) {
            int number = Integer.parseInt(String.valueOf(num)) * multi;
            checksum += number;
            multi--;
        }
        return checksum % DIV_CHECKSUM == 0;
    }

    /**
     * This method validate if the account is valid for checksum or if
     * it has an invalid number.
     * @param numbersRead The account's string to validate
     * @return String with validation
     */
    public static String validate(final String [] numbersRead) {
        String number = convert(numbersRead).toString();
        String result = "";
        if (number.contains("?")) {
                result = " ILL";
            } else {
            if (!validAccount(number)) {
                result = " ERR";
            }
        }
        //System.out.printf("%-10s %5s", number, result);
        return number + result;
    }
}
