package org.fundacionjala.coding.norman.evaporator;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class EvaporatorTest {

    /**
     * Constructor test.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = Evaporator.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test to work correctly.
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, Evaporator.evaporator(10, 10, 10));
        assertEquals(29, Evaporator.evaporator(10, 10, 5));
        assertEquals(59, Evaporator.evaporator(100, 5, 5));
        assertEquals(37, Evaporator.evaporator(50, 12, 1));
        assertEquals(31, Evaporator.evaporator(47.5, 8, 8));
        assertEquals(459, Evaporator.evaporator(100, 1, 1));
        assertEquals(459, Evaporator.evaporator(10, 1, 1));
        assertEquals(299, Evaporator.evaporator(100, 1, 5));

    }


}
