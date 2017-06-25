package org.fundacionjala.coding.Fernando.movies;

/**
 * Created by Fernando.
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
     * @return movies object.
     */
    public Movie getMovie() {
        return this.movie;
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

