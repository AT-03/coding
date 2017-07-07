package org.fundacionjala.coding.pablo.BankOCR;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 7/1/2017.
 */
public class BankOCR1Test {

    /**
     * Test constructor.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = BankOCR.class.getDeclaredConstructor();
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
        final String actualResult = BankOCR.numberConvertedToString(numberScanned);
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
        final String expectedResult = "?70414989";

        //then
        final String actualResult = BankOCR.numberConvertedToString(numberScanned);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test verify if the account is incorrect.
     */
    @Test
    public void verifyIfTheAccountIsIncorrect() {
        // given:
        String[] scannedImage = {
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
                        + "|_|"
                        + "|_|",

        };
        String account = BankOCR.accountRepresentation(scannedImage);

        // when:
        boolean actualResult = BankOCR.validateAccountNumbers(account);

        // then:
        assertTrue(!actualResult);
    }

    /**
     * Test verify if the account is corrected.
     */
    @Test
    public void verifyIfTheAccountIsCorrected() {
        // given:
        String[] scannedImage = {
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
                        + "|_|"
                        + "|_|",

                " _ "
                        + "|_|"
                        + "|_|",

                " _ "
                        + " _|"
                        + "|_ ",

                " _ "
                        + "|_|"
                        + "|_|",

                " _ "
                        + "|_ "
                        + "|_|",

                " _"
                        + "|_ "
                        + " _|",
        };
        String account = BankOCR.accountRepresentation(scannedImage);

        // when:
        boolean actualResult = BankOCR.validateAccountNumbers(account);

        // then:
        assertTrue(actualResult);
    }

    /**
     * Test verify if the status account is illegible.
     */
    @Test
    public void verifyIfTheStatusAccountIsIllegible() {
        // given:
        String account = "  560  |";

        // when:
        String expectedResult = "ILL";

        // then:
        String actualResult = BankOCR.getStatusAccount(account);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test verify if the status account is incorrect.
     */
    @Test
    public void verifyIfTheStatusAccountIsIncorrect() {
        // given:
        String account = "021453789";

        // when:
        String expectedResult = "ERR";

        // then:
        String actualResult = BankOCR.getStatusAccount(account);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test verify if an image contains nine digits and is parsed correctly.
     */
    @Test
    public void verifyIfAnImageContainsNineDigitsAndIsParsedCorrectly() {
        // given:
        String figureScanned =
                "       _  _  _  _  _  _  _ "
                        + "  ||_||_||_||_| _||_||_ |_|"
                        + "  |  | _||_||_||_ |_||_| _|";

        String[] accountArray = BankOCR.parseScannedFigures(figureScanned);

        // when:
        String actualResult = BankOCR.accountRepresentation(accountArray);

        // then:
        String expectedResult = "149882869";
        assertEquals(expectedResult, actualResult);
    }
}
