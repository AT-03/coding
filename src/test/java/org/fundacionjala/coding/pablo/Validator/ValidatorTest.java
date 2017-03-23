package org.fundacionjala.coding.pablo.Validator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PABLO on 3/22/2017.
 */
public class ValidatorTest {

    /**
     * Test about Validator EAN class.
     */

    @Test
    public void validatorEANIfStringNumberHasEqualsTO13() {

        //given
        final String input = "4003301018398";

        //when
        final boolean actualResult = Validator.validator(input);

        //then
        final boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }

}
