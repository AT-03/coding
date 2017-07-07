package org.fundacionjala.coding.pablo.Movies;

/**
 * Created by Administrator on 3/23/2017.
 */
public class Rental {
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
