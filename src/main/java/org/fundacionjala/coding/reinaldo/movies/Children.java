package org.fundacionjala.coding.reinaldo.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public class Children extends Movie {
    private static final int LIMIT_NEW_CHILD = 3;
    private static final double PRICE = 1.5;

    /**
     * This is the constructor of Children class.
     * {@inherentDoc}
     * @param title String with title for Children movie.
     */
    Children(final String title) {

        super(title);
    }

    /**
     * This is the calculateAmount of Children movie.
     * {@inherentDoc}
     * @param daysRented Int with daysRented for Children movie.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        double amount = PRICE;
        if (daysRented > LIMIT_NEW_CHILD) {
            amount += (daysRented - LIMIT_NEW_CHILD) * PRICE;
        }
        return amount;
    }

    /**
     * This is the calculateFrequentRenterPoints of Children movie.
     * {@inherentDoc}
     * @param daysRented String with daysRented for Children movie.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
