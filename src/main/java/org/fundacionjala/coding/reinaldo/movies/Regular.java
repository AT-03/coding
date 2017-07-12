package org.fundacionjala.coding.reinaldo.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class Regular extends Movie {

    private static final double PRICE = 1.5;

    private static final int LIMIT_REGULAR = 2;
    private static final int RESUL_FREQUENT_NUMBER = 1;

    /**
     * This is the constructor of Regular class.
     *{@inherentDoc}
     * @param title String with title for Regular.
     */
    Regular(final String title) {

        super(title);
    }

    /**
     * This is the calculateAmount of Regular movie.
     *{@inherentDoc}
     * @param daysRented String with daysRented for Regular movie.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        double amount = LIMIT_REGULAR;
        if (daysRented > LIMIT_REGULAR) {
            amount += (daysRented - LIMIT_REGULAR) * PRICE;
        }
        return amount;
    }

    /**
     * This is the calculateFrequentRenterPoints of Regular movie.
     *{@inherentDoc}
     * @param daysRented String with daysRented for Regular movie.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {

        return RESUL_FREQUENT_NUMBER;
    }
}
