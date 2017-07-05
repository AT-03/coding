package org.fundacionjala.coding.Ruber.movies;

/**
 * Created by Ruber Cuellar on 3/22/2017.
 */
public class Regular extends Movie {
    private static final int REGULAR_AMOUNT = 2;
    private static final int REGULAR_DAYS_RENTED = 2;
    private static final double NORMAL_FINE = 1.5;
    /**
     * Constructor.
     *
     * @param title     The movie's name
     */
    public Regular(final String title) {
        super(title);
    }

    @Override
    public int getFrequentRenterPoints(final int dayRented) {
        return dayRented > 0 ? 1 : 0;
    }

    @Override
    public double getAmount(final int dayRented) {
        double thisAmount = REGULAR_AMOUNT;

        if (dayRented > REGULAR_DAYS_RENTED) {
            thisAmount += (dayRented - REGULAR_DAYS_RENTED) * NORMAL_FINE;
        }
        return thisAmount;
    }
}
