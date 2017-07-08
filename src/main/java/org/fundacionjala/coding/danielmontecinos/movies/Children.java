package org.fundacionjala.coding.danielmontecinos.movies;

/**
 * Class Children.
 */
public class Children extends Movie {
    private static final int LIMIT_DAYS_TO_RENT_CHILDREN_MOVIE = 3;
    private static final double NO_RELEASE_MOVIE_FEE = 1.5;
    private static final int ONE = 1;

    /**
     * Children constructor.
     *
     * @param title of String type.
     */
    Children(final String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(final int daysRented) {
        double amount = NO_RELEASE_MOVIE_FEE;
        if (daysRented > LIMIT_DAYS_TO_RENT_CHILDREN_MOVIE) {
            amount += (daysRented - LIMIT_DAYS_TO_RENT_CHILDREN_MOVIE) * NO_RELEASE_MOVIE_FEE;
        }
        return amount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return ONE;
    }
}
