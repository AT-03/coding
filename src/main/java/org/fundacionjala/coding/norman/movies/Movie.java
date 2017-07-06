package org.fundacionjala.coding.norman.movies;

/**
 * Created by NORMAN on 2/7/2017.
 */
public abstract class Movie {
    private String title;

    /**
     * Movie constructor.
     *
     * @param title of String type.
     */
    Movie(final String title) {
        this.title = title;
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
    public abstract int calculateFrequentRenterPoints(int daysRented);

    /**
     * This method returns the title of a movie.
     *
     * @return the title of the movie.
     */
    String getTitle() {
        return title;
    }
}
