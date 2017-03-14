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
    /**
     * Constructor.
     */
    private AccountNumbers() {
    }

    private static Map numbers() {
        Map<String, Integer> numbers = new HashMap<>();
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
        return numbers;
    }

    public static void main(String args[])
    {
        AccountNumbers num = new AccountNumbers();
        Map<String, Integer> numbers  = num.numbers();
        if(numbers.containsKey(" _ " + "|_|" +"|_|_"))
        {
            System.out.println("true");

        }
    }
}
