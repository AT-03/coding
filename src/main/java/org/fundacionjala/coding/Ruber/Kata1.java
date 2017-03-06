package org.fundacionjala.coding.Ruber;

/**
 * Created by Ruber Cuellar on 2/24/2017.
 */
public final class Kata1 {
    private static String text;

    private static final int NUMBERLIMIT = 5;
    /**
     * Constructor.
     */
    private Kata1() {
    }

    /**
     * This method divides a word.
     * @return String[] with the words
     */
    public static String[] diviceWords() {
        return text.split(" ");
    }

    /**
     * This method counts the number of characters.
     * @param word The word to count
     * @return boolean with the verification
     */
    public static boolean count(final String word) {
        return word.length() >= NUMBERLIMIT;
    }

    /**
     * To reverse the word.
     * @param word The word to reverse
     * @return String with the word reversed
     */
    public static String reverse(final String word) {
        StringBuilder builder = new StringBuilder(word);
        return builder.reverse().toString();
    }

    /**
     * To start divide the words.
     * @param text The sentence to divide.
     * @return String with the new sentence
     */
    public static String start(final String text) {
        Kata1.text = text;
        String[] words = diviceWords();
        for (int i = 0; i < words.length; i++) {
            if (count(words[i])) {
                words[i] = reverse(words[i]);
            }
        }
        return String.join(" ", words);
    }
}
