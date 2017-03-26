package org.fundacionjala.coding.juan.movies;

/**
 * @author Juan Pablo
 */
public class Children extends Movie {
    private static final int LIMINEWCHILD = 3;
    private static final double PRICE = 1.5;

    /**
     * constructor.
     * @param title  is the title of the movie.
     */
    public Children(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        double amount = PRICE;
        if (daysRented > LIMINEWCHILD) {
            amount += (daysRented - LIMINEWCHILD) * PRICE;
        }
        return amount;
    }

    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
