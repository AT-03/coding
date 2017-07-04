package org.fundacionjala.coding.norman.kata.movies;

/**
 * Created by NORMAN on 2/7/2017.
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
    Rental(final Movie movie, final int daysRented) {
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
    Movie getMovie() {
        return movie;
    }

    /**
     * @return price object.
     */
    double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }

    /**
     * @return calculateFrequentRenterPoint int.
     */
    int calculateFrequentRenterPoint() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }


}
