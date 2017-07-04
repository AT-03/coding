package org.fundacionjala.coding.norman.kata.eanvalidator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class EANValidatorTest {
    /**
     * Test when the EAN string number has exactly 13 digits.
     */
    @Test
    public void testCheckLengthWhenTheEANStringNumberHasExactly13Digits() {
        // given:
        final String eanStringNumber = "4003301018398";

        // when:
        final boolean actualResult = EANValidator.checkCorrectLength(eanStringNumber);

        // then:
        assertTrue(actualResult);
    }

    /**
     * Test when the EAN string number has less than 13 digits.
     */
    @Test
    public void testCheckLengthWhenTheEANStringNumberHasLessThan13Digits() {
        // given:
        final String eanStringNumber = "400330101839";

        // when:
        final boolean actualResult = EANValidator.checkCorrectLength(eanStringNumber);

        // then:
        assertTrue(!actualResult);
    }

    /**
     * Test when the EAN string number has more than 13 digits.
     */
    @Test
    public void testCheckLengthTheEANStringNumberHasMoreThan13Digits() {
        // given:
        final String eanStringNumber = "40033010183980";

        // when:
        final boolean actualResult = EANValidator.checkCorrectLength(eanStringNumber);

        // then:
        assertTrue(!actualResult);
    }

    /**
     * Test when the EAN string number checksum is different from 0.
     */
    @Test
    public void testValidateTheCheckSumIsDifferentFromZero() {
        // given:
        final String eanStringNumber = "4003301018398";

        // when:
        final boolean actualResult = EANValidator.validate(eanStringNumber);

        // then:
        assertTrue(actualResult);
    }

    /**
     * Test when the EAN string number checksum is equal to 0.
     */
    @Test
    public void testValidateTheCheckSumIsEqualToZero() {
        // given:
        final String eanStringNumber = "4003301018392";

        // when:
        final boolean actualResult = EANValidator.validate(eanStringNumber);

        // then:
        assertTrue(!actualResult);
    }

}
