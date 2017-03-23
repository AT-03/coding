package org.fundacionjala.coding.danielM.movies;

/**
 * Created by Administrator on 3/7/2017.
 */

/**
 * 1.- Remove the the underscore from the variable names preceded with it.
 */

class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Rental movie's constructor.
     *
     * @param movie      receives the movie.
     * @param daysRented receives the movie's days rented.
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Getter method to obtain days a movies was rented.
     *
     * @return movies days rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Getter method to obtain the movie information.
     *
     * @return the movie object.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @return price object.
     */
    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }

    /**
     * @return calculateFrequentRenterPoint int.
     */
    public int calculateFrequentRenterPoint() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }


}
