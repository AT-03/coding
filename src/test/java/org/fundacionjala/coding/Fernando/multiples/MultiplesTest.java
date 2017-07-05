package org.fundacionjala.coding.Fernando.multiples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 03/07/2017.
 */
public class MultiplesTest {

    private static final int TWENTY_THREE = 23;
    private static final int TEN = 10;

    /**
     * Test Constructor.
     * @throws Exception if the constructor is not private.
     */
    @Test
    public void testMultiplesConstructorIsPrivate() throws Exception {
        Constructor constructor = Multiples.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
    }

    /**
     * Test multiples.
     */
    @Test
    public void test() {
        assertEquals(TWENTY_THREE, Multiples.solution(TEN));
    }
}
