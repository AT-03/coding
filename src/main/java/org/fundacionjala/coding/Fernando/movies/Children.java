package org.fundacionjala.coding.Fernando.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class Children extends Movie {
    private static final int LIMITNEWCHILD = 3;
    private static final double PRICE = 1.5;

    /**
     * @param title param.
     */
    public Children(final String title) {
        super(title);
    }

    /**
     * @param daysRented param.
     * @return double value.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        double amount = PRICE;
        if (daysRented > LIMITNEWCHILD) {
            amount += (daysRented - LIMITNEWCHILD) * PRICE;
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
