package org.fundacionjala.coding.danielcabero.spinwords;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by administrator on 3/10/2017.
 */

final class SpinWords {

    private static final int MINIMAL_WORD = 5;

    /**
     * Constructor private.
     */
    private SpinWords() {
    }

    /**
     * @param text for the changes.
     * @return String changes places.
     */
    public static String spinWords(final String text) {
        return Arrays.stream(text.split(" "))
                .map(word -> word.length() >= MINIMAL_WORD ? new StringBuilder(word).reverse() : word)
                .collect(Collectors.joining(" "));
    }


}
