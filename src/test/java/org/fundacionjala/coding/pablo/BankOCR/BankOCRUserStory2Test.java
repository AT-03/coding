package org.fundacionjala.coding.pablo.BankOCR;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 7/3/2017.
 */
public class BankOCRUserStory2Test {


    /**
     * Test constructor.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = BankOCRUserStory2.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
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
        String account = BankOCRUserStory2.accountRepresentation(scannedImage);

        // when:
        boolean actualResult = BankOCRUserStory2.validateAccountNumbers(account);

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
        String account = BankOCRUserStory2.accountRepresentation(scannedImage);

        // when:
        boolean actualResult = BankOCRUserStory2.validateAccountNumbers(account);

        // then:
        assertTrue(actualResult);
    }
}
