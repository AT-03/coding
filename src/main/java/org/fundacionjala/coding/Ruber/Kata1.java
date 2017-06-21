package org.fundacionjala.coding.Ruber;

/**
 * Created by Ruber Cuellar on 2/24/2017.
 */
public final class Kata1 {
    private static final int NUMBERLIMIT = 5;
    /**
     * Constructor.
     */
    private Kata1() {
    }

    /**
     * This method divides a word.
     * @param text The test to divice
     * @return String[] with the words
     */
    public static String[] diviceWords(final String text) {
        return text.split(" ");
    }

    /**
     * To start divide the words.
     * @param text The sentence to divide.
     * @return String with the new sentence
     */
    public static String start(final String text) {
        String[] words = diviceWords(text);
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= NUMBERLIMIT) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}
