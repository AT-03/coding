package org.fundacionjala.coding.reinaldo.kataBankOcr;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by reinaldo on 08/07/2017.
 */
public class BankOcrKataTest {

    /**
     * Test if testBankOcrWhenScannedNumbersOneToNine.
     */
    @Test
    public void testBankOcrWhenScannedNumbersOneToNine() {
        // given:
        List<String> insertLineFour = new ArrayList<String>();
        insertLineFour.add("    _  _     _  _  _  _  _ ");
        insertLineFour.add("  | _| _||_||_ |_   ||_||_|");
        insertLineFour.add("  ||_  _|  | _||_|  ||_| _|");
        insertLineFour.add("");


        // when:
       final String actualResult = BankOcrKata.decode(insertLineFour);

        // then:
       final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if testBankOcrWhenScannedNumbersFiveIsErrorandEight.
     */
    @Test
    public void testBankOcrWhenScannedNumbersFiveIsErrorandEight() {

        // given:
        List<String> insertLineFour = new ArrayList<String>();
        insertLineFour.add("    _  _     _  _  _  _  _ ");
        insertLineFour.add("  | _| _||_| r |_   ||_7|_|");
        insertLineFour.add("  ||_  _|  | _||_|  ||_| _|");
        insertLineFour.add("");

        // when:
        final String actualResult = BankOcrKata.decode(insertLineFour);

        // then:
        final String expectedResult = "1234?67?9";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if testBankOcrWhenScannedNumbersFiveIsOk.
     */
    @Test
    public void testHistoryThreTwoChecksumWentTheOK() {
        // given:
        final String sentence = "457508000";

        // when:
        final String expectedResult = "OK";
        final String actualResult = BankOcrKata.codeCheck(sentence);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if testHistoryThreeWhenIsErr.
     */
    @Test
    public void testHistoryThreeWhenIsErr() {
        // given:
        final String sentence = "664371495";

        // when:
        final String expectedResult = "ERR";
        final String actualResult = BankOcrKata.codeCheck(sentence);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if testHistoryThreeWhenIsIll.
     */
    @Test
    public void testHistoryThreeWhenIsILL() {
        // given:
        final String sentence = "664371?95";

        // when:
        final String expectedResult = "ILL";
        final String actualResult = BankOcrKata.codeCheck(sentence);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if testBankOcrWhenScannedNumbersFiveIsErrorandEight.
     */
    @Test
    public void testHistoryTwoChecksumWentTheChecksumIsCero() {
        // given:
        final String sentence = "457508000";

        // when:
        final int expectedResult = 0;
        final int actualResult = BankOcrKata.checkSumAcount(sentence);

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if testBankOcrWhenScannedNumbersFiveIsErrorandEight.
     */
    @Test
    public void testHistoryTwoChecksumWentTheChecksumIsnotCero() {
        // given:
        final String sentence = "664371495";

        // when:
        final int expectedResult = 0;
        final int actualResult = BankOcrKata.checkSumAcount(sentence);

        assertTrue(expectedResult != actualResult);
    }

    /**
     * Constructor test.
     *
     * @throws Exception Exception
     */
    @Test
    public void testConstructor() throws Exception {
        Constructor kataConstructor = BankOcrKata.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(kataConstructor.getModifiers()));
        kataConstructor.setAccessible(true);
        kataConstructor.newInstance();
    }

}
