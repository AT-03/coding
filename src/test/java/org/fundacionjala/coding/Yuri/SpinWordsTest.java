package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.YVR.SpinWords;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Win7-VM-01 on 28/02/2017.
 */


public class SpinWordsTest {
    @Test
    public void test() {
        Assert.assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }

}