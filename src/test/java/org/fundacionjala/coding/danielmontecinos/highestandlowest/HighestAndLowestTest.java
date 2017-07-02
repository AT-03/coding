package org.fundacionjala.coding.danielmontecinos.highestandlowest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 6/19/2017.
 */
public class HighestAndLowestTest {

    /**
     * The method verifies that the Evaporator class has a private constructor.
     * @throws Exception if the constructor is not private.
     */
    @Test
    public void testHighestAndLowestConstructorIsPrivate() throws Exception {
        Constructor constructor = HighestAndLowest.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }


    /**
     * The method verifies test1.
     */
    @Test
    public void test1() {
        final String numbers = "1 2 3 4 5";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "5 1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test2.
     */
    @Test
    public void test2() {
        final String numbers = "1 2 -3 4 5";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "5 -3";

        assertEquals(expectedResult, actualResult);
    }


    /**
     * The method verifies test3.
     */
    @Test
    public void test3() {
        final String numbers = "1 9 3 4 -5";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "9 -5";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test4.
     */
    @Test
    public void test4() {
        final String numbers = "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "542 -214";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test5.
     */
    @Test
    public void test5() {
        final String numbers = "1 -1";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "1 -1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test6.
     */
    @Test
    public void test6() {
        final String numbers = "1 1";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "1 1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test7.
     */
    @Test
    public void test7() {
        final String numbers = "-1 -1";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "-1 -1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test8.
     */
    @Test
    public void test8() {
        final String numbers = "1 -1 0";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "1 -1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test9.
     */
    @Test
    public void test9() {
        final String numbers = "1 1 0";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "1 0";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test10.
     */
    @Test
    public void test10() {
        final String numbers = "-1 -1 0";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "0 -1";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test11.
     */
    @Test
    public void test11() {
        final String numbers = "42";

        final String actualResult = HighestAndLowest.highAndLowest(numbers);

        final String expectedResult = "42 42";

        assertEquals(expectedResult, actualResult);
    }

}
