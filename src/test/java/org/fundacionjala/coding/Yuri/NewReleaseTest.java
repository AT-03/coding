package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Movie.NewRelease;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by YVayneR on 3/25/2017.
 */
public class NewReleaseTest {
    /**
     * this test helps to verify the amount when days rented is less than two.
     */
    @Test
    public void calculateAmountWhenDaysRentedLessThanTwo() {
        final int daysRented = 1;
        NewRelease movie = new NewRelease("Logan");
        final double expectedResult = 3;
        final double actualResult = movie.calculateAmount(daysRented);
        Assert.assertEquals(Double.toString(expectedResult), Double.toString(actualResult));
    }

    /**
     *  this test helps to verify the calculate amount when the days rented is higher than two.
     */
    @Test
    public void calculateAmountWhenDaysRentedHighThanTwo() {
        final int daysRented = 2;
        NewRelease movie = new NewRelease("Logan");
        final double expectedResult = 6;
        final double actualResult = movie.calculateAmount(daysRented);
        Assert.assertEquals(Double.toString(expectedResult), Double.toString(actualResult));
    }
}
