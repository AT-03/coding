package org.fundacionjala.coding.juan.bank;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    /**
     * Test constructor.
     *
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
