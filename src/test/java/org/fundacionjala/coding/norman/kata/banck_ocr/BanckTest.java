package org.fundacionjala.coding.norman.kata.banck_ocr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class BanckTest {
    /**
     * Test if scanned image recognized numbers between 0 and 9.
     */
    @Test
    public void testGetKeyWhenScannedNumbersAreBetween0And9() {
        // given:
        String[] scannedImage = {
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
        String actualResult = Banck.accountRepresentation(scannedImage);

        // then:
        String expectedResult = "0123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test that anything different from a number is recognized as '?'.
     */
    @Test
    public void testGetKeyWhenScannedImageHasDifferentValues() {
        // given:
        String[] scannedImage = {
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
        String actualResult = Banck.accountRepresentation(scannedImage);

        // then:
        String expectedResult = "09??5";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if the scanned account is a correct one.
     */
    @Test
    public void testValidateAccountWhenTheGivenAccountIsCorrect() {
        // given:
        String[] scannedImage = {
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

                " _ "
                        + "|_ "
                        + " _|",
        };
        String correctAccount = Banck.accountRepresentation(scannedImage);

        // when:
        boolean actualResult = Banck.validateAccount(correctAccount);

        // then:
        assertTrue(actualResult);

    }

    /**
     * Test if the scanned account is an incorrect one.
     */
    @Test
    public void testValidateAccountWhenTheGivenAccountIsIncorrect() {
        // given:
        String[] scannedImage = {
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
        String incorrectAccount = Banck.accountRepresentation(scannedImage);

        // when:
        boolean actualResult = Banck.validateAccount(incorrectAccount);

        // then:
        assertTrue(!actualResult);
    }

    /**
     * Test if the status of a correct account is "".
     */
    @Test
    public void testGetAccountStatusWithACorrectAccount() {
        // given:
        String correctAccount = "345882865";

        // when:
        String actualResult = Banck.getAccountStatus(correctAccount);

        // then:
        String expectResult = "";
        assertEquals(expectResult, actualResult);
    }

    /**
     * Test if the status of an incorrect account is "ERR".
     */
    @Test
    public void testGetAccountStatusWithAnIncorrectAccount() {
        // given:
        String incorrectAccount = "021453789";

        // when:
        String actualResult = Banck.getAccountStatus(incorrectAccount);

        // then:
        String expectedResult = "ERR";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if the status of an illegible account is: "ILL".
     */
    @Test
    public void testGetAccountStatusWithAnIllegibleAccount() {
        // given:
        String illegibleAccount = "  560  |";

        // when:
        String actualResult = Banck.getAccountStatus(illegibleAccount);

        // then:
        String expectedResult = "ILL";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if a scanned account with nine digits is parsed correctly.
     */
    @Test
    public void testParseScannedNumbersWithNineDigits() {
        // given:
        String scannedString =
                "__     _  _  _  _  _  _  _ "
                        + " _||_||_ |_||_| _||_||_ |_ "
                        + "__|  | _||_||_||_ |_||_| _|";

        String[] accountArray = Banck.parseScannedNumbers(scannedString);

        // when:
        String actualResult = Banck.accountRepresentation(accountArray);

        // then:
        String expectedResult = "345882865";
        assertEquals(expectedResult, actualResult);
    }

}
