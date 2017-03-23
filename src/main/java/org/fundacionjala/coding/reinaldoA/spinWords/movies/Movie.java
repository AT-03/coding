package org.fundacionjala.coding.reinaldoA.spinWords.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public abstract class Movie {
    private String title;

    /**
     * This is the constructor of Movie class.
     * @param title String with title for Movie movie.
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * This is an abstract method.
     * @param daysRented int with daysRented.
     * @return calculateAmount movie
     */
    public abstract double calculateAmount(final int daysRented);

    /**
     * This is an abstract method.
     * @param daysRented int with daysRented.
     * @return calculateFrequentRenterPoints movie
     */
    public abstract int calculateFrequentRenterPoints(final int daysRented);

    /**
     * This is an abstract method.
     * @return getTitle movie.
     *
     */
    public String getTitle() {
        return title;
    }
}
