package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Movie.Regular;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by YVayneR on 3/25/2017.
 */
public class RegularTest {
    /**
     * test to verify the calculate amount for a regular movie when days rented is less than two.
     */
    @Test
    public void testCalculateAmountWhenDaysRentedLessThanTwo() {
        final int daysRented = 1;
        final double expectedResult = 2;
        Regular movie = new Regular("Rambo");
        Assert.assertEquals(Double.toString(expectedResult), Double.toString(movie.calculateAmount(daysRented)));
    }

    /**
     * test to verify the calculate amount for a regular movie when days rented is higher than two.
     */
    @Test
    public void testCalculateAmountWhenDaysRentedHighThanTwo() {
        final int daysRented = 3;
        final double expectedResult = 3.5;
        Regular movie = new Regular("Rambo");
        Assert.assertEquals(Double.toString(expectedResult), Double.toString(movie.calculateAmount(daysRented)));
    }

    /**
     * test to verify that is possible to generate the frequent renter points.
     */
    @Test
    public void testCalculateFrequentRenterPoints() {
        Regular movie = new Regular("Batman");
        final int expectedFrequentRenterPoints = 1;
        final int daysRented = 4;
        Assert.assertEquals(expectedFrequentRenterPoints, movie.calculateFrequentRenterPoints(daysRented));
    }
}
