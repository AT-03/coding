

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CheckSumTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CheckSumTest
{
    @Test
    public void testWhenSentenceHasNoString() {
        CheckSum ejercicio = new CheckSum();
        // given:
        final String sentence = " ";
        
        // when:
        final int actualResult= ejercicio.canValores(sentence);
        
        // then
        final int expectedResult= 0;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testWhenSentenceHasNoWordsMajorToFive() {
       CheckSum ejercicio = new CheckSum();
        // given:
        final String sentence = "12345";
        
        // when:
        final int actualResult= ejercicio.canValores(sentence);
        
        // then
        final int expectedResult= 8;
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testWhenSentenceHasMoreThanOneWordMajorThatFive() {
        CheckSum ejercicio = new CheckSum();
        // given:
        final String sentence = "123456789";
        
        // when:
        final int actualResult= ejercicio.canValores(sentence);
        
        // then
        final int expectedResult= 8;
        assertEquals(expectedResult, actualResult);
    }
}
