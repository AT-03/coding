package org.fundacionjala.coding.danielmontecinos.multiplesof3and5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 6/19/2017.
 */
public class MultiplesOf3And5Test {

    /**
     * The method verifies test1.
     */
    @Test
    public void testGetSolutionWhenNumberPassedIs10() {
        final int numberLimit = 10;

        final int actualResult = MultiplesOf3And5.getSolution(numberLimit);

        final int expectedResult = 23;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test2.
     */
    @Test
    public void testGetSolutionWhenNumberPassedIs20() {
        final int numberLimit = 20;

        final int actualResult = MultiplesOf3And5.getSolution(numberLimit);

        final int expectedResult = 78;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test3.
     */
    @Test
    public void testGetSolutionWhenNumberPassedIs200() {
        final int numberLimit = 200;

        final int actualResult = MultiplesOf3And5.getSolution(numberLimit);

        final int expectedResult = 9168;

        assertEquals(expectedResult, actualResult);
    }
}
