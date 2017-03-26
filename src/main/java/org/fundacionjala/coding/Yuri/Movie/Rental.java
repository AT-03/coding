package org.fundacionjala.coding.Yuri.Movie;

/**
 * Created by YVayneR on 3/22/2017.
 */
public class Rental {
    private Movie movie;
    private int daysRented;
    /**
     * the constructor method for Rental Class.
     * @param movie the movie rented.
     * @param daysRented the days rented for a movie.
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * this method helps to retrieve the days rented for a movie.
     * @return days rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * this method helps to retrieve the movie rented.
     * @return the movie rented.
     */
    public Movie getMovie() {
        return movie;
    }
}
