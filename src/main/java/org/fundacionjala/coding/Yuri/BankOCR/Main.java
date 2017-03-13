package org.fundacionjala.coding.Yuri.BankOCR;

/**
 * Created by Win7-VM-01 on 13/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        String test1 = "    _  _     _  _  _  _  _ ";
        String test2 = "  | _| _||_||_ |_   ||_||_|";
        String test3 = "  ||_  _|  | _||_|  ||_| _|";
        Entry example = new Entry();
        example.getNumbers(test1,test2,test3);
        example.showValues();
        example.decodeValues();

    }
}
