/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class CadInvTest {
    
    @Test
    public void testWhenSentenceHasNoString() {
        CadInv ejercicio = new CadInv();
        // given:
        final String sentence = " ";
        
        // when:
        final String actualResult= ejercicio.cadenaInv(sentence);
        
        // then:
        final String expectedResult= null;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testWhenSentenceHasNoWorksMajorToFive() {
        CadInv ejercicio = new CadInv();
        //Hey fellow warriors
        // give:
        final String sentence= "Hi guys how are you";
        
        // when:
        final String actualResult=ejercicio.cadenaInv(sentence);
        
        // then:
        final String expectedResult= "hi guys how are you";
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testWhenSentenceHasMoreThanOneWordMajorThatFive() {
        CadInv ejercicio = new CadInv();
        // give:
        final String sentence= "Hey fellow warriors";
        
        // when:
        final String actualResult= ejercicio.cadenaInv(sentence);
        
        // then:
        final String expectedResult= "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResult);
    }
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
