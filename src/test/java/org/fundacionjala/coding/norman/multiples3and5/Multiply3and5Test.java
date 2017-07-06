package org.fundacionjala.coding.norman.multiples3and5;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class Multiply3and5Test {

    /**
     * Constructor test.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = Multiply3and5.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
    /**
     * Test of multiply 3 and 5.
     */
    @Test
    public void test() {
        assertEquals(23, Multiply3and5.solution(10));
        assertEquals(78, Multiply3and5.solution(20));
        assertEquals(9168, Multiply3and5.solution(200));
    }

}
