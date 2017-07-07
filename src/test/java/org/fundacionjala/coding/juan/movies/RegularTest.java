package org.fundacionjala.coding.juan.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 3/23/2017.
 */
public class RegularTest {
    private Movie regular;

    /**
     * Initialize variables.
     */
    @Before
    public void setUp() {
        regular = new Regular("Logan");
    }

    /**
     * Test New Release amount when days rented is less than the limit.
     */
    @Test
    public void testRegularMovieWhenDaysRentedAreLessThanTheLimit() {

        // given:
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
        final int daysRentet = 5;
        // when:
        final double actualResult = regular.calculateAmount(daysRentet);

        // then:
        final double expectedResult = 6;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test title.
     */
    @Test
    public void testRegularMovieTitle() {

        // given:
        final int daysRentet = 5;
        // when:
        final String actualResult = regular.getTitle();

        // then:
        final String expectedResult = "Logan";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test points.
     */
    @Test
    public void testCalculeFrequentRentedPoints() {

        // given:
        final int daysRentet = 2;
        // when:
        final double actualResult = regular.calculateAmount(daysRentet);

        // then:
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }
}







