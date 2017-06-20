package org.fundacionjala.coding.danielmontecinos.sorttheinnercontent;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 6/20/2017.
 */
public class SortInnerContentTest {
    /**
     * The method verifies test1.
     */
    @Test
    public void test1() {
        String phrase = "sort the inner content in descending order";

        String actualResult = SortInnerContent.sortTheInnerContent(phrase);

        String expectedResult = "srot the inner ctonnet in dsnnieedcg oredr";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test2.
     */
    @Test
    public void test2() {
        String phrase = "wait for me";

        String actualResult = SortInnerContent.sortTheInnerContent(phrase);

        String expectedResult = "wiat for me";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * The method verifies test3.
     */
    @Test
    public void test3() {
        String phrase = "this kata is easy";

        String actualResult = SortInnerContent.sortTheInnerContent(phrase);

        String expectedResult = "tihs ktaa is esay";

        assertEquals(expectedResult, actualResult);
    }
}
