package org.fundacionjala.coding.norman.Kata2;

/**
 * Created by Administrator on 3/20/2017.
 */

/**
 * @author Norman
 */
public final class CodingTask2 {
    private static final int LIMIT = 5;

    private static final String SPACE_DELIMITER = " ";

    /**
     * Constructor.
     */
    private CodingTask2() {

    }

    /**
     * @param sentence String the origin
     * @return sentence the change sentence
     * @This function change the words the size major 5.
     */
    public static String functionReverse(final String sentence) {
        //  String res = "";

        // String s1=sentence;
        String[] words = sentence.split(SPACE_DELIMITER);
        // int cont=0;
        // StringBuilder str=new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            //str.append(words[i]);
            // str=new StringBuilder(words[i]);
            if (words[i].length() >= LIMIT) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
                // words[i]=""+str.reverse();


            }
        }
        return String.join(" ", words);
        //return res=mostrar(words);

    }


}
