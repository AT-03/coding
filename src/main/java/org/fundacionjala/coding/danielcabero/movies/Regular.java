package org.fundacionjala.coding.danielcabero.movies;

/**
 * Created by administrator on 3/10/2017.
 */
public class Regular extends Movie {

    private static final double PRICE_RENT = 1.5;

    private static final int DAYS = 2;

    /**
     * Regular constructor.
     *
     * @param title of String type.
     */
    Regular(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        double amount = DAYS;
        if (daysRented > DAYS) {
            amount += (daysRented - DAYS) * PRICE_RENT;
        }
        return amount;
    }

    @Override
    public int frequentPointsRenter(final int daysRented) {
        return 1;
    }
}
