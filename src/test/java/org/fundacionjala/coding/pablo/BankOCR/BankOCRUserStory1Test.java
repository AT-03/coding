package org.fundacionjala.coding.pablo.BankOCR;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 7/1/2017.
 */
public class BankOCRUserStory1Test {

    /**
     * Test constructor.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = BankOCRUserStory1.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

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
        final String expectedResult = "0123456789";

        //then
        final String actualResult = BankOCRUserStory1.numberConvertedToString(numberScanned);
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
