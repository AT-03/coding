package org.fundacionjala.coding.danielmontecinos.eanvalidator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Class to test EANValidator class.
 */
public class EANValidatorTest {

    /**
     * The method verifies that the EANValidator class has a private constructor.
     *
     * @throws Exception if the constructor is not private.
     */
    @Test
    public void testEANValidatorConstructorIsPrivate() throws Exception {
        Constructor constructor = EANValidator.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
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
        assertNotEquals(0, actualResult);
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
