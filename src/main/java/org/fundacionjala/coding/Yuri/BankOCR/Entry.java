package org.fundacionjala.coding.Yuri.BankOCR;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by YVayneR on 3/10/2017.
 */
public class Entry {
    private static final int NUMBER_SIZE = 9;
    private static final String ILLEGIBLE_NUMBER = "?";
    private static final int LINE_SIZE = 27;
    public static final int INCREMENT = 3;
    private String[] numbers;
    private static final Map<String, String> MAP = new HashMap<>();
    static {
        MAP.put(" _ | ||_|", "0");
        MAP.put("     |  |", "1");
        MAP.put(" _  _||_ ", "2");
        MAP.put(" _  _| _|", "3");
        MAP.put("   |_|  |", "4");
        MAP.put(" _ |_  _|", "5");
        MAP.put(" _ |_ |_|", "6");
        MAP.put(" _   |  |", "7");
        MAP.put(" _ |_||_|", "8");
        MAP.put(" _ |_| _|", "9");
    }

    /**
     *  This method helps to retrieve all the numbers that were sent on the three lines.
     * @param line1 the first line coded
     * @param line2 the second line coded
     * @param line3 the third line coded
     * @return the array with all lines coded
     */
    public String[] getNumbers(final String line1, final String line2, final String line3) {
        initializeArray();
        if (validLengthLines(line1, line2, line3)) {
            numbers = getValues(numbers, getCharacters(line1));
            numbers = getValues(numbers, getCharacters(line2));
            numbers = getValues(numbers, getCharacters(line3));
        }
        return numbers;
    }

    /**
     *  This method helps to verify that the three lines coded have the accurate length.
     * @param line1 the first line coded
     * @param line2 the second line coded
     * @param line3 the third line coded
     * @return <code>true</code> if the three lines have the accurate length.
     *         <code>false</code> otherwise
     */
    public boolean validLengthLines(final String line1, final String line2, final String line3) {
        return line1.length() == LINE_SIZE && line2.length() == LINE_SIZE && line3.length() == LINE_SIZE;
    }

    /**
     * this method helps to populate an array with values to decode.
     * @param values this array will contain all the values to decode
     * @param row this is the string line converted in array
     * @return all the values to decode the number.
     */
    public String[] getValues(final String[] values, final String[] row) {
        int accumulator = 0;
        int aux = INCREMENT;
        for (int i = 0; i < values.length; i++) {
            while (accumulator < aux) {
                values[i] += row[accumulator];
                accumulator++;
            }
        }
            aux += INCREMENT;

        return values;
    }

    /**
     * This method helps to divide a string.
     * @param line the line encoded
     * @return array filled with characters.
     */
    public String[] getCharacters(final String line) {
        return line.split("");
    }

    /**
     * this method helps to initialize the array of number to decode.
     */
    public void initializeArray() {
        numbers = new String[NUMBER_SIZE];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new String();
        }
    }

    /**
     * this method help to show the values in the numbers array.
     */
    public void showValues() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    /**
     * this method helps to decode the numbers coded.
     * @return the number decoded.
     */
    public String decodeValues() {
        String numberDecoded = "";
        for (int i = 0; i < numbers.length; i++) {
            if (MAP.get(numbers[i]) != null) {
                numberDecoded += MAP.get(numbers[i]);
            } else {
                numberDecoded += ILLEGIBLE_NUMBER;
            }
        }
        return numberDecoded;
    }

}
