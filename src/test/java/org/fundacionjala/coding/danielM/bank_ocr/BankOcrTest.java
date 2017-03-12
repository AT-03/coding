package org.fundacionjala.coding.danielM.bank_ocr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/12/2017.
 */
public class BankOcrTest {
    /**
     * Test if scanned image recognized numbers between 0 and 9.
     */
    @Test
    public void testGetKeyWhenScannedNumbersAreBetween0And9() {
        // given:
        BankOcr scanNumbers = new BankOcr();
        String[] scannedImage = {
                          " _ "
                        + "| |"
                        + "|_|",

                          "  |"
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

                          " __"
                        + "|__"
                        + " __|",

                          " __"
                        + "|__"
                        + "|__|",

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
        String actualResult = scanNumbers.accountRepresentation(scannedImage);

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
        BankOcr scanNumbers = new BankOcr();
        String[] scannedImage = {
                          " _ "
                        + "| |"
                        + "|_|",

                          " _ "
                        + "|_|"
                        + " _|",

                        "Wrong number",
                        "",
                          " __"
                        + "|__"
                        + " __|"
        };

        // when:
        String actualResult = scanNumbers.accountRepresentation(scannedImage);

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
        BankOcr scanNumbers = new BankOcr();
        String[] scannedImage = {
                          "__ "
                        + " _|"
                        + "__|",

                          "   "
                        + "|_|"
                        + "  |",

                          " __"
                        + "|__"
                        + " __|",

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

                          " __"
                        + "|__"
                        + "|__|",

                          " __"
                        + "|__"
                        + " __|",
        };
        String correctAccount = scanNumbers.accountRepresentation(scannedImage);

        // when:
        boolean actualResult = scanNumbers.validateAccount(correctAccount);

        // then:
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);

    }
    /**
     * Test if the scanned account is an incorrect one.
     */
    @Test
    public void testValidateAccountWhenTheGivenAccountIsIncorrect() {
        // given:
        BankOcr scanNumbers = new BankOcr();
        String[] scannedImage = {
                          "   "
                        + "|_|"
                        + "  |",

                          " __"
                        + "|__"
                        + " __|",

                          " __"
                        + "|__"
                        + "|__|",

                          "__ "
                        + "  |"
                        + "  |",

        };
        String incorrectAccount = scanNumbers.accountRepresentation(scannedImage);

        // when:
        boolean actualResult = scanNumbers.validateAccount(incorrectAccount);

        // then:
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }
    /**
     * Test if the status of a correct account is "".
     */
    @Test
    public void testGetAccountStatusWithACorrectAccount() {
        // given:
        BankOcr scanNumbers = new BankOcr();
        String correctAccount = "345882865";

        // when:
        String actualResult = scanNumbers.getAccountStatus(correctAccount);

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
        BankOcr scanNumbers = new BankOcr();
        String incorrectAccount = "021453789";

        // when:
        String actualResult = scanNumbers.getAccountStatus(incorrectAccount);

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
        BankOcr scanNumbers = new BankOcr();
        String illegibleAccount = "  560  |";

        // when:
        String actualResult = scanNumbers.getAccountStatus(illegibleAccount);

        // then:
        String expectedResult = "ILL";
        assertEquals(expectedResult, actualResult);
    }
}
