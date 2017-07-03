package org.fundacionjala.coding.Fernando.BankOCR;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by PC on 24/06/2017.
 */
public class BankOCRTest {

    /**
     * Test the number.
     */
    @Test
    public void testToGetNumber() {
        // given:
        String[] data = {
                " _ "
                        + "| |"
                        + "|_|",

                "   "
                        + "  |"
                        + "  |",

                " _ "
                        + " _|"
                        + "|_ ",

                "__ "
                        + " _|"
                        + "__|",

                "   "
                        + "|_|"
                        + "  |",

                " _ "
                        + "|_ "
                        + " _|",

                " _ "
                        + "|_ "
                        + "|_|",

                "__ "
                        + "  |"
                        + "  |",

                " _ "
                        + "|_|"
                        + "|_|",

                " _ "
                        + "|_|"
                        + " _|"
        };

        // when:
        String actualResult = BankOCR.parseDigit(data);

        // then:
        String expectedResult = "0123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when values has different o wrong number.
     */
    @Test
    public void testWithWrongNumbers() {
        // given:
        String[] data = {
                " _ "
                        + "| |"
                        + "|_|",

                " _ "
                        + "|_|"
                        + " _|",

                "Wrong number",
                "",
                " _ "
                        + "|_ "
                        + " _|"
        };

        // when:
        String actualResult = BankOCR.parseDigit(data);

        // then:
        String expectedResult = "09??5";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test with incorrect datas.
     */
    @Test
    public void testWithIncorrectDatas() {
        // given:
        String[] data = {
                "   "
                        + "|_|"
                        + "  |",

                " _ "
                        + "|_ "
                        + " _|",

                " _ "
                        + "|_ "
                        + "|_|",

                "__ "
                        + "  |"
                        + "  |",

        };
        String value = BankOCR.parseDigit(data);

        // when:
        boolean actualResult = BankOCR.validAccountNumbers(value);

        // then:
        assertTrue(!actualResult);
    }

    /**
     * Test when we get the result "ERR".
     */
    @Test
    public void testWithWrongDatas() {
        // given:
        String data = "021453789";

        // when:
        String actualResult = BankOCR.accountStatus(data);

        // then:
        String expectedResult = "ERR";
        assertEquals(expectedResult, actualResult);
    }
}

