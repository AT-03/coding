package org.fundacionjala.coding.norman.movie;

/**
 * Created by Administrator on 3/21/2017.
 */
public abstract class Movie {
    private String title;

    /**
     * @param title of movie.
     */
    public Movie(final String title) {
        this.title = title;
    }
    /**
     * @param daysRented int number.
     * @return calculateAmount.
     */
    public abstract double calculateAmount(int daysRented);
    /**
     * @param daysRented int days.
     * @return calculateFrequentRenterPoint .
     */
    public abstract int calculateFrequentRenterPoints(int daysRented);
    /**
     *
     * @return getTitle.
     */
    public String getTitle() {
        return title;
    }
}
