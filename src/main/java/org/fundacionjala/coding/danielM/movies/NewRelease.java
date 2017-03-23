package org.fundacionjala.coding.danielM.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class NewRelease extends Movie {

    private static final int LIMIT_DAYS_TO_RENT_NEW_RELEASE_MOVIE = 3;

    /**
     * NewRelease constructor.
     *
     * @param title of type String.
     */
    public NewRelease(final String title) {
        super(title);
    }

    /**
     * This method calculates the amount of a new release rented movie.
     *
     * @param daysRented of int type.
     * @return the amount of a new release rented movie.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        return daysRented * LIMIT_DAYS_TO_RENT_NEW_RELEASE_MOVIE;
    }

    /**
     * This method calculates the frequent renter points
     * of a new release rented movie.
     *
     * @param daysRented of int type.
     * @return
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
