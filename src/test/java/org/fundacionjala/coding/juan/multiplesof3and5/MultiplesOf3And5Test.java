package org.fundacionjala.coding.juan.multiplesof3and5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 6/28/2017.
 */
public class MultiplesOf3And5Test {


    /**
     * KAta.
     */
    @Test
    public void test() {

        assertEquals(23, MultiplesOf3And5.solution(10));
        assertEquals(78, MultiplesOf3And5.solution(20));
        assertEquals(9168, MultiplesOf3And5.solution(200));
    }

    /**
     * Test constructor.
     *
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = MultiplesOf3And5.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}

