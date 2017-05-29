package org.fundacionjala.coding.reinaldoA.spinWords.AverageExamen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

/**
 * Created by reinaldo on 26/03/2017.
 */
public class AverageTest {

    /**
     * This verify test Calculate Average When The Array Have FiveElements.
     */
    @Test
    public void testCalculateAverageWhenTheArrayHaveFiveElements() {
        // given:
        final int[] sentece = {2, 2, 2, 2, 2};

        // when:
        final double[] actualResultOne = Average.averagesCalculate(sentece);

        // then:
        final double[] expectedResultOne = {2.0, 2.0, 2.0, 2.0};
        assertEquals(Arrays.toString(expectedResultOne), Arrays.toString(actualResultOne));

        // given:
        final int[] sentence = {1, 3, 5, 1, -10};

        // when:
        final double[] actualResultTwo = Average.averagesCalculate(sentence);

        // then:
        final double[] expectedResultTwo = {2.0, 4.0, 3.0, -4.5};
        assertEquals(Arrays.toString(expectedResultTwo), Arrays.toString(actualResultTwo));

        // given:
        final int[] setence = {2, -2, 2, -2, 2};

        // when:
        final double[] actualResultThree = Average.averagesCalculate(setence);

        // then:
        final double[] expectedResultThree = {0.0, 0.0, 0.0, 0.0};
        assertEquals(Arrays.toString(expectedResultThree), Arrays.toString(actualResultThree));

    }

    /**
     * This verify test Calculate Average When The Array Is Null.
     */
    @Test
    public void testCalculateAverageWhenTheArrayIsNull() {
        // given:
        final int[] sentence = null;

        // when:
        final double[] actualResult = Average.averagesCalculate(sentence);

        // then:
        final double[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * This test verify Calculate Average When The Array Is Empty.
     */
    @Test
    public void testCalculateAverageWhenTheArrayIsEmpty() {
        // give:
        final int[] setence = {};

        // when:
        final double[] actualResult = Average.averagesCalculate(setence);

        // then:
        final double[] expectedResult = {};

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    /**
     * This test verify Calculate Average When The Array Has Only One Element.
     */
    @Test
    public void testCalculateAverageWhenTheArrayHasOnlyOneElement() {
        // given:
        final int[] setence = {2};

        // when:
        final double[] actualResult = Average.averagesCalculate(setence);

        // then:
        final double[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}
