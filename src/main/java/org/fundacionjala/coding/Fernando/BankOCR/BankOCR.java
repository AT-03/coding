package org.fundacionjala.coding.Fernando.BankOCR;


import java.io.IOException;
import java.util.ArrayList;

/**
 * Write a description of class BankOCR here.
 * * @author (your name)
 *
 * @version (a version number or a date)
 */

 public final class BankOCR {

    /**
     * Constructor method.
     */
    private BankOCR() {
    }

    /**
     * @param arg recibe un parametro String.
     * @throws IOException exception.
     */
    public static void main(final String[] arg) throws IOException {
        FileManager fm = new FileManager();
        EntryParser e = new EntryParser();
        ArrayList<String> a = fm.readFile("input.txt");
        //System.out.println(a);
        e.parseEntry(a);
        System.out.println(e.parseEntry(a));

        fm.fileWrite(a);
    }

}
