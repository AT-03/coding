package org.fundacionjala.coding.Ruber;

import org.fundacionjala.coding.Ruber.BankOcr.AccountNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ruber Cuellar on 3/16/2017.
 */
public class AccountNumbersTest {

    /**
     * Test valid number.
     */
    @Test
    public void testAccountNumbersValidNumberNine() {
        // given
        final String [] numbersRead = {" _ "
                + " _|"
                + " _|" , "   "
                + "|_|"
                + "  |" , " _ "
                + "|_ "
                + " _|" , " _ "
                + "|_|"
                + "|_|" , " _ "
                + "|_|"
                + "|_|" , " _ "
                + " _| "
                + "|_ " , " _ "
                + "|_|"
                + "|_|" , " _ "
                + "|_ "
                + "|_|" , " _ "
                + "|_ "
                + " _|"
        };

        // when
        final String actualResult = AccountNumbers.validate(AccountNumbers.convert(numbersRead));

        // then
        final String expectedResult = "345882865";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test valid number.
     */
    @Test
    public void testAccountNumbersEigthDigits() {
        // given
        final String [] numbersRead = {" _ "
                + " _|"
                + " _|" , "   "
                + "|_|"
                + "  |" , " _ "
                + "|_ "
                + " _|" , " _ "
                + "|_|"
                + "|_|" , " _ "
                + "|_|"
                + "|_|" , " _ "
                + " _| "
                + "|_ " , " _ "
                + "|_|"
                + "|_|" , " _ "
                + "|_ "
                + "|_|"
        };

        // when
        final String actualResult = AccountNumbers.validate(AccountNumbers.convert(numbersRead));

        // then
        final String expectedResult = "";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test valid number.
     */
    @Test
    public void testAccountNumbersInvalidNumbers() {
        // given
        final String [] numbersRead = {" _ "
                + " _|"
                + " _|" , "   "
                + "|_"
                + "  |" , " _ "
                + "|_ "
                + " _|" , " _ "
                + "|_ "
                + "|_|" , " _ "
                + "|_|"
                + "|_|" , " _ "
                + " _| "
                + "|_ " , " _ "
                + "|_|"
                + "|_" , " _ "
                + "|_ "
                + "|_|" , " _ "
                + "|_ "
                + " _|"
        };

        // when
        final String actualResult = AccountNumbers.validate(AccountNumbers.convert(numbersRead));

        // then
        final String expectedResult = "3?5682?65 ILL";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test valid number.
     */
    @Test
    public void testAccountNumbersWithInvalidCheckSum() {
        // given
        final String [] numbersRead = {" _ "
                + " _|"
                + " _|" , "   "
                + "|_|"
                + "  |" , " _ "
                + "|_ "
                + " _|" , " _ "
                + "|_|"
                + "|_|" , " _ "
                + "|_|"
                + "|_|" , " _ "
                + " _| "
                + "|_ " , " _ "
                + "|_|"
                + "|_|" , " _ "
                + "|_ "
                + "|_|" , " _ "
                + "|_ "
                + "|_|"
        };

        // when
        final String actualResult = AccountNumbers.validate(AccountNumbers.convert(numbersRead));

        // then
        final String expectedResult = "345882866 ERR";
        assertEquals(expectedResult, actualResult);
    }
}
