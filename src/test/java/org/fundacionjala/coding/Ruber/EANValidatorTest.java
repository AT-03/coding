package org.fundacionjala.coding.Ruber;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ruber Cuellar on 3/6/2017.
 */
public class EANValidatorTest {

    /**
     * Test valid number.
     */
    @Test
    public void testEANValidatorValidNumber() {
        // given
        final String num = "4003301018398";

        // when
        final boolean actualResult = EANValidator.validate(num);

        // then
        Assert.assertTrue(actualResult);
    }

    /**
     * Test No valid number.
     */
    @Test
    public void testEANValidatorNoValidNumber() {
        // given
        final String num = "4003301018392";

        // when
        final boolean actualResult = EANValidator.validate(num);

        // then
        Assert.assertFalse(actualResult);
    }

    /**
     * Constructor test.
     * @throws Exception Exception
     */
    @Test
    public void testConstructor() throws Exception {
        Constructor constructor = EANValidator.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
