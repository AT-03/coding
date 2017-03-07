package org.fundacionjala.coding.reinaldoA;

/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 */
public final class SpinWords {

    private static final int LIMIT = 5;

    private static final String SPACE_DELIMITER = " ";

    /**
     * Constructor private.
     */
    private SpinWords() {
    }

    /**
     * Takes in a string of one or more words, and returns the same string,
     * but with all five or more letter words reversed.
     *
     * @param sentence String with words.
     * @return the same string, but with all five or more letter words reversed.
     */
    public static String spinWords(final String sentence) {
        StringBuilder spinWords = new StringBuilder();
        String[] word = sentence.split(SPACE_DELIMITER);
        for (String cadena : word) {
            spinWords.append(cadena.length() >= LIMIT ? new StringBuilder(cadena).reverse().toString() : cadena);
            spinWords.append(SPACE_DELIMITER);
        }
        return spinWords.toString().trim();
    }

}

