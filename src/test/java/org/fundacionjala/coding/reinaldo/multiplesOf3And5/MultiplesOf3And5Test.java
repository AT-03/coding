package org.fundacionjala.coding.reinaldo.multiplesOf3And5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 6/30/2017.
 */
public class MultiplesOf3And5Test {

    /**
     * The method verifies expectedResult = 23.
     */
    @Test
    public void testGetSolutionWhenNumberPassedIs10() {
        final int numberLimit = 10;

        final int actualResult = MultiplesOf3And5.getSolution(numberLimit);

        final int expectedResult = 23;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies expectedResult = 78.
     */
    @Test
    public void testGetSolutionWhenNumberPassedIs20() {
        final int numberLimit = 20;

        final int actualResult = MultiplesOf3And5.getSolution(numberLimit);

        final int expectedResult = 78;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies expectedResult = 9168.
     */
    @Test
    public void testGetSolutionWhenNumberPassedIs200() {

        final int numberLimit = 200;

        final int actualResult = MultiplesOf3And5.getSolution(numberLimit);

        final int expectedResult = 9168;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test constructor.
     *
     * @throws Exception construct
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = MultiplesOf3And5.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
