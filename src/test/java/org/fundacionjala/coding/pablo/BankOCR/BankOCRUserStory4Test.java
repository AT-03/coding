package org.fundacionjala.coding.pablo.BankOCR;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 7/3/2017.
 */
public class BankOCRUserStory4Test {

    /**
     * Test constructor.
     * @throws Exception exception.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = BankOCRUserStory4.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test verify if an image contains nine digits and is parsed correctly.
     */
    @Test
    public void verifyIfAnImageContainsNineDigitsAndIsParsedCorrectly() {
        // given:
        String figureScanned =
                          "       _  _  _  _  _  _  _ "
                        + "  ||_||_||_||_| _||_||_ |_|"
                        + "  |  | _||_||_||_ |_||_| _|";

        String[] accountArray = BankOCRUserStory4.parseScannedFigures(figureScanned);

        // when:
        String actualResult = BankOCRUserStory2.accountRepresentation(accountArray);

        // then:
        String expectedResult = "149882869";
        assertEquals(expectedResult, actualResult);
    }
}
