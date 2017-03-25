package org.fundacionjala.coding.Fernando.BankOCR;

import java.util.ArrayList;


/**
 * Class EntryParser.
 */
public class EntryParser {
    private String line1, line2, line3;
    static final int VAR_CARACT = 3;
    static final int POS = 4;
    static final int VALOR = 48;
    static final int VALIDATOR = 11;

    /**
     * @param input recibe an ArrayList<String>.
     */
    public void getLines(final ArrayList<String> input) {
        line1 = input.get(0);
        line2 = input.get(1);
        line3 = input.get(2);
    }

    /**
     * @param top recibe a String.
     * @param mid recibe a String.
     * @param bot recibe a String.
     * @return String valor.
     */
    public String generateNumber(final String top, final String mid, final String bot) {
        if (top.equals("   ")
                && mid.equals("  |")
                && bot.equals("  |")) {
            return "1";
        } else if (top.equals(" _ ")
                && mid.equals(" _|")
                && bot.equals("|_ ")) {
            return "2";
        } else if (top.equals(" _ ")
                && mid.equals(" _|")
                && bot.equals(" _| ")) {
            return "3";
        } else if (top.equals("   ")
                && mid.equals("|_|")
                && bot.equals("  |")) {
            return "4";
        } else if (top.equals(" _ ")
                && mid.equals("|_ ")
                && bot.equals(" _|")) {
            return "5";
        } else if (top.equals(" _ ")
                && mid.equals("|_ ")
                && bot.equals("|_|")) {
            return "6";
        } else if (top.equals(" _ ")
                && mid.equals("  |")
                && bot.equals("  |")) {
            return "7";
        } else if (top.equals(" _ ")
                && mid.equals("|_|")
                && bot.equals("|_|")) {
            return "8";
        } else if (top.equals(" _ ")
                && mid.equals("|_|")
                && bot.equals(" _|")) {
            return "9";
        } else if (top.equals(" _ ")
                && mid.equals("| |")
                && bot.equals("|_|")) {
            return "0";
        }
        return "?";
    }

    /**
     * @param top recibe a String.
     * @param mid recibe a String.
     * @param bot recibe a String.
     * @return String valor.
     * para optener cada numero
     */
    public String parseDigit(final String top, final String mid, final String bot) {
        String output = "";
        if (top.length() < mid.length()) {
            //top = top + " ";
            for (int i = 0; i < top.length(); i += VAR_CARACT) {

                String topChar = top.substring(i, i + VAR_CARACT);
                String midChar = mid.substring(i, i + VAR_CARACT);
                String botChar = bot.substring(i, i + VAR_CARACT);

                output = output + generateNumber(topChar, midChar, botChar);
            }
        }
        return output;
    }

    /**
     * @param entry recibe a String.
     * @return ArrayList valor.
     */
    public ArrayList<String> parseEntry(final ArrayList<String> entry) {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 0; i < entry.size(); i += POS) {
            String top = entry.get(i);
            String mid = entry.get(i + 1);
            String button = entry.get(i + 2);

            if (validAccountNumbers(parseDigit(top, mid, button))) {
                output.add(parseDigit(top, mid, button));
            } else if (parseDigit(top, mid, button).contains("?")) {
                output.add(parseDigit(top, mid, button) + "ILL");
            } else {
                output.add(parseDigit(top, mid, button) + "ERR");
            }
        }
        return output;
    }

    /**
     * @param input recibe a String.
     * @return boolean valor.
     */
    public boolean validAccountNumbers(final String input) {
        int suma = 0;
        for (int i = input.length() - 1, multiplier = 1; i >= 0; i--, multiplier++) {
            int x = (int) (input.charAt(i) - VALOR) * multiplier;
            suma = suma + x;
        }
        if (suma % VALIDATOR == 0) {
            return true;
        }
        return false;
    }
}
