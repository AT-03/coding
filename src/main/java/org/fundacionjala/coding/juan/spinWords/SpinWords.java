package org.fundacionjala.coding.juan.spinWords;

/**
 * Created by Juan on 3/10/2017.
 */
public final class SpinWords {
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
        final int limitWord = 4;
        if (sentence == null) {
            return "";
        }
        if (sentence.length() <= limitWord) {
            return sentence;
        } else {
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > limitWord) {
                    words[i] = new StringBuilder(words[i]).reverse().toString();
                }
            }

            return String.join(" ", words);

        }
    }
}
