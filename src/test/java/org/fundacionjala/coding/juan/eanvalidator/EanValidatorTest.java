package org.fundacionjala.coding.juan.eanvalidator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
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
        assertFalse(actualResult);
    }

    /**
     * test.
     */
    @Test
    public void testtingEanValidaor() {
        // given:
        final String eanStringNumber = "9783815820864";
        //when:
        final boolean actualResult = EanValidator.validating(eanStringNumber);
        //then:
        assertFalse(actualResult);
    }

    /**
     * Test.
     */
    @Test
    public void testingEanValidator() {
        // given:
        final String eanStringNumber = "9783827317100";
        //when:
        final boolean actualResult = EanValidator.validating(eanStringNumber);
        //then
        assertTrue(actualResult);

    }

    /**
     * Test constructor.
     *
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = EanValidator.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
