package org.fundacionjala.coding.reinaldo.wordDescent;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        return Stream.of(sentence.split(" "))
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
        String wordInvert = new StringBuilder(
                word.substring(1, word.length() - 1)).reverse().toString();


        return String.format("%s%s%s", Character.toString(
                word.charAt(0)), wordInvert, Character.toString(word.charAt(word.length() - 1)));
    }

}
