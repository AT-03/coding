package org.fundacionjala.coding.reinaldoA.spinWords.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class Regular extends Movie {

    private static final double PRICE = 1.5;

    private static final int LIMITREGULAR = 2;

    /**
     * This is the constructor of Regular class.
     * @param title String with title for Regular.
     */
    public Regular(final String title) {

        super(title);
    }
    /**
     * This is the calculateAmount of Regular movie.
     * @param daysRented String with daysRented for Regular movie.
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
     * This is the calculateFrequentRenterPoints of Regular movie.
     * @param daysRented String with daysRented for Regular movie.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
