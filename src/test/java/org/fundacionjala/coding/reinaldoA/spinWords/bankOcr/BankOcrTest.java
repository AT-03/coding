package org.fundacionjala.coding.reinaldoA.spinWords.bankOcr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 3/23/2017.
 */
public class BankOcrTest {

    /**
     * Test if test Bank Ocr When Scanned Numbers Cero.
     */
    @Test
    public void testBankOcrWhenScannedNumbersCero() {
        // given:
        String[] sentenceImage = {
                " _ "
                        + "| |"
                        + "|_|"
        };
        // when:
        String actualResult = BankOcr.accountRepresentation(sentenceImage);

        // then:
        String expectedResult = "0";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if test Bank Ocr When Scanned Numbers Cero To Nine.
     */
    @Test
    public void testBankOcrWhenScannedNumbersCeroToNine() {
        // given:
        String[] sentenceImage = {
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
        String actualResult = BankOcr.accountRepresentation(sentenceImage);

        // then:
        String expectedResult = "0123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test that anything different from a number is recognized as '?'.
     */
    @Test
    public void testBankOcrKeyWhenScannedImageHasDifferentValues() {
        // given:
        String[] sentenceImage = {
                " _ "
                        + "| |"
                        + "|_|",

                " _ "
                        + "|_|"
                        + " _|",

                "This is different",
                "",
                " _ "
                        + "|_ "
                        + " _|"
        };

        // when:
        String actualResult = BankOcr.accountRepresentation(sentenceImage);

        // then:
        String expectedResult = "09??5";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if the scanned account is a correct one.
     */
    @Test
    public void testBankOcrValidateAccountWhenTheGivenAccountIsCorrect() {
        // given:
        String[] sentenceImage = {
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
        String correctAccount = BankOcr.accountRepresentation(sentenceImage);

        // when:
        boolean actualResult = BankOcr.validateAccount(correctAccount);

        // then:
        assertTrue(actualResult);

    }

    /**
     * Test if the scanned account is an incorrect one.
     */
    @Test
    public void testBankOcrValidateAccountWhenTheGivenAccountIsIncorrect() {
        // given:
        String[] sentenceImage = {
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
        String incorrectAccount = BankOcr.accountRepresentation(sentenceImage);

        // when:
        boolean actualResult = BankOcr.validateAccount(incorrectAccount);

        // then:
        assertTrue(!actualResult);
    }

    /**
     * Test if the status of a correct account is "".
     */
    @Test
    public void testBankOcrAccountStatusWithACorrectAccount() {
        // given:
        String sentenceAccount = "345882865";

        // when:
        String actualResult = BankOcr.getAccountStatus(sentenceAccount);

        // then:
        String expectResult = "";
        assertEquals(expectResult, actualResult);
    }

    /**
     * Test if the Account Status With An IncorrectAccount.
     */
    @Test
    public void testBankOcrAccountStatusWithAnIncorrectAccount() {
        // given:
        String sentenceAccount = "021453789";

        // when:
        String actualResult = BankOcr.getAccountStatus(sentenceAccount);

        // then:
        String expectedResult = "ERR";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if the Account Status With An Illegible Account.
     */
    @Test
    public void testBankOcrAccountStatusWithAnIllegibleAccount() {
        // given:
        String sentenceAccount = "  664371?95";

        // when:
        String actualResult = BankOcr.getAccountStatus(sentenceAccount);

        // then:
        String expectedResult = "ILL";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if a Scanned Number With Incorrect Number Of Digits.
     */
    @Test
    public void testBankOcrParseScannedNumberWithIncorrectNumberOfDigits() {
        //given:
        String scannedString =
                " _ "
                        + "| |"
                        + "|_|";
        String[] accountArray = BankOcr.parseScannedNumbers(scannedString);

        // when:
        String actualResult = BankOcr.accountRepresentation(accountArray);

        // then:
        String expectedResult = "?????????";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if a Scanned Numbers With Nine Digits.
     */
    @Test
    public void testBankOcrParseScannedNumbersWithNineDigits() {
        // given:
        String scannedString =
                "__     _  _  _  _  _  _  _ "
                        + " _||_||_ |_||_| _||_||_ |_ "
                        + "__|  | _||_||_||_ |_||_| _|";

        String[] accountArray = BankOcr.parseScannedNumbers(scannedString);

        // when:
        String actualResult = BankOcr.accountRepresentation(accountArray);

        // then:
        String expectedResult = "345882865";
        assertEquals(expectedResult, actualResult);
    }
}
