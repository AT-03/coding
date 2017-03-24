package org.fundacionjala.coding.pablo.Movies;

/**
 * Created by Administrator on 3/23/2017.
 */
public class NewRelease extends Movie {
    private static final int LIMITNEWCHILD = 3;

    /**
     * Construct.
     * @param title string.
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
