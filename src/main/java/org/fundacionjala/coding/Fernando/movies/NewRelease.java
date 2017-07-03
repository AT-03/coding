package org.fundacionjala.coding.Fernando.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class NewRelease extends Movie {

    private static final int LIMITNEWCHILD = 3;

    /**
     * @param title param.
     */
    public NewRelease(final String title) {
        super(title);
    }

    /**
     * @param daysRented param.
     * @return double value.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        return daysRented * LIMITNEWCHILD;
    }

    /**
     * @param daysRented param.
     * @return Children value.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
