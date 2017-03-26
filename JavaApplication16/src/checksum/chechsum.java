/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checksum;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OPTIMUS
 */
public class chechsum {
     // the list have got a 12 or 13 elements in the collection
         List<Integer> cheshsum;
    
    public chechsum()
    {
        cheshsum=new ArrayList<Integer>();
    }
    
    /**
     *
     * @param check
     * @return the result of the formule 10-(ean%10)
     */
    public int EAN(ArrayList<Integer> check){
        int res=0;  
        //verify a the calculate 
        if(calculate(check)!=0)
            res=10-calculate(check);
        return res; 
    }
    
    //method for the calculate the sum of the list the number 
    public int calculate(ArrayList<Integer> check)
    {
     int res=0;
        
    for(int x=0;x<check.size();x++)
    {
        if((x%2)==0)
            res+=check.get(x);
       else
            res+=check.get(x)*3;
    }
    
    return res;
        
    
  }
            
    
}
