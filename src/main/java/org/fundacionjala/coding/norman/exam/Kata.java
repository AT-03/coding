package org.fundacionjala.coding.norman.exam;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Administrator on 3/23/2017.
 */
public class Kata {

    public static double[] averages(int[] input){
        double[] res;
        if(input!=null&&input.length!=0&&input.length!=1) {
            res = new double[input.length - 1];
            // }
            //if(input.length!=0&&input.length!=1&&input!=null){

            for (int i = 0; i < input.length - 1; i++) {
                int contAux = i + 1;
                // int indice=i;
                res[i] = ((double) input[i] + (double) input[contAux]) / 2;
            }
        }else{
            return new double[0];
        }
        //}

        return res ;
    }
}
