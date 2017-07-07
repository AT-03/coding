package org.fundacionjala.coding.Ruber.Evaporator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ruber Cuellar on 6/28/2017.
 */

public class EvaporatorTest {

    /**
     * Test.
     */
    @Test
    public void testEvaporatorOne() {
        final int expectedResult = 22;
        final double content = 10;
        final double percentage = 10;
        final double limit = 10;

        assertEquals(expectedResult, Evaporator.evaporator(content, percentage, limit));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorTwo() {
        final int expectedResult = 29;
        final double content = 10;
        final double percentage = 10;
        final double limit = 5;

        assertEquals(expectedResult, Evaporator.evaporator(content, percentage, limit));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorThree() {
        final int expectedResult = 59;
        final double content = 100;
        final double percentage = 5;
        final double limit = 5;

        assertEquals(expectedResult, Evaporator.evaporator(content, percentage, limit));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorFour() {
        final int expectedResult = 37;
        final double content = 50;
        final double percentage = 12;
        final double limit = 1;

        assertEquals(expectedResult, Evaporator.evaporator(content, percentage, limit));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorFive() {
        final int expectedResult = 31;
        final double content = 47.5;
        final double percentage = 8;
        final double limit = 8;

        assertEquals(expectedResult, Evaporator.evaporator(content, percentage, limit));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorSix() {
        final int expectedResult = 459;
        final double content = 100;
        final double percentage = 1;
        final double limit = 1;

        assertEquals(expectedResult, Evaporator.evaporator(content, percentage, limit));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorSeven() {
        final int expectedResult = 459;
        final double content = 10;
        final double percentage = 1;
        final double limit = 1;

        assertEquals(expectedResult, Evaporator.evaporator(content, percentage, limit));
    }

    /**
     * Test.
     */
    @Test
    public void testEvaporatorEight() {
        final int expectedResult = 299;
        final double content = 100;
        final double percentage = 1;
        final double limit = 5;

        assertEquals(expectedResult, Evaporator.evaporator(content, percentage, limit));
    }

    /**
     * Constructor test.
     * @throws Exception Exception
     */
    @Test
    public void testEvaporator() throws Exception {
        Constructor evaporatorConstructor = Evaporator.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(evaporatorConstructor.getModifiers()));
        evaporatorConstructor.setAccessible(true);
        evaporatorConstructor.newInstance();
    }

}


