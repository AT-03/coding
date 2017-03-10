package org.fundacionjala.coding.juan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 3/10/2017.
 */

public class spinWordsTest {
        @Test
    public void testspinWordsWhenTheSentenseHasFiveWords() {
            spinWords words= new spinWords();

            //Given
            final String sentece ="holas";
            //When
            final  String  actualResult= words.spinWord(sentece);
            // then
            final String exectedResult ="saloh";
            assertEquals(exectedResult,actualResult);



    }
    @Test
    public void testSpinWordsWhenTheSenteseHasMoreThanFiveWords(){
        spinWords words= new spinWords();
        //Given
        final String sentece ="Paralelepipedo";
        //When
        final  String  actualResult= words.spinWord(sentece);
        // then
        final String exectedResult ="odepipelelaraP";
        assertEquals(exectedResult,actualResult);
    }
    @Test
    public  void  testSpinWordsWhenTheSenteseHasSpaces(){
        spinWords words= new spinWords();
        //Given
        final String sentece ="Wellcome to the jungle";
        final String senteceA ="Esta es una prueba";
        //When
        final  String  actualResult= words.spinWord(sentece);
        final  String  actualResultA= words.spinWord(senteceA);
        // then
        final String exectedResult ="emoclleW to the elgnuj";
        final String exectedResultA ="Esta es una abeurp";
        assertEquals(exectedResult,actualResult);
        assertEquals(exectedResultA,actualResultA);
    }


    }

