package org.fundacionjala.coding.Ruber.movies;

/**
 * Created by Ruber Cuellar on 3/22/2017.
 */
public class Childrens extends Movie {
    private static final double NORMAL_FINE = 1.5;
    private static final double CHILDRENS_AMOUNT = 1.5;
    private static final int CHILDRENS_DAYS_RENTED = 3;
    /**
     * Constructor.
     *
     * @param title     The movie's name
     */
    public Childrens(final String title) {
        super(title);
    }

    @Override
    public int getFrequentRenterPoints(final int dayRented) {
        return dayRented > 0 ? 1 : 0;
    }

    @Override
    public double getAmount(final int dayRented) {
        double thisAmount = CHILDRENS_AMOUNT;
        if (dayRented > CHILDRENS_DAYS_RENTED) {
            thisAmount += (dayRented - CHILDRENS_DAYS_RENTED) * NORMAL_FINE;
        }
        return thisAmount;
    }
}
