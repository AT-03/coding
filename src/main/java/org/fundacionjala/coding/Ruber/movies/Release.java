package org.fundacionjala.coding.Ruber.movies;

/**
 * Created by Ruber Cuellar on 3/22/2017.
 */
public class Release extends Movie {
    private static final double RELEASE_FINE = 3;
    /**
     * Constructor.
     *
     * @param title     The movie's name
     */
    public Release(final String title) {
        super(title);
    }

    @Override
    public int getFrequentRenterPoints(final int dayRented) {
        return dayRented > 1 ? 2 : 1;
    }

    @Override
    public double getAmount(final int dayRented) {
        return dayRented * RELEASE_FINE;
    }
}
