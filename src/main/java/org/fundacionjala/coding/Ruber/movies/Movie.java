package org.fundacionjala.coding.Ruber.movies;

/**
 * Class Movie.
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String title;
    private int priceCode;

    /**
     * Constructor.
     * @param title The movie's name
     * @param priceCode The movie's price code
     */
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * To get price code from movie.
     * @return int with the price
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * To set price code for movie.
     * @param arg The new code
     */
    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    /**
     * To get movie's title.
     * @return The movie's title
     */
    public String getTitle() {
        return title;
    }
}
