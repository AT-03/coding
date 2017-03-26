package org.fundacionjala.coding.Yuri.Movie;

/**
 * Created by YVayneR on 3/22/2017.
 */
public class NewRelease extends Movie {

    public static final int DAYS_LIMIT_RENT = 3;
    /**
     * Method constructor for NewRelease class.
     * @param title the movie title.
     */
    public NewRelease(final String title) {
        super(title);
    }
    /**
     * this method helps to calculate the amount for a new release movie.
     * @param daysRented days rented movie.
     * @return the amount.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        return daysRented * DAYS_LIMIT_RENT;
    }
    /**
     * this method helps to calculate the frequent renter points.
     * @param daysRented days rented movie.
     * @return the frequent renter points value.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return daysRented >  1 ? 2 : 1;
    }
}
