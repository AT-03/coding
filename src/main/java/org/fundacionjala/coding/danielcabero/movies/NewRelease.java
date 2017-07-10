package org.fundacionjala.coding.danielcabero.movies;

/**
 * Created by administrator on 3/10/2017.
 */
public class NewRelease extends Movie {

    private static final int NEW_RELEASE_DAYS = 3;

    /**
     * NewRelease constructor.
     *
     * @param title of type String.
     */
    NewRelease(final String title) {
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
        return daysRented * NEW_RELEASE_DAYS;
    }

    /**
     * This method calculates the frequent renter points
     * of a new release rented movie.
     *
     * @param daysRented of int type.
     * @return 1 or 2.
     */
    @Override
    public int frequentPointsRenter(final int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}