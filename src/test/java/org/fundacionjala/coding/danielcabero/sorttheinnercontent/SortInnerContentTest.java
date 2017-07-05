package org.fundacionjala.coding.danielcabero.sorttheinnercontent;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    /**
     *
     * @throws Exception for test constructor.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = SortInnerContent.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
