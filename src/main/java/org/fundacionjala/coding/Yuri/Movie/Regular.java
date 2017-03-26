package org.fundacionjala.coding.Yuri.Movie;

/**
 * Created by YVayneR on 3/22/2017.
 */
public class Regular extends Movie {

    public static final int LIMIT_DAYS_RENTED = 2;
    public static final double TAX_REGULAR_MOVIE = 1.5;

    /**
     * this is the constructor method.
     * @param title the title movie.
     */
    public Regular(final String title) {
        super(title);
    }

    /**
     * this method helps to calculate the amount for regular movies.
     * @param daysRented days rented movie.
     * @return the amount calculated.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        double amount = LIMIT_DAYS_RENTED;
        if (daysRented > LIMIT_DAYS_RENTED) {
            amount += (daysRented - LIMIT_DAYS_RENTED) * TAX_REGULAR_MOVIE;
        }
        return amount;
    }

    /**
     * this method helps to calculate the frequent renter point.
     * @param daysRented days rented movie.
     * @return the frequent renter points.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
