package org.fundacionjala.coding.Yuri.Katas;

/**
 * Created by Win7-VM-01 on 28/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        String digits = "4003301018392";
        EanCode code = new EanCode(digits);

        System.out.println("EAN-"+ digits+ " " + code.calculateCheckSum() + " is valid : " + code.isValidCode());

        System.out.println(code.removeChecksum());
    }
}
