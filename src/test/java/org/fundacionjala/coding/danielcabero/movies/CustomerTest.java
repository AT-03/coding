package org.fundacionjala.coding.danielcabero.movies;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 7/5/2017.
 */
public class CustomerTest {

    /**
     * test 1.
     */
    @Test
    public void testRentalEmpty() {
        // given:
        Customer customer = new Customer("Test");

        // when:
        final List<Rental> actualResult = customer.getRentalsList();

        // then:
        final List<Rental> expectedResult = new ArrayList<Rental>();
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test 2.
     */
    @Test
    public void testRental() {
        // given:
        Customer customer = new Customer("Test");

        // when:
        final String actualResult = customer.generateDetail();
        String expected = "Rental Record for Test\n"
                + "Amount owed is 0.0\n"
                + "You earned 0 frequent renter points";
        // then:
        assertEquals(expected, actualResult);
    }
}
