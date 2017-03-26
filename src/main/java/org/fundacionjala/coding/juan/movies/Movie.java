package org.fundacionjala.coding.juan.movies;


/**
 * @author Juan Pablo
 */
public abstract class Movie {
    private String title;

    /**
     * constructor.
     *
     * @param title is the title of the movie.
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * @param daysRented the method uses this parameter to calculate the amount
     * @return the amount
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * @param daysRented the mothod uses the parameter to calculate the points.
     * @return the points
     */
    public abstract int calculateFrequentRenterPoints(int daysRented);

    /**
     * @return the moview title.
     */
    public String getTitle() {
        return title;
    }
}
