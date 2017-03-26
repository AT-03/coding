package org.fundacionjala.coding.Yuri.Movie;

/**
 * Created by YVayneR on 3/22/2017.
 */
public abstract class Movie {
    private String title;

    /**
     * the method constructor for movie class.
     * @param title the title movie.
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * method to calculate the amount.
     * @param daysRented days rented movie.
     * @return the amount.
     */
    public abstract double calculateAmount(final int daysRented);

    /**
     * the method to calculate the renter points.
     * @param daysRented days rented movie.
     * @return the renter points for a movie.
     */
    public abstract int calculateFrequentRenterPoints(final int daysRented);

    /**
     * this method helps to retrieve the movie title.
     * @return the title movie.
     */
    public String getTitle() {
        return title;
    }
}
