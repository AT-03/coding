package org.fundacionjala.coding.Fernando.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 03/07/2017.
 */
public class RentalTest {

    private static final int DAYS_RENTED = 2;

    private Movie movie;
    private Rental rental;

    /**
     * Creating Regular and Rental instance.
     */
    @Before
    public void createRegularAndRental() {
        movie = new Regular("Star Wars");
        rental = new Rental(movie, DAYS_RENTED);
    }

    /**
     * Test get title.
     */
    @Test
    public void testGetTitle() {

        // when:
        final String actualResult = rental.getMovie().getTitle();

        // then:
        final String expectedResult = "Star Wars";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test days rented.
     */

    @Test
    public void testDaysRented() {

        // when:
        final int actualResult = rental.getDaysRented();

        // then:
        final int expectedResult = DAYS_RENTED;
        assertEquals(expectedResult, actualResult);
    }
}
