package org.fundacionjala.coding.juan.spinWords;

/**
 * Created by Juan on 3/10/2017.
 */
public final class SpinWords {
    private static final int LIMIT_WORD = 4;

    /**
     * Constructor private.
     */

    private SpinWords() {
        //no called
    }

    /**
     * Get the words spined if it have 5 or more letters.
     *
     * @param sentence is the word or words
     * @return the word reversed.
     */
    public static String spinWords(final String sentence) {

        if (sentence == null) {
            return "";
        }
        if (sentence.length() <= LIMIT_WORD) {
            return sentence;
        } else {
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > LIMIT_WORD) {
                    words[i] = new StringBuilder(words[i]).reverse().toString();
                }
            }
            return String.join(" ", words);

        }
    }
}
