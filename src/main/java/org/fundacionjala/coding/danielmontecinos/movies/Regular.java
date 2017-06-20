package org.fundacionjala.coding.danielmontecinos.movies;

/**
 * Created by Daniel Montecinos on 3/10/2017.
 */
public class Regular extends Movie {

    private static final double NO_RELEASE_MOVIE_FEE = 1.5;

    private static final int LIMIT_DAYS_TO_RENT_REGULAR_MOVIE = 2;

    /**
     * Regular constructor.
     *
     * @param title of String type.
     */
    Regular(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        double amount = LIMIT_DAYS_TO_RENT_REGULAR_MOVIE;
        if (daysRented > LIMIT_DAYS_TO_RENT_REGULAR_MOVIE) {
            amount += (daysRented - LIMIT_DAYS_TO_RENT_REGULAR_MOVIE) * NO_RELEASE_MOVIE_FEE;
        }
        return amount;
    }

    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
