package org.fundacionjala.coding.Fernando.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public abstract class Movie {
    private String title;

    /**
     * @param title param.
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * @param daysRented param.
     * @return double value.
     */
    public abstract double calculateAmount(final int daysRented);

    /**
     * @param daysRented param.
     * @return int value.
     */
    public abstract int calculateFrequentRenterPoints(final int daysRented);

    /**
     * @return String value.
     */
    public String getTitle() {
        return title;
    }
}
