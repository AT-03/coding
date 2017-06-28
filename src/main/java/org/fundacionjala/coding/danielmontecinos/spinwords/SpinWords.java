package org.fundacionjala.coding.danielmontecinos.spinwords;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Daniel Montecinos on 3/10/2017.
 */

final class SpinWords {

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
    static String spinWords(final String message) {
        return Arrays.stream(message.split(" "))
                .map(word -> word.length() >= MINIMAL_WORD_LENGTH ? new StringBuilder(word).reverse() : word)
                .collect(Collectors.joining(" "));
    }
}
