package org.fundacionjala.coding.Ruber.BankOcr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ruber Cuellar on 3/14/2017.
 */
public class AccountNumbers {

    public static final int NUMBERS = 9;
    public static final int COL = 3;
    public static final int FIL = 3;
    public static Map<String, Integer> numbers = new HashMap<>();
    /**
     * Constructor.
     */
    private AccountNumbers() {
    }

    static {
        numbers.put("   " +
                "  |" +
                "  |", 1);
        numbers.put(" _ " +
                " _| " +
                "|_ ", 2);
        numbers.put(" _ " +
                " _|" +
                " _|", 3);
        numbers.put("   " +
                "|_|" +
                "  |", 4);
        numbers.put(" _ " +
                "|_ " +
                " _|",5);
        numbers.put(" _ " +
                "|_ " +
                "|_|",6);
        numbers.put(" _ " +
                "  |" +
                "  |",7);
        numbers.put(" _ " +
                "|_|" +
                "|_|", 8);
        numbers.put(" _ " +
                "|_|" +
                " _|",9);
        numbers.put(" _ " +
                "| |" +
                "|_|",0);
    }

    public static int exists(final String entry) {
        for(Map.Entry<String, Integer> num : numbers.entrySet())
        {
            if(num.getKey().equals(entry)) {
                return num.getValue();
            }
        }
        return Integer.parseInt(null);
    }

    public static String parse(String [] numbersRead) {
        String numGenerated = "";
        for (String read : numbersRead)
        {
            numGenerated += exists(read);
        }
        return numGenerated;
    }

    public static void main(String args[])
    {

        AccountNumbers num = new AccountNumbers();
        String [] numbersRead = {" _ "
                + "| |"
                +"|_|", " _ " +
                "|_|" +
                " _|", " _ " +
                " _|" +
                " _|"};
        System.out.println(num.parse(numbersRead));




    }


}
