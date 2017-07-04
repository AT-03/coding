package org.fundacionjala.coding.Fernando.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 03/07/2017.
 */
public class RentalTest {

    private static final int DAYS_RENTED = 2;
    /**
     * Test get title.
     */
    @Test
    public void testGetTitle() {
        // given:
        final Regular regular = new Regular("Star Wars");
        final Rental rental = new Rental(regular, DAYS_RENTED);

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
        // given:
        final Regular regular = new Regular("The Lord of the Ring");
        final int daysRentet = DAYS_RENTED;
        final Rental rental = new Rental(regular, daysRentet);

        // when:
        final int actualResult = rental.getDaysRented();

        // then:
        final int expectedResult = DAYS_RENTED;
        assertEquals(expectedResult, actualResult);
    }
}
