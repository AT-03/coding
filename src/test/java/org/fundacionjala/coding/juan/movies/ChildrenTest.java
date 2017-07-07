package org.fundacionjala.coding.juan.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 3/23/2017.
 */
public class ChildrenTest {
    private Movie children;

    /**
     * Initialize variables.
     */
    @Before
    public void setUp() {
        children = new Children("Spy Kids");
    }

    /**
     * Test children amount when days rented is less than the limit.
     */
    @Test
    public void testChildrenMovieAmountWhenDaysRentetIsLessThanTheLimit() {

        // given:
        final int daysRentet = 2;
        // when:
        final double actualResult = children.calculateAmount(daysRentet);

        // then:
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test children amount when days rented are equals  than the limit.
     */
    @Test
    public void testChildrenMovieAmountWhenDaysRentetIsequalsThanTheLimit() {

        // given:
        final int daysRentet = 3;
        // when:
        final double actualResult = children.calculateAmount(daysRentet);

        // then:
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test children amount when days rented are equals  than the limit.
     */
    @Test
    public void testChildrenMovieAmountWhenDaysRentetaremoreThanTheLimit() {

        // given:
        final int daysRentet = 5;
        // when:
        final double actualResult = children.calculateAmount(daysRentet);

        // then:
        final double expectedResult = 4.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test calculate points.
     */
    @Test
    public void testChildrenMovieCalculatePoints() {

        // given:
        final int daysRentet = 5;
        // when:
        final double actualResult = children.calculateFrequentRenterPoints(daysRentet);

        // then:
        final double expectedResult = 1;
        assertEquals(expectedResult, actualResult, 0);
    }


}

