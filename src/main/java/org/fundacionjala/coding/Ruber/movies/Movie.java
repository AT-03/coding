package org.fundacionjala.coding.Ruber.movies;

/**
 * Class Movie.
 */
public abstract class Movie {
    private final String title;

    /**
     * Constructor.
     * @param title The movie's name
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * To get movie's title.
     * @return The movie's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * To get frequent renter points.
     * @param dayRented Day's rented
     * @return int Frequent rented points
     */
    public abstract int getFrequentRenterPoints(int dayRented);

    /**
     * To get Amount.
     * @param dayRented days rented
     * @return double containing amount
     */
    public abstract double getAmount(int dayRented);
}
