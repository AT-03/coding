package org.fundacionjala.coding.pablo.BankOCR;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/23/2017.
 */
public abstract class BankOCRUserStory1Test {

    /**
     * Test about BankOCR User Story 1.
     */

    @Test
    public void verifyNumberScannerCorrect() {

        //given
        final String[] numberScanned = {
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

                " _"
                        + "|_ "
                        + " _|",

                " _ "
                        + "|_ "
                        + "|_|",

                " _ "
                        + "  |"
                        + "  |",

                " _ "
                        + "|_|"
                        + "|_|",

                " _ "
                        + "|_|"
                        + " _|"
        };

        //when
        final String actualResult = BankOCRUserStory1.numberConvertedToString(numberScanned);

        //then
        final String expectedResult = "0123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test verify number scanner incorrect.
     */

    @Test
    public void verifyNumberScannerIncorrect() {

        //given
        final String[] numberScanned = {
                " _ "
                        + "  _|"
                        + "  |",

                " _ "
                        + "  |"
                        + "  |",

                " _ "
                        + "| |"
                        + "|_|",

                "   "
                        + "|_|"
                        + "  |",

                "   "
                        + "  |"
                        + "  |",

                "   "
                        + "|_|"
                        + "  |",

                " _ "
                        + "|_|"
                        + " _|",

                " _ "
                        + "|_|"
                        + "|_|",

                " _ "
                        + "|_|"
                        + " _|"
        };

        //when
        final String actualResult = BankOCRUserStory1.numberConvertedToString(numberScanned);

        //then
        final String expectedResult = "?70414989";
        assertEquals(expectedResult, actualResult);
    }
}
