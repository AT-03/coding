package org.fundacionjala.coding.juan.movies;


/**
 * @author Juan Pablo
 */
public class NewRelease extends Movie {

    private static final int LIMITNEWCHILD = 3;

    /**
     * constructor.
     * {@inheritDoc}
     *
     * @param title is the title of the moview.
     */
    public NewRelease(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        return daysRented * LIMITNEWCHILD;
    }

    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
