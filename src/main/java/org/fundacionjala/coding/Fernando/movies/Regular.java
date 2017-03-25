package org.fundacionjala.coding.Fernando.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class Regular extends Movie {

    private static final double PRICE = 1.5;

    private static final int LIMITREGULAR = 2;
    /**
     * @param title param.
     */
    public Regular(final String title) {
        super(title);
    }
    /**
     * @param daysRented param.
     * @return double value.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        double amount = LIMITREGULAR;
        if (daysRented > LIMITREGULAR) {
            amount += (daysRented - LIMITREGULAR) * PRICE;
        }
        return amount;
    }
    /**
     * @param daysRented param.
     * @return int value.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
