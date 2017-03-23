package org.fundacionjala.coding.reinaldoA.spinWords.ean;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/14/2017.
 */
public class EanTest {

    /**
     * Test when checksum isn't 0.
     *
     */
    @Test
    public void testEanWenTheChecksumIsNotZero() {
        // given:
        final String sentence = "4003301018398";

        // when:
        final boolean actualResult = Ean.checksumValidate(sentence);

        // then:
        final boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test when checksum is equal to 0.
     */
    @Test
    public void testEanWhenTheCheckSumIsEqualToZero() {
        // given:
        final String eanStringNumber = "4003301018392";

        // when:
        final boolean actualResult = Ean.checksumValidate(eanStringNumber);

        // then:
        final boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }
}
