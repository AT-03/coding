package org.fundacionjala.coding.Yuri.Katas;

/**
 * Created by Win7-VM-01 on 28/02/2017.
 */
public class SpinWords {

    public String[] getWords(String sentence) {
        String[] words;
        words = sentence.split(" ");
        return words;
    }
    public String spinWords(String sentence) {
        String[] words = getWords(sentence);
        String joinedString;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5)
                words[i] = reverseWord(words[i]);
        }
        return joinedString = String.join(" ",words);
    }
    public String reverseWord(String word) {
        String reversedWord;
        StringBuilder builder = new StringBuilder(word);
        reversedWord = builder.reverse().toString();
        return reversedWord;
    }
}
