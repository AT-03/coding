package org.fundacionjala.coding.Fernando.CheckSum;
/**
 * Write a description of class CheckSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckSum {
   static final int TRES = 3;
   static final int UNO = 1;
   static final int DIEZ = 10;
   static final int DOS = 2;
   static final int OCHO = 8;
    /**
     * constructor.
     */
    public CheckSum() {

    }
    /**
     * @param valor parametro
     *@return boolean retorna un booleano
     */
    public boolean canValores(final String valor) {
        return canValores(valor, 0);
    }
    /**
     * @param valor parametro
     * @param aux parametro
     *@return boolean retorna un booleano
     */

    private boolean canValores(final String valor, final int aux) {
        int res = 0;
        while (aux < valor.length()) {
            int aux1 = (int) valor.charAt(aux);

            if (aux1 % DOS == 0) {
                res = res + aux1 * TRES;

            }
                res = res + aux1 * UNO;

            canValores(valor, aux + 1);

        }

        if (DIEZ - (res % DIEZ) == OCHO) {
            return true;
        }
            return false;


    }


}
