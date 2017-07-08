package org.fundacionjala.coding.norman.eanvalidator;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class EANValidatorTest {
    /**
     * Constructor test.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = EANValidator.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
    /**
     * Test when the EAN string number has exactly 13 digits.
     */
    @Test
    public void testCheckLengthWhenTheEANStringNumberHasExactly13Digits() {
        // given:
        final String eanStringNumber = "4003301018398";

        // when:
        final boolean actualResult = eanStringNumber.length() == 13;

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
        final boolean actualResult = eanStringNumber.length() < 13;

        // then:
        assertTrue(actualResult);
    }

    /**
     * Test when the EAN string number has more than 13 digits.
     */
    @Test
    public void testCheckLengthTheEANStringNumberHasMoreThan13Digits() {
        // given:
        final String eanStringNumber = "40033010183980";

        // when:
        final boolean actualResult = eanStringNumber.length() > 13;

        // then:
        assertTrue(actualResult);
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
        assertFalse(actualResult);
    }

}
