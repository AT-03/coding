package org.fundacionjala.coding.norman.movie;

/**
 * Created by Administrator on 3/21/2017.
 */
public class NewRelease extends Movie {

    private static final int LIMITNEWCHILD = 3;
    /**
     * contructor NewRelease.
     * @param title string title.
     */
    public NewRelease(final String title) {
        super(title);
    }
    /**
     * @param daysRented .
     * @return double of calculateAmount.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        return daysRented * LIMITNEWCHILD;
    }
    /**
     * @return calculateFrequentRenterPoint int.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
