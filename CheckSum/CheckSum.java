
/**
 * Write a description of class CheckSum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckSum
{
    public CheckSum(){
      
    }

    public int canValores(String valor){
     return canValores(valor,0);
    }
    private int canValores(String valor, int aux){
        int respuesta = 0;
        int res=0; 
        while(aux< valor.length())
        {   
           int aux1= (int)valor.charAt(aux);
           
            if(aux1%2==0){
            res= res+aux1*3;
            
            }else{
              res= res+aux1*1;
            }
            canValores(valor, aux+1);
           
        }
        
        if(10-(res%10)==8)
        {
            respuesta= 10-(res%10);
        }
        else{
            respuesta=0;
        }
        return respuesta;
    }
    
    
}
