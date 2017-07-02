package org.fundacionjala.coding.pablo.Validator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by PABLO on 3/22/2017.
 */
public class ValidatorTest {

    /**
     * Test when has 13 digits.
     */

    @Test
    public void validatorEANIfStringNumberHasEqualsTO13() {

        //given
        final String input = "4003301018398";

        //when
        final boolean actualResult = Validator.validator(input);

        //then
        assertTrue(actualResult);
    }

    /**
     * Test when has 13 digits.
     *
     * Test two.
     */

    @Test
    public void validatorEANTestTwoIfStringNumberHasEqualsTO13() {

        //given
        final String input = "4006381333931";

        //when
        final boolean actualResult = Validator.validator(input);

        //then
        assertTrue(actualResult);
    }

    /**
     * Test when the checksum is equals to 0.
     */
    @Test
    public void validatorEANIfChecksumIsEqualsTo0() {

        //given
        final String input = "4003301018392";

        //when
        final boolean actualResult = Validator.validator(input);

        //then
        assertFalse(actualResult);
    }

    /**
     * Test when the checksum is equals to 0.
     *
     * Test two.
     */
    @Test
    public void validatorEANTestTwoIfChecksumIsEqualsTo0() {

        //given
        final String input = "73513536";

        //when
        final boolean actualResult = Validator.validator(input);

        //then
        assertTrue(!actualResult);
    }

    /**
     * Test EAN validator.
     *
     * Test three.
     */
    @Test
    public void validatorEANTestThree() {

        //given
        final String input = "73513536";

        //when
        final boolean actualResult = Validator.validator(input);

        //then
        assertFalse(actualResult);
    }
}
