package org.fundacionjala.coding.danielmontecinos.bank_ocr;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Class to test BankOcr class.
 */
public class BankOcrTest {

    /**
     * The method verifies that the BankOcr class has a private constructor.
     *
     * @throws Exception if the constructor is not private.
     */
    @Test
    public void testBankOcrConstructorIsPrivate() throws Exception {
        Constructor constructor = BankOcr.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test if scanned image recognized numbers between 0 and 9.
     */
    @Test
    public void testGetKeyWhenScannedNumbersAreBetween0And9() {
        final String[] scannedImage = {
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

        final String actualResult = BankOcr.accountRepresentation(scannedImage);

        final String expectedResult = "0123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test that anything different from a number is recognized as '?'.
     */
    @Test
    public void testGetKeyWhenScannedImageHasDifferentValues() {
        final String[] scannedImage = {
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

        final String actualResult = BankOcr.accountRepresentation(scannedImage);

        final String expectedResult = "09??5";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if the scanned account is a correct one.
     */
    @Test
    public void testValidateAccountWhenTheGivenAccountIsCorrect() {
        final String[] scannedImage = {
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
        final String correctAccount = BankOcr.accountRepresentation(scannedImage);

        final boolean actualResult = BankOcr.validateAccount(correctAccount);

        assertTrue(actualResult);

    }

    /**
     * Test if the scanned account is an incorrect one.
     */
    @Test
    public void testValidateAccountWhenTheGivenAccountIsIncorrect() {
        final String[] scannedImage = {
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
        final String incorrectAccount = BankOcr.accountRepresentation(scannedImage);

        final boolean actualResult = BankOcr.validateAccount(incorrectAccount);

        assertFalse(actualResult);
    }

    /**
     * Test if the status of a correct account is "".
     */
    @Test
    public void testGetAccountStatusWithACorrectAccount() {
        final String correctAccount = "345882865";

        final String actualResult = BankOcr.getAccountStatus(correctAccount);

        final String expectResult = "";
        assertEquals(expectResult, actualResult);
    }

    /**
     * Test if the status of an incorrect account is "ERR".
     */
    @Test
    public void testGetAccountStatusWithAnIncorrectAccount() {
        final String incorrectAccount = "021453789";

        final String actualResult = BankOcr.getAccountStatus(incorrectAccount);

        final String expectedResult = "ERR";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if the status of an illegible account is: "ILL".
     */
    @Test
    public void testGetAccountStatusWithAnIllegibleAccount() {
        final String illegibleAccount = "  560  |";

        final String actualResult = BankOcr.getAccountStatus(illegibleAccount);

        final String expectedResult = "ILL";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if a scanned account with nine digits is parsed correctly.
     */
    @Test
    public void testParseScannedNumbersWithNineDigits() {
        final String scannedString =
                "__     _  _  _  _  _  _  _ "
                        + " _||_||_ |_||_| _||_||_ |_ "
                        + "__|  | _||_||_||_ |_||_| _|";

        final String[] accountArray = BankOcr.parseScannedNumbers(scannedString);

        final String actualResult = BankOcr.accountRepresentation(accountArray);

        final String expectedResult = "345882865";
        assertEquals(expectedResult, actualResult);
    }
}
