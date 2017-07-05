package org.fundacionjala.coding.danielcabero.movies;

/**
 * Created by administrator on 3/10/2017.
 */
public abstract class Movie {
    private String titleMovie;

    /**
     * Movie constructor.
     *
     * @param titleMovie of String type.
     */
    Movie(final String titleMovie) {
        this.titleMovie = titleMovie;
    }

    /**
     * Abstract method to calculate the amount of a rented movie.
     *
     * @param daysRented of int type.
     * @return the amount of a rented movie.
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * Abstract method to calculate the frequent renter points
     * of a rented movie.
     *
     * @param daysRented of int type.
     * @return the frequent renter points.
     */
    public abstract int frequentPointsRenter(int daysRented);

    /**
     * This method returns the titleMovie of a movie.
     *
     * @return the titleMovie of the movie.
     */
    String getTitleMovie() {
        return titleMovie;
    }
}
