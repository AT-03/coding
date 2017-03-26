package org.fundacionjala.coding.juan.Bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan Pablo on 26/03/2017.
 */
public class BankOCRTest {

    /**
     * testing the paser when a string is given.
     */
    @Test
    public void testingAnGivenStringToGetTheAccount() {

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
        final String actualResult = BankOCR.convertStringToNumber(numberScanned);

        //then
        final String expectedResult = "0123456789";
        assertEquals(expectedResult, actualResult);
    }

}
