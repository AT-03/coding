package org.fundacionjala.coding.danielcabero.movies;

/**
 * Created by administrator on 3/10/2017.
 */

class Rental {
    private Movie movieTitle;
    private int daysRent;

    /**
     * Rental movieTitle's constructor.
     *
     * @param movieTitle      receives the movieTitle.
     * @param daysRent receives the movieTitle's daysRent rented.
     */
    Rental(final Movie movieTitle, final int daysRent) {
        this.movieTitle = movieTitle;
        this.daysRent = daysRent;
    }

    /**
     * Getter method to obtain daysRent a movies was rented.
     *
     * @return movies daysRent rented.
     */
    public int getDaysRent() {
        return daysRent;
    }

    /**
     * Getter method to obtain the movieTitle information.
     *
     * @return the movieTitle object.
     */
    Movie getMovieTitle() {
        return movieTitle;
    }

    /**
     * @return price object.
     */
    double calculateAmount() {
        return movieTitle.calculateAmount(daysRent);
    }

    /**
     * @return calculateFrequentRenterPoint int.
     */
    int calculateFrequentRenterPoint() {
        return movieTitle.frequentPointsRenter(daysRent);
    }


}
