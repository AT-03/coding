package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Katas.EanCode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by YVayneR on 3/25/2017.
 */
public class EanCodeTest {
    /**
     * this test helps to verify that is possible to validate a valid EAN code.
     */
    @Test
    public void testEanCodeWhenTheCheckSumIsValid() {
        final String number = "4003301018398";
        EanCode code = new EanCode(number);
        Assert.assertTrue(code.isValidCode());
    }

    /**
     * this thest helps to verify that is possible to validate an invalid EAN code.
     */
    @Test
    public void testEanCodeWhenTheCheckSumIsInvalid() {
        final String number = "4003301018392";
        EanCode code = new EanCode(number);
        Assert.assertFalse(code.isValidCode());
    }
}
