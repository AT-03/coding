package org.fundacionjala.coding.reinaldo.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class NewRelease extends Movie {

    private static final int LIMIT_NEW_CHILD = 3;

    private static final int NUMBER_ONE = 1;

    private static final int NUMBER_TWO = 2;

    /**
     * This is the constructor of NewRelease class.
     *
     *{@inherentDoc}
     * @param title String with title for NewRelease.
     */
    NewRelease(final String title) {

        super(title);
    }

    /**
     * This is the calculateFrequentRenterPoints of NewRelease movie.
     *{@inherentDoc}
     * @param daysRented String with daysRented for NewRelease movie.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        return daysRented * LIMIT_NEW_CHILD;
    }

    /**
     * This is the calculateFrequentRenterPoints of NewRelease movie.
     *{@inherentDoc}
     * @param daysRented String with daysRented for NewRelease movie.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return daysRented > NUMBER_ONE ? NUMBER_TWO : NUMBER_ONE;
    }
}
