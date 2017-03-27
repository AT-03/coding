package test.java.org.fundacionjala.coding;

import static com.sun.org.apache.regexp.internal.RETest.test;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import src.main.java.org.fundacionjala.coding.kata;


/**
 * Test for {@link Kata}.
 */
public class kataTest {

    @Test
    public void SpinWord1Test(){
    kata instance =null;
    String test="hola mundo";    
    String res=null;
    String esperado="odnum aloh";
    
    assertEquals(instance.spinWord("hola mundo"),esperado);
    }
    
    @Test
    
    public void SpinWordTest2(){
    kata instance =null;
    String test="mundo";    
    String res=null;
    String esperado=instance.spinWord("mundo");
    
    assertEquals(instance.spinWord(test),esperado);
    }

   
    
}
