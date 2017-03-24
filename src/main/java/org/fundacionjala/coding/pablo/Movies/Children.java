package org.fundacionjala.coding.pablo.Movies;

/**
 * Created by Administrator on 3/23/2017.
 */
public class Children extends Movie {

    private static final int LIMITNEWCHILD = 3;
    private static final double PRICE = 1.5;

    /**
     * Constructor.
     * @param title string.
     */

    public Children(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        double amount = PRICE;
        if (daysRented > LIMITNEWCHILD) {
            amount += (daysRented - LIMITNEWCHILD) * PRICE;
        }
        return amount;
    }

    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
