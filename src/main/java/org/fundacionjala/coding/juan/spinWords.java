package org.fundacionjala.coding.juan;

/**
 * Created by Administrator on 3/10/2017.
 */
public class spinWords {
    public String spinWord(final String sentence) {
        if (sentence == null)
            return "";
        if (sentence.length() <= 4)
            return sentence;
        else {
            String[] separatedWords = sentence.split(" ");
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < separatedWords.length; i++) {

                if (separatedWords[i].length() > 4) {
                    for (int j = separatedWords[i].length() - 1; j >= 0; j--)
                        result.append(separatedWords[i].charAt(j));
                    result.append(" ");
                } else {
                    for (int j = 0; j < separatedWords[i].length(); j++)
                        result.append(separatedWords[i].charAt(j));
                    result.append(" ");
                }
            }
            return result.deleteCharAt(result.length() - 1).toString();
        }
    }
}
