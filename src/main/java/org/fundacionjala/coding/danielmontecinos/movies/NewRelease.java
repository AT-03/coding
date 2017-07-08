package org.fundacionjala.coding.danielmontecinos.movies;

/**
 * Class NewRelease.
 */
public class NewRelease extends Movie {

    private static final int LIMIT_DAYS_TO_RENT_NEW_RELEASE_MOVIE = 3;

    /**
     * NewRelease constructor.
     *
     * @param title of type String.
     */
    NewRelease(final String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(final int daysRented) {
        return daysRented * LIMIT_DAYS_TO_RENT_NEW_RELEASE_MOVIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
