package org.fundacionjala.coding.danielcabero.movies;

/**
 * Created by administrator on 3/10/2017.
 */
public class Children extends Movie {
    private static final int CHILDREN_DAYS = 3;
    private static final double PRICE = 1.5;

    /**
     * Children constructor.
     *
     * @param title of String type.
     */
    Children(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        double amount = PRICE;
        if (daysRented > CHILDREN_DAYS) {
            amount += (daysRented - CHILDREN_DAYS) * PRICE;
        }
        return amount;
    }

    @Override
    public int frequentPointsRenter(final int daysRented) {
        return 1;
    }
}
