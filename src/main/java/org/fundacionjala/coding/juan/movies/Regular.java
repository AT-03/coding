package org.fundacionjala.coding.juan.movies;


/**
 * @author Juan Pablo
 */
public class Regular extends Movie {

    private static final double PRICE = 1.5;
    private static final int ONE = 1;
    private static final int LIMITREGULAR = 2;

    /**
     * @param title is the movie title.
     */
    public Regular(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        double amount = PRICE;
        if (daysRented > LIMITREGULAR) {
            amount += (daysRented - LIMITREGULAR) * PRICE;
        }
        return amount;
    }

    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return ONE;
    }
}
