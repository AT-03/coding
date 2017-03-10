package org.fundacionjala.coding.danielM;

/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 */
public final class SpinWords {

    private static final int MINIMAL_WORD_LENGTH = 5;

    /**
     * Constructor private.
     */
    private SpinWords() {
    }

    /**
     * Takes an String of one or more words, returns the same String but
     * if with the words reversed if it has five or more characters.
     *
     * @param message String with one or more words.
     * @return the same String but with reversed words if its length is 5 or more.
     */
    public static String spinWords(final String message) {
        String[] spinMessage = message.split(" ");

        for (int i = 0; i < spinMessage.length; i++) {
            if (spinMessage[i].length() >= MINIMAL_WORD_LENGTH) {
                spinMessage[i] = new StringBuilder(spinMessage[i]).reverse().toString();
            }
        }

        return String.join(" ", spinMessage);
    }
}
