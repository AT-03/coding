package org.fundacionjala.coding.pablo.Movies;

/**
 * Created by Administrator on 3/23/2017.
 */
public abstract class Movie {

    private String title;

    /**
     * Constructor.
     * @param title string.
     */

    public Movie(final String title) {
        this.title = title;
    }

    /**
     * Abstract method.
     * @param daysRented int.
     * @return Children, new Release, Regular.
     */

    public abstract double calculateAmount(int daysRented);

    /**
     * Abstract method.
     * @param daysRented int.
     * @return 3 methods found.
     */

    public abstract int calculateFrequentRenterPoints(int daysRented);

    /**
     * Get the title.
     * @return title.
     */

    public String getTitle() {
        return title;
    }
}
