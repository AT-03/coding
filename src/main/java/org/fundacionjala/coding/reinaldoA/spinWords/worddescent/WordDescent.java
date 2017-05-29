package org.fundacionjala.coding.reinaldoA.spinWords.worddescent;


import java.util.Arrays;
import java.util.Collections;
import java.util.FormatFlagsConversionMismatchException;

/**
 * Created by Administrator on 5/29/2017.
 */

public class WordDescent {
    /**
     *
     */
    public static String getWordDescenden(final String sentence) {
        String[] Palabraseparada = sentence.split(" ");
        StringBuilder cadenaGlobal = new StringBuilder();
        for (int i = 0; i < Palabraseparada.length; i++) {
            if (Palabraseparada[i].length() > 3) {
                cadenaGlobal.append(invertCadena(Palabraseparada[i] + " "));
            } else {
                cadenaGlobal.append(Palabraseparada[i] + " ");
            }
        }
        return cadenaGlobal.toString().trim();
    }

    private static String invertCadena(String s) {
        StringBuilder newWords = new StringBuilder();
        String[] arr = s.split("");
        Arrays.sort(arr, 1, arr.length - 2, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            newWords.append(arr[i].toString());
        }
        return newWords.toString();
    }
}
