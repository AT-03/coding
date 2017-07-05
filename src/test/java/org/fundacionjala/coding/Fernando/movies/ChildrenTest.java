package org.fundacionjala.coding.Fernando.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 24/06/2017.
 */
public class ChildrenTest {

    private Movie movie;

    /**
     * Creating Children instance.
     */
    @Before
    public void createCustomer() {
        movie = new Children("Toy Story");
    }

    /**
     * Test to verify the amount rent less than three days.
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {

        // when:
        final double actualResult = movie.calculateAmount(2);

        // then
        final double expectedResult = 1.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the amount rent more than three days.
     */
    @Test
    public void testToCalculateRentMovieMoreThanThreeDays() {

        // when:
        final double actualResult = movie.calculateAmount(10);

        // then:
        final double expectedResult = 10.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the frequent renter for different days.
     */
    @Test
    public void testToCalculateTheFrequentRentDifferentDays() {

        // when:
        final int actualResult = movie.calculateFrequentRenterPoints(1);

        // then:
        final int expectedResult = 1;
        assertEquals(expectedResult, actualResult);

        // given:

        // when:
        final int actualResultTwo = movie.calculateFrequentRenterPoints(3);

        // then:
        final int expectedResultTwo = 1;
        assertEquals(expectedResultTwo, actualResultTwo);

    }

}
