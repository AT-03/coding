package org.fundacionjala.coding.reverseWord;

/**
 * Created by PABLO on 3/12/2017.
 */
public class reverseWord {
    public String reverseWord(String reverseString){
        String[] splitWord = reverseString.split(" ");

        for(int i = 0; i < splitWord.length; i++){
            splitWord[i] = (splitWord[i].length() >= 5) ? new StringBuilder(splitWord[i]).reverse().toString() : splitWord[i].toString();
        }
        return String.join(" ", splitWord);
    }
}
