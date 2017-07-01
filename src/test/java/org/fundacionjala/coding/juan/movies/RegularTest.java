package org.fundacionjala.coding.juan.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 3/23/2017.
 */
public class RegularTest {
    /**
     * Test New Release amount when days rented is less than the limit.
     */
    @Test
    public void testRegularMovieWhenDaysRentedAreLessThanTheLimit() {

        // given:
        final Movie regular = new Regular("Logan");
        final int daysRentet = 1;
        // when:
        final double actualResult = regular.calculateAmount(daysRentet);

        // then:
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test New Release amount when days rented is less than the limit.
     */
    @Test
    public void testRegularMovieWhenDaysRentedAreigualThanTheLimit() {

        // given:
        final Regular regular = new Regular("Logan");
        final int daysRentet = 2;
        // when:
        final double actualResult = regular.calculateAmount(daysRentet);

        // then:
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test New Release amount when days rented is less than the limit.
     */
    @Test
    public void testRegularMovieWhenDaysRentedAreMoreThanTheLimit() {

        // given:
        final Regular regular = new Regular("Logan");
        final int daysRentet = 5;
        // when:
        final double actualResult = regular.calculateAmount(daysRentet);

        // then:
        final double expectedResult = 6;
        assertEquals(expectedResult, actualResult, 0);
    }
}
