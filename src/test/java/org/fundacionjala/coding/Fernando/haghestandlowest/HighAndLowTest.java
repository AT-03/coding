package org.fundacionjala.coding.Fernando.haghestandlowest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by PC on 25/06/2017.
 */
public class HighAndLowTest {

    /**
     * Some Test.
     */
    @Test
    public void someTest() {
        assertThat(HighAndLow.highAndLowest("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }

    /**
     * PlusMinusTest.
     */
    @Test
    public void plusMinusTest() {
        assertThat(HighAndLow.highAndLowest("1 -1"), is("1 -1"));
    }

    /**
     * Plus plus test.
     */
    @Test
    public void plusPlusTest() {
        assertThat(HighAndLow.highAndLowest("1 1"), is("1 1"));
    }

    /**
     * Minus minus test.
     */
    @Test
    public void minusMinusTest() {
        assertThat(HighAndLow.highAndLowest("-1 -1"), is("-1 -1"));
    }

    /**
     * Plus minus zero test.
     */
    @Test
    public void plusMinusZeroTest() {
        assertThat(HighAndLow.highAndLowest("1 -1 0"), is("1 -1"));
    }

    /**
     * Plus zero test.
     */
    @Test
    public void plusPlusZeroTest() {
        assertThat(HighAndLow.highAndLowest("1 1 0"), is("1 0"));
    }

    /**
     * Minus zero test.
     */
    @Test
    public void minusMinusZeroTest() {
        assertThat(HighAndLow.highAndLowest("-1 -1 0"), is("0 -1"));
    }

    /**
     * Single test.
     */
    @Test
    public void singleTest() {
        assertThat(HighAndLow.highAndLowest("42"), is("42 42"));
    }

}
