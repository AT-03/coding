package org.fundacionjala.coding.juan;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Administrator on 3/10/2017.
 */
public class eanValidatorTest {
    @Test
    public void testingEanCode() {
        eanValidator validate=new eanValidator();
        assertTrue(validate.validating("9783815820865"));
    }
}