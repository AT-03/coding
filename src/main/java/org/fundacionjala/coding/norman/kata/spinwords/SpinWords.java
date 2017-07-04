package org.fundacionjala.coding.norman.kata.spinwords;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by NORMAN on 2/7/2017.
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
