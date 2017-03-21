package org.fundacionjala.coding.pablo.exerciseEAN;

/**
 * Created by PABLO on 3/12/2017.
 */
public class validator {


    public  boolean validator(String EAN){
        int sum = 0;

        for(int i = 1; i < EAN.length(); i++){
            int numericValue = Character.getNumericValue(EAN.charAt(i - 1));

            sum += i % 2 == 0 ? numericValue * 3 : numericValue;
        }

        int ver = sum % 10 != 0 ? 10 - (sum % 10) : 0;

        return ver == Character.getNumericValue(EAN.charAt(EAN.length() - 1));
    }
}
