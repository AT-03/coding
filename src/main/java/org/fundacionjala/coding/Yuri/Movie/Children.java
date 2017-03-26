package org.fundacionjala.coding.Yuri.Movie;

/**
 * Created by YVayneR on 3/22/2017.
 */
public class Children extends Movie {

    public static final double CHILDREN_TAX = 1.5;
    public static final int DAYS_LIMIT_RENTAL = 3;

    /**
     * Method constructor for class children.
     * @param title the movie title.
     */
    public Children(final String title) {
        super(title);
    }

    /**
     * This method helps to calculate the amount for the children movie.
     * @param daysRented the days rented.
     * @return the amount calculated.
     */
    @Override
    public double calculateAmount(final int daysRented) {
        double amount = CHILDREN_TAX;
        if (daysRented > DAYS_LIMIT_RENTAL) {
            amount += (daysRented - DAYS_LIMIT_RENTAL) * CHILDREN_TAX;
        }
        return amount;
    }
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }

}
