package org.fundacionjala.coding.YVR;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Win7-VM-01 on 28/02/2017.
 */


public class SpinWordsTest {
    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }

}