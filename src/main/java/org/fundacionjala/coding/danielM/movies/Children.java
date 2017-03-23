package org.fundacionjala.coding.danielM.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class Children extends Movie {
    private static final int LIMIT_DAYS_TO_RENT_CHILDREN_MOVIE = 3;
    private static final double NO_RELEASE_MOVIE_FEE = 1.5;

    /**
     * Children constructor.
     *
     * @param title of String type.
     */
    public Children(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        double amount = NO_RELEASE_MOVIE_FEE;
        if (daysRented > LIMIT_DAYS_TO_RENT_CHILDREN_MOVIE) {
            amount += (daysRented - LIMIT_DAYS_TO_RENT_CHILDREN_MOVIE) * NO_RELEASE_MOVIE_FEE;
        }
        return amount;
    }

    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
