package org.fundacionjala.coding.pablo.Movies;

/**
 * Created by Administrator on 3/23/2017.
 */
public class Regular extends Movie {

    private static final double PRICE = 1.5;

    private static final int LIMITREGULAR = 2;

    /**
     * Constuct.
     * @param title string.
     */

    public Regular(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        double amount = LIMITREGULAR;
        if (daysRented > LIMITREGULAR) {
            amount += (daysRented - LIMITREGULAR) * PRICE;
        }
        return amount;
    }

    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
