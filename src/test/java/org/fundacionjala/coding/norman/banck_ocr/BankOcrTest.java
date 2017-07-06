package org.fundacionjala.coding.norman.banck_ocr;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class BankOcrTest {
    /**
     * Test if testBankOcrWhenScannedNumbersCero.
     */
    @Test
    public void testBankOcrWhenScannedNumbersCero() {
        // given:
        List<String> insertLineFour = Arrays.asList(
                " _ "
                        + "| |"
                        + "|_|"
        );

        // when:
        HistoryOneBankOcr bankOcr = new HistoryOneBankOcr();
        String actualResult = bankOcr.verificationLineNumber(insertLineFour);

        // then:
        String expectedResult = "0";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if testBankOcrWhenScannedNumbersCeroToNine.
     */
    @Test
    public void testBankOcrWhenScannedNumbersCeroToNine() {
        // given:
        List<String> insertLineFour = Arrays.asList(
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
        );

        // when:
        HistoryOneBankOcr bankOcr = new HistoryOneBankOcr();
        String actualResult = bankOcr.verificationLineNumber(insertLineFour);

        // then:
        String expectedResult = "0123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test if testBankOcrWhenScannedNumbersFiveIsErrorandEight.
     */
    @Test
    public void testBankOcrWhenScannedNumbersFiveIsErrorandEight() {
        // given:
        List<String> insertLineFour = Arrays.asList(
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

                ":>",

                " __"
                        + "|__"
                        + "|__|",

                "__ "
                        + "  |"
                        + "  |",

                "g",

                " _ "
                        + "|_|"
                        + " _|"
        );

        // when:
        HistoryOneBankOcr bankOcr = new HistoryOneBankOcr();
        String actualResult = bankOcr.verificationLineNumber(insertLineFour);

        // then:
        String expectedResult = "01234?67?9";
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
        HistoryThreeErrFall historyTwo = new HistoryThreeErrFall();
        String actualResult = historyTwo.verificateNumber(sentence);

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
        HistoryThreeErrFall historyTwo = new HistoryThreeErrFall();
        String actualResult = historyTwo.verificateNumber(sentence);

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
        HistoryThreeErrFall historyTwo = new HistoryThreeErrFall();
        String actualResult = historyTwo.verificateNumber(sentence);

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
        HistoryTwoChecksum historyTwo = new HistoryTwoChecksum();
        final int actualResult = historyTwo.checkSumAcount(sentence);

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
        HistoryTwoChecksum historyTwo = new HistoryTwoChecksum();
        final int actualResult = historyTwo.checkSumAcount(sentence);

        assertTrue(expectedResult != actualResult);
    }

    /**
     * This verified the map.
     */
    @Test
    public void whenCompareToString() {
        String line = " _ "
                + "| |"
                + "|_|";
        FileNumberBankOcr fileNumberBankOcr = new FileNumberBankOcr();
        String resulActual = fileNumberBankOcr.comparation(line);
        assertEquals("0", resulActual);
    }
}
