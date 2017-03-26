package org.fundacionjala.coding.Yuri;

import org.fundacionjala.coding.Yuri.Movie.Children;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by YVayneR on 3/23/2017.
 */
public class ChildrenTest {

    /**
     * this test helps to verify the calculateAmount when days rented is less than three.
     */
    @Test
    public void testCalculateAmountWhenDaysRentedLessThanThree() {
        Children movie = new Children("Batman");
        final double expectedAmount = 1.5;
        final int daysRented = 2;
        Assert.assertEquals(Double.toString(expectedAmount), Double.toString(movie.calculateAmount(daysRented)));
    }

    /**
     * this test helps to verify the calculateAmount when days rented is higher than three.
     */
    @Test
    public void testCalculateAmountWhenDaysRentedHigherThanThree() {
        Children movie = new Children("Batman");
        final double expectedAmount = 3.0;
        final int daysRented = 4;
        Assert.assertEquals(Double.toString(expectedAmount), Double.toString(movie.calculateAmount(daysRented)));
    }

    /**
     * this test helps to verify the frequent renter points for a children movie.
     */
    @Test
    public void testCalculateFrequentRenterPoints() {
        Children movie = new Children("Batman");
        final int expectedFrequentRenterPoints = 1;
        final int daysRented = 4;
        Assert.assertEquals(expectedFrequentRenterPoints, movie.calculateFrequentRenterPoints(daysRented));
    }
}
