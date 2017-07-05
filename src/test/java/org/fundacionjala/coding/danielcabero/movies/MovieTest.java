package org.fundacionjala.coding.danielcabero.movies;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 7/5/2017.
 */
public class MovieTest {

    private Movie movie = new Movie("Test") {
        @Override
        public double calculateAmount(final int daysRented) {
            return 2;
        }

        @Override
        public int frequentPointsRenter(final int daysRented) {
            return 5;
        }
    };

    /**
     * test movie.
     */
    @Test
    public void getTitleTest() {
        //When
        String expected = "Test";
        //Then
        assertEquals(expected, movie.getTitleMovie());

    }
}
