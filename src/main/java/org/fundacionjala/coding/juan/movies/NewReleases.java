package org.fundacionjala.coding.juan.movies;


/**
 * @author Juan Pablo
 */
public class NewReleases extends Movie {

    private static final int LIMIT_NEW_CHILD = 3;

    /**
     * constructor.
     * {@inheritDoc}
     * @param title is the title of the moview.
     */
    public NewReleases(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        return daysRented * LIMIT_NEW_CHILD;
    }

    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
