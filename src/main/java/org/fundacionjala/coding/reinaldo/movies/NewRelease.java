package org.fundacionjala.coding.reinaldo.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class NewRelease extends Movie {

    private static final int LIMITNEWCHILD = 3;

    /**
     * This is the constructor of NewRelease class.
     * @param title String with title for NewRelease.
     */
    NewRelease(final String title) {

        super(title);
    }
    /**
     * This is the calculateFrequentRenterPoints of NewRelease movie.
     * @param daysRented String with daysRented for NewRelease movie.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        return daysRented * LIMITNEWCHILD;
    }

    /**
     * This is the calculateFrequentRenterPoints of NewRelease movie.
     * @param daysRented String with daysRented for NewRelease movie.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
