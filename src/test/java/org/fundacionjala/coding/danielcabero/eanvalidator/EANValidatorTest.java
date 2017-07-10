package org.fundacionjala.coding.danielcabero.eanvalidator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by administrator on 3/10/2017.
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
        assertFalse(actualResult);
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
        assertFalse(actualResult);
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

    /**
     *
     * @throws Exception test constructor.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = EANValidator.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}

