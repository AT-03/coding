package org.fundacionjala.coding.pablo.BankOCR;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 7/3/2017.
 */
public class BankOCRUserStory3Test {

    /**
     * Test constructor.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = BankOCRUserStory3.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test verify if the status account is illegible.
     */
    @Test
    public void verifyIfTheStatusAccountIsIllegible() {
        // given:
        String account = "  560  |";

        // when:
        String expectedResult = "ILL";

        // then:
        String actualResult = BankOCRUserStory3.getStatusAccount(account);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test verify if the status account is incorrect.
     */
    @Test
    public void verifyIfTheStatusAccountIsIncorrect() {
        // given:
        String account = "021453789";

        // when:
        String expectedResult = "ERR";

        // then:
        String actualResult = BankOCRUserStory3.getStatusAccount(account);
        assertEquals(expectedResult, actualResult);
    }
}
