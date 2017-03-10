package org.fundacionjala.coding.juan;

/**
 * @author Juan Pablo
 */
public class eanValidator {
    public static boolean validating(final String eanCode) {
        int sum = 0;
        int checksum = 0;
        int finalNumbre = 12;
        for(int i = 0; i < finalNumbre; i++) {
            if(i%2 == 1) {
                sum += ((eanCode.charAt(i)-48)*3);
            } else {
                sum += (eanCode.charAt(i)-48);
            }
        }
        if (sum % 10 != 0) {
            checksum = (10 -(sum % 10));
        }
        if (eanCode.charAt(eanCode.length()-1)-48 == checksum) {
            return true;
        }
        return false;
    }
}


