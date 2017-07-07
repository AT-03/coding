package org.fundacionjala.coding.reinaldo.movies;

/**
 * Created by Administrator on 3/21/2017.
 */
public abstract class Movie {
    private String title;

    /**
     * This is the constructor of Movie class.
     *
     * @param title String with title for Movie movie.
     */
    Movie(final String title) {
        this.title = title;
    }

    /**
     * This is an abstract method.
     *
     * @param daysRented int with daysRented.
     * @return calculateAmount movie
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * This is an abstract method.
     *
     * @param daysRented int with daysRented.
     * @return calculateFrequentRenterPoints movie
     */
    public abstract int calculateFrequentRenterPoints(int daysRented);

    /**
     * This is an abstract method.
     *
     * @return getTitle movie.
     */
    String getTitle() {
        return title;
    }
}
