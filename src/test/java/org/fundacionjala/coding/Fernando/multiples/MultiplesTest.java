package org.fundacionjala.coding.Fernando.multiples;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by PC on 03/07/2017.
 */
public class MultiplesTest {

    /**
     * Unit Test about multiples of 3 and 5.
     *
     * Test one.
     */
    @Test
    public void testOne() {
        final int expectedResult = 23;

        final int expectedVariable = 10;

        assertEquals(expectedResult, Multiples.solution(expectedVariable));
    }

    /**
     * Unit Test about multiples of 3 and 5.
     *
     * Test two.
     */
    @Test
    public void testTwo() {
        final int expectedResult = 78;

        final int expectedVariable = 20;

        assertEquals(expectedResult, Multiples.solution(expectedVariable));
    }

    /**
     * Unit Test about multiples of 3 and 5.
     *
     * Test three.
     */
    @Test
    public void testThree() {
        final int expectedResult = 9168;

        final int expectedVariable = 200;

        assertEquals(expectedResult, Multiples.solution(expectedVariable));
    }

    /**
     * Unit test if is zero.
     */
    @Test
    public void testFour() {
        final int expectedResult = 0;

        final int expectedVariable = 0;

        assertEquals(expectedResult, Multiples.solution(expectedVariable));
    }

    /**
     * Test constructor.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = Multiples.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
