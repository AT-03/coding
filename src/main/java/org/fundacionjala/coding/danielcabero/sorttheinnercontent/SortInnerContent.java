package org.fundacionjala.coding.danielcabero.sorttheinnercontent;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by  administrator on 6/20/2017.
 */

final class SortInnerContent {

    private static final int LIMIT = 3;

    /**
     * Private Constructor.
     */
    private SortInnerContent() {
    }

    /**
     * The method returns a new String with all the inner content of each one,
     * sorted in a descending way.
     *
     * @param words of String type.
     * @return all the words sorted in descending way joined by a space.
     */
    static String sortTheInnerContent(final String words) {
        return Arrays.stream(words.split(" "))
                .map(word -> word.length() < LIMIT ? word : sortWord(word))
                .collect(Collectors.joining(" "));
    }

    /**
     * The method reverse the inner content of a word.
     *
     * @param word of String type.
     * @return the inner word sorted.
     */
    private static String sortWord(final String word) {
        String[] characters = word.split("");
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(characters, 1, characters.length - 1,
                Collections.reverseOrder());
        for (String str : characters) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
