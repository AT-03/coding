package org.fundacionjala.coding.juan.spinWords;

/**
 * Created by Juan on 3/10/2017.
 */
public final class SpinWords {
    /**
     * Constructor private.
     */
    private SpinWords() {
        //no called
    }

    /**
     * Get the words spined if it have 5 or more letters.
     *
     * @param sentence is the word or words
     * @return the word spined.
     */
    public static String spinWords(final String sentence) {
        final int limitWord = 4;
        if (sentence == null) {
            return "";
        }
        if (sentence.length() <= limitWord) {
            return sentence;
        } else {
            String[] separatedWords = sentence.split(" ");
            StringBuilder result = new StringBuilder();
            for (String separatedWord : separatedWords) {

                if (separatedWord.length() > limitWord) {
                    for (int j = separatedWord.length() - 1; j >= 0; j--) {
                        result.append(separatedWord.charAt(j));
                    }
                    result.append(" ");

                } else {
                    for (int j = 0; j < separatedWord.length(); j++) {
                        result.append(separatedWord.charAt(j));
                    }
                    result.append(" ");

                }
            }
            return result.deleteCharAt(result.length() - 1).toString();
        }
    }
}
