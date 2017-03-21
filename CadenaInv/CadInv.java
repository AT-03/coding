/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CadInv {
    
//String string = "Estamos provando la inversion de una cadena";
//String[] parts = string.split(" ");
    
    public String cadenaInv(String string ){
       String[] parts = string.split(" "); 
       return cadenaInv(parts, 0,0,0);
    }
    private String cadenaInv(String [] parts, int pos, int posstring, int cant){
      String res = null;
      if(pos < parts.length){
          String aux= parts[pos];
          if(posstring < aux.length()){
            return cadenaInv(parts,0,1,cant+1);
          }
            if(cant>5){
                  String aux2=invertir(aux);
                  res= res + aux2;
            }
            else {
            return cadenaInv(parts,pos+1,0,0);
            
            }
           return cadenaInv(parts,0,posstring+1,0);
      }
      return res;
    }
    public String invertir(String aux){
      String res = null;
            for (int x=aux.length()-1; x >= 0 ;x--)
    		res = res + aux.charAt(x);
      return res;
    }
    
}
