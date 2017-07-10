package org.fundacionjala.coding.danielcabero.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 7/5/2017.
 */
public class RentalTest {

    private Movie movie = new Movie("test") {
        @Override
        public double calculateAmount(final int daysRented) {
            return 2;
        }

        @Override
        public int frequentPointsRenter(final int daysRented) {
            return 2;
        }
    };

    /**
     * test gatDays.
     */
    @Test
    public void getDaysRent() {
        //given
        Rental rental = new Rental(movie, 2);

        //when
        final int days = 2;

        //then
        assertEquals(rental.getDaysRent(), days);
    }

    /**
     * test get movie.
     */
    @Test
    public void getMovieTitle() {
        //when
        Rental rental = new Rental(movie, 3);

        //Then
        assertEquals(movie, rental.getMovieTitle());
    }

    /**
     * test get movie.
     */
    @Test
    public void getMovieFrequentPoints() {
        //when
        Rental rental = new Rental(movie, 3);
        final int expected = 2;
        //Then
        assertEquals(expected, rental.calculateFrequentRenterPoint());
    }


}
