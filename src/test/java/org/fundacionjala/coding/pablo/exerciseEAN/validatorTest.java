package org.fundacionjala.coding.pablo.exerciseEAN;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PABLO on 3/12/2017.
 */
public class validatorTest {
    @Test
    public void verify(){
        validator val = new validator();
        //validator val = new validator("4003301018398");
        assertTrue(val.validator("4003301018398"));
        assertFalse(val.validator("4003301018392"));
    }
}