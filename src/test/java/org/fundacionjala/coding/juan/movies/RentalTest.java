package org.fundacionjala.coding.juan.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 7/2/2017.
 */
public class RentalTest {
    private Regular regular;

    /**
     * Initialize variables.
     */
    @Before
    public void initialize() {
        regular = new Regular("Logan");
    }

    /**
     * Test get title.
     */
    @Test
    public void testGetTitle() {
        // given:
        final int daysRentet = 2;
        final Rental rental = new Rental(regular, daysRentet);

        // when:
        final String actualResult = rental.getMovie().getTitle();

        // then:
        final String expectedResult = "Logan";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test days rented.
     */

    @Test
    public void testDaysRented() {
        // given:
        final int daysRentet = 2;
        final Rental rental = new Rental(regular, daysRentet);

        // when:
        final int actualResult = rental.getDaysRented();

        // then:
        final int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }
}
