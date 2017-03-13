package org.fundacionjala.coding.Yuri.BankOCR;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YVayneR on 3/10/2017.
 */
public class Entry {
    private final int SIZE = 9;
    public String[] numbers;
    Map<String, String> map = new HashMap<>();
    public Entry() {
        map.put(" _ | ||_|","0");
        map.put("     |  |","1");
        map.put(" _  _||_ ","2");
        map.put(" _  _| _|","3");
        map.put("   |_|  |","4");
        map.put(" _ |_  _|","5");
        map.put(" _ |_ |_|","6");
        map.put(" _   |  |","7");
        map.put(" _ |_||_|","8");
        map.put(" _ |_| _|","9");
    }

    public String[] getNumbers(String line1,String line2, String line3) {
        initializeArray();
        if(validLengthLines(line1,line2,line3)){
            numbers = getValues(numbers,line1.split(""));
            numbers = getValues(numbers,line2.split(""));
            numbers = getValues(numbers,line3.split(""));
        }
        return numbers;
    }
    public boolean validLengthLines(String line1,String line2, String line3){
        return line1.length() == 27 && line2.length() == 27 && line3.length() == 27;
    }

    public String[] getValues(String[] values,String[] row) {
        int aux = 3 ;
        int acum = 0;
        for(int i = 0 ;i < values.length;i++) {
            while(acum < aux){
                values[i] += row[acum];
                acum++;
            }
            aux +=3;
        }
        return values;
    }

    public String[] getCharacters(String line) {
        String[] characters = line.split("");
        return characters;
    }

    public void initializeArray(){
        numbers = new String[SIZE];
        for(int i= 0; i <numbers.length; i++){
            numbers[i] = new String();
        }
    }

    public void showValues(){
        for(int i=0 ;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
    public void decodeValues(){
        String number = "";
        for(int i=0;i<numbers.length;i++){
            String key = numbers[i];
            number += map.get(key);
        }
        System.out.println("Number is : " + number);
    }

}
