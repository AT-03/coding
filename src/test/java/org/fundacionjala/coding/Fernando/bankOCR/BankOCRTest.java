package org.fundacionjala.coding.Fernando.bankOCR;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by PC on 24/06/2017.
 */
public class BankOCRTest {

    /**
     * Test Constructor.
     * @throws Exception if the constructor is not private.
     */
    @Test
    public void testBankOCRConstructorIsPrivate() throws Exception {
        Constructor constructor = BankOCR.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test the number.
     */
    @Test
    public void testToGetNumber() {
        // given:
        String[] data = {
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
        final String actualResult = BankOCR.parseDigit(data);

        // then:
        final String expectedResult = "0123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when values has different o wrong number.
     */
    @Test
    public void testWithWrongNumbers() {
        // given:
        String[] data = {
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
        final String actualResult = BankOCR.parseDigit(data);

        // then:
        final String expectedResult = "09??5";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test with incorrect datas.
     */
    @Test
    public void testWithIncorrectDatas() {
        // given:
        String[] data = {
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
       final String value = BankOCR.parseDigit(data);

        // when:
        final boolean actualResult = BankOCR.validAccountNumbers(value);

        // then:
        assertFalse(actualResult);
    }

    /**
     * Test when we get the result "ERR".
     */
    @Test
    public void testWithWrongDatas() {
        // given:
        String data = "021453789";

        // when:
        String actualResult = BankOCR.accountStatus(data);

        // then:
        String expectedResult = "ERR";
        assertEquals(expectedResult, actualResult);
    }

}

