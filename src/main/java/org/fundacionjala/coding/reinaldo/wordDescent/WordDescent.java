package org.fundacionjala.coding.reinaldo.wordDescent;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 6/30/2017.
 */
public final class WordDescent {

    private static final int WORD_LIMIT = 3;

    /**
     * This a constructor of wordDescent.
     */
    private WordDescent() {

    }

    /**
     * This Method retorn the word invert.
     *
     * @param sentence all the Word
     * @return String word invert
     */
    public static String getWordDescent(final String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() < WORD_LIMIT ? word : invertString(word))
                .collect(Collectors.joining(" "));

    }

    /**
     * This is a method for to invert each word of the list.
     *
     * @param word only the Word
     * @return String word invert
     */
    private static String invertString(final String word) {

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
