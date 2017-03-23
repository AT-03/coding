package src.main.java.org.fundacionjala.coding;

public class kata
{
     public String cadena;
     private kata()
     {
     
        
        }
     public String spinWord(String cadena)
     {
         StringBuilder n;
         String res;
         
            if(contar(cadena))
             {
                 res=cadena;
                }
            else{
               res=(cadena);
            }
         return res;
            
     }
     public boolean contar(String cadena)
     {
        return cadena.length()<5;
     }
     public String darvuelta(String cadena)
     {
         String res="";
         for(int i=cadena.length();0<i;i--)
         {
             if(!vacio(cadena.charAt(i)))
                {res+=cadena.charAt(i);}
             else
             {   res+=' ';             }
         }
        return res;
        
        }
     public boolean vacio(char i)
     {
        return i==' ';
        }
       
}
