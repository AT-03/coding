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
    private static final Map<String, String> NUMBERS = new HashMap<>();

    /**
     * Constructor.
     */
    private AccountNumbers() {
    }

    static {
        NUMBERS.put("   "
                + "  |"
                + "  |", "1");
        NUMBERS.put(" _ "
                + " _| "
                + "|_ ", "2");
        NUMBERS.put(" _ "
                + " _|"
                + " _|", "3");
        NUMBERS.put("   "
                + "|_|"
                + "  |", "4");
        NUMBERS.put(" _ "
                + "|_ "
                + " _|", "5");
        NUMBERS.put(" _ "
                + "|_ "
                + "|_|", "6");
        NUMBERS.put(" _ "
                + "  |"
                + "  |", "7");
        NUMBERS.put(" _ "
                + "|_|"
                + "|_|", "8");
        NUMBERS.put(" _ "
                + "|_|"
                + " _|", "9");
        NUMBERS.put(" _ "
                + "| |"
                + "|_|", "0");
    }

    /**
     * This method verifies if a entry exists.
     * @param entry The string to check
     * @return String containing the value
     */
    public static String exists(final String entry) {
        return NUMBERS.entrySet().stream().filter(num -> num.getKey().equals(entry))
            .map(num -> num.getValue()).findAny().orElse("?");
    }

    /**
     * This method converts an array String into String.
     * @param numbersRead String's array
     * @return String containing the number converted
     */
    public static StringBuilder convert(final String[] numbersRead) {
        StringBuilder numGenerated = new StringBuilder();
        if (numbersRead.length == ACCOUNT_LENGTH) {
            for (String read : numbersRead) {
                numGenerated.append(exists(read));
            }
        }
        return numGenerated;
    }

    /**
     * This method validate if a account is valid according to the checksum.
     * @param account The account's to validate
     * @return boolean with the validation
     */
    public static boolean validAccount(final StringBuilder account) {
        int checksum = 0;
        int multi = MULTIPLY;
        for (char num : account.toString().toCharArray()) {
            checksum += Integer.parseInt(String.valueOf(num)) * multi;
            multi--;
        }
        return checksum % DIV_CHECKSUM == 0;
    }

    /**
     * This method validate if the account is valid for checksum or if
     * it has an invalid number.
     * @param number The account's string to validate
     * @return String with validation
     */
    public static String validate(final StringBuilder number) {
        if (number.toString().contains("?")) {
                return String.format("%s ILL", number);
            } else if (!validAccount(number)) {
                return String.format("%s ERR", number);
            }
            return String.valueOf(number);
    }
}
