package org.fundacionjala.coding.carlos;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        return Stream.of(sentence.split(SPACE_DELIMITER))
                .map(word -> word.length() >= LIMIT ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(SPACE_DELIMITER));
    }

}
