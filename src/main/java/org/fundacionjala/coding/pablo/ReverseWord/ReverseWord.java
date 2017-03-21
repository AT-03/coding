package org.fundacionjala.coding.pablo.ReverseWord;

/**
 * Created by Administrator on 3/14/2017.
 */
public final class ReverseWord {

    public static final int ULTIMATE = 5;

    /**
     * Constructor.
     */

    private ReverseWord() {
    }

    /**
     * It takes a string of one or more words, returns the same string to words that
     * have less than five characters and inverts them to the largest of five.
     */

    /**
     *
     * @param reverseString Message String of one or more words.
     * @return String with inverted words and words without inverting.
     */

    public static String reverseWord(final String reverseString) {
        String[] splitWord = reverseString.split(" ");

        for (int i = 0; i < splitWord.length; i++) {
            splitWord[i] = (splitWord[i].length() >= ULTIMATE)
                    ? new StringBuilder(splitWord[i]).reverse().toString() : splitWord[i].toString();
        }

        return String.join(" ", splitWord);
    }
}
