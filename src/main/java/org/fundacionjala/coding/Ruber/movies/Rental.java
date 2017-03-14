package org.fundacionjala.coding.Ruber.movies;

/**
 * Class Rental.
 */
class Rental {
    private final Movie movie;
    private final int daysRented;

    /**
     * Constructor.
     * @param movie The movie's to rental
     * @param daysRented The movie's days to rent
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * To get days rented.
     * @return int with the days rented
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * To get movie's rented.
     * @return Movie the movie rented
     */
    public Movie getMovie() {
        return movie;
    }
}
