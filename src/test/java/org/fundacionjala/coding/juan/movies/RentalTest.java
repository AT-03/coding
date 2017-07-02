package org.fundacionjala.coding.juan.movies;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 7/2/2017.
 */
public class RentalTest {
    /**
     * Test get title.
     */
    @Test
    public void testGetTitle() {
        // given:
        final Regular regular = new Regular("Logan");
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
        final Regular regular = new Regular("Logan");
        final int daysRentet = 2;
        final Rental rental = new Rental(regular, daysRentet);

        // when:
        final int actualResult = rental.getDaysRented();

        // then:
        final int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }
}
