package org.fundacionjala.coding.juan.multiplesof3and5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 6/28/2017.
 */
public class MultiplesOf3And5Test {
    private MultiplesOf3And5 kata = new MultiplesOf3And5();

    /**
     * KAta.
     */
    @Test
    public void test() {

        assertEquals(23, kata.solution(10));
        assertEquals(78, kata.solution(20));
        assertEquals(9168, kata.solution(200));
    }

}

