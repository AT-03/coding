package org.fundacionjala.coding.reinaldo.ean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import org.fundacionjala.coding.reinaldo.average.Average;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 6/30/2017.
 */
public class EanTest {

    /**
     * Test when checksum isn't 0.
     */
    @Test
    public void testEanWenTheChecksumIsNotZero() {
        // given:
        final String sentence = "4003301018398";

        // when:
        final boolean actualResult = Ean.validate(sentence);

        assertTrue(actualResult);
    }

    /**
     * Test when checksum is equal to 0.
     */
    @Test
    public void testEanWhenTheCheckSumIsEqualToZero() {
        // given:
        final String eanStringNumber = "4003301018392";

        // when:
        final boolean actualResult = Ean.validate(eanStringNumber);

        assertFalse(actualResult);
    }

    /**
     * Test constructor.
     *
     * @throws Exception construct
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = Average.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
