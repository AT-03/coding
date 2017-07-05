package org.fundacionjala.coding.reinaldo.movies;

/**
 * Created by reinaldo on 11/03/2017.
 */
class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * @param movie      Movie.
     * @param daysRented DaysRented.
     */
    Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * @return the daysRented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * @return movie object.
     */
    Movie getMovie() {
        return this.movie;
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

