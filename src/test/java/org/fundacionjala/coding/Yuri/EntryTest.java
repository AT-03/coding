package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.BankOCR.Entry;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by YVayneR on 3/25/2017.
 */
public class EntryTest {
    /**
     * this test helps to verify that a valid code using the three lines coded.
     */
    @Test
    public void testEntryCodeValid() {
        final String line1 = "    _  _     _  _  _  _  _ ";
        final String line2 = "  | _| _||_||_ |_   ||_||_|";
        final String line3 = "  ||_  _|  | _||_|  ||_| _|";
        final String expectedResult = "123456789";
        Entry bank = new Entry(line1, line2, line3);
        Assert.assertEquals(expectedResult, bank.decodeValues());
    }

    /**
     * this test helps to verify an invalid code using the three lines.
     */
    @Test
    public void testEntryCodeInvalid() {
        final String line1 = "       _     _  _  _  _  _ ";
        final String line2 = "  | _| _||_||_ |_   ||_||_|";
        final String line3 = "  ||_  _|  | _||_|  ||_| _|";
        final String expectedResult = "1?3456789";
        Entry bank = new Entry(line1, line2, line3);
        Assert.assertEquals(expectedResult, bank.decodeValues());
    }
}
