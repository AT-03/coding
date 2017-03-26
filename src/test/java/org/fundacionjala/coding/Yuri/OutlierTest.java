package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Katas.FindOutlier;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Win7-VM-01 on 28/02/2017.
 */
public class OutlierTest {
    /**
     * this test helps to verify the liar when is an odd number.
     */
    @Test
    public void testFindOutlierWhenIsOdd() {
        final int[] numbers = {2, 6, 8, -10, 3};
        final int expectedResult = 3;
        Assert.assertEquals(expectedResult, FindOutlier.find(numbers));
    }

    /**
     * this test helps to verify the liar when is an even number.
     */
    @Test
    public void testFindOutlierWhenIsEven() {
        final int[] numbers = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        final int expectedResult = 206847684;
        Assert.assertEquals(expectedResult, FindOutlier.find(numbers));
    }

    /**
     * this test helps to verify the liar when is zero.
     */
    @Test
    public void testFindOutlierWhenIsZero() {
        final int[] numbers = {Integer.MAX_VALUE, 0, 1};
        final int expectedResult = 0;
        Assert.assertEquals(expectedResult, FindOutlier.find(numbers));
    }
}
