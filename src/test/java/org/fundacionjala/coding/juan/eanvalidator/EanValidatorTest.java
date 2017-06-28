package org.fundacionjala.coding.juan.eanvalidator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Juan on 3/10/2017.
 */
public class EanValidatorTest {
    /**
     * Testing when has 13 digits.
     */
    @Test
    public void testCheckLengthWhenTheEANStringNumberHasExactly13Digits() {
        // given:
        final String eanStringNumber = "4003301018398";

        // when:
        final boolean actualResult = EanValidator.validating(eanStringNumber);

        // then:
        assertTrue(actualResult);
    }

    /**
     * Test when the EAN string number has less than 13 digits.
     */

    @Test
    public void testValidateTheCheckSumIsDifferentFromZero() {
        // given:
        final String eanStringNumber = "4003301018398";

        // when:
        final boolean actualResult = EanValidator.validating(eanStringNumber);

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
        final boolean actualResult = EanValidator.validating(eanStringNumber);

        // then:
        assertTrue(!actualResult);
    }
}
