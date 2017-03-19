package org.fundacionjala.coding.Yuri.Katas;

/**
 * Description:
 Write a function that takes in a string of one or more words, and returns the same string, but with all five or more
 letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces.
 Spaces will be included only when more than one word is present.
 Examples:

 spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 spinWords( "This is a test") => returns "This is a test"
 spinWords( "This is another test" )=> returns "This is rehtona test"
 * Created by Win7-VM-01 on 28/02/2017.
 */
public class SpinWords {

    public static final int LIMIT_REVERSE = 5;

    /**
     * This method helps to divide a string using space like parameter.
     * @param sentence the string that will divide.
     * @return it is return an string array.
     */
    public String[] getWords(final String sentence) {
        return sentence.split(" ");
    }

    /**
     *  this method helps to reverse words with  five or more letter words in a sentence.
     * @param sentence the sentence that will evaluated
     * @return the string with all the words reversed and not.
     */
    public String spinWords(final String sentence) {
        String[] words = getWords(sentence);
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= LIMIT_REVERSE) {
                words[i] = reverseWord(words[i]);
            }
        }
        return String.join(" ", words);
    }

    /**
     *  This method helps to revert a string.
     * @param word the string that will be reverted
     * @return the string reverted
     */
    public String reverseWord(final String word) {
        StringBuilder builder = new StringBuilder(word);
        return builder.reverse().toString();
    }
}
