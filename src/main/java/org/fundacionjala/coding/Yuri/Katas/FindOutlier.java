package org.fundacionjala.coding.Yuri.Katas;

/**
 * Created by Win7-VM-01 on 28/02/2017.
 */
public class FindOutlier {
    static int find(int[] integers){
        int liar = 0;
        boolean flag = isEven(integers);
        for(int i = 0 ; i < integers.length ; i++ ) {
            if(integers[i] % 2 != 0 && flag )
                liar = integers[i];
            else {
                if(integers[i] % 2 == 0 && flag == false)
                    liar = integers[i];
            }

        }
        return liar;
    }

    static boolean isEven(int[] integers) {
        int even = 0;
        for(int i = 0 ; i < 3 ; i ++ ) {
            if(integers[i] % 2 == 0)
                even++;
        }
        return even > 1;
    }
}
