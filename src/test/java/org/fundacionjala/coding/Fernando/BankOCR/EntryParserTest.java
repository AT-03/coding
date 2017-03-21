package org.fundacionjala.coding.Fernando.BankOCR;


import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * The test class EntryParserTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EntryParserTest {
    /**
     * test unit1.
     */
    /**
     @Test public void test1() throws IOException {
     FileManager fm = new FileManager();
     // given:
     ArrayList<String> a = fm.readFile("input.txt");
     EntryParser e = new EntryParser();
     e.getLines(a);
     System.out.println(e.line1);
     System.out.println(e.line2);
     System.out.println(e.line3);

     assertEquals("   _  _     _  _  _  _  _ ", e.line1);
     assertEquals(" | _| _||_||_ |_   ||_||_|", e.line2);
     assertEquals(" ||_  _|  | _||_|  ||_| _|", e.line3);

     }
     */

    /**
     * testGenerate1.
     */
    @Test
    public void testGenerate1() {
        EntryParser e = new EntryParser();
        String top = "   ";
        String mid = "  |";
        String bot = "  |";

        assertEquals("1", e.generateNumber(top, mid, bot));
    }

    /**
     * testGenerate1.
     */
    @Test
    public void testParseOneDigit() {
        EntryParser e = new EntryParser();
        String top = "   _  _     _  _  _  _  _ ";
        String mid = " | _| _||_||_ |_   ||_||_|";
        String bot = " ||_  _|  | _||_|  ||_| _|";

        assertEquals("123456789", e.parseDigit(top, mid, bot));
    }

    /**
     * testparseEntry.
     *
     * @throws IOException exception.
     */
    @Test
    public void testparseEntry() throws IOException {
        FileManager fm = new FileManager();
        EntryParser e = new EntryParser();

        ArrayList<String> entries = fm.readFile("input.txt");
        ArrayList<String> results = e.parseEntry(entries);

        System.out.println(results);
    }

    /**
     * testvalidNumbers.
     */
    @Test
    public void testvalidNumbers() {
        String input = "123456789";
        int suma = 0;
        for (int i = input.length() - 1, multiplier = 1; i >= 0; i--, multiplier++) {
            int x = (int) input.charAt(i) * multiplier;
            suma = suma + x;
        }
        System.out.println(suma);

    }

}
