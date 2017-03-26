package org.fundacionjala.coding.juan.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/23/2017.
 */
public class NewReleaseTest {
    /**
     * Test New Release amount when days rented is less than the limit.
     */
    @Test
    public void testNewRealeasenMovieAmount() {

        // given:
        final NewRelease newRelease = new NewRelease("Logan");
        final int daysRentet = 2;
        // when:
        final double actualResult = newRelease.calculateAmount(daysRentet);

        // then:
        final double expectedResult = 6;
        assertEquals(expectedResult, actualResult, 0);
    }

}
