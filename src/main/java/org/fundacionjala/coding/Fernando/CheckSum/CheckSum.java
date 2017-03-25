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
     * @param valor parametro.
     * @return boolean retorna un booleano.
     * @CheckReturnValue valor.
     */

    public boolean canValores(final String valor) {

        return canValores(valor, 1);
    }

    /**
     * @param valor parametro.
     * @param pos   parametro.
     * @return boolean retorna un booleano.
     * @CheckReturnValue valor.
     */
    @CheckReturnValue
    private boolean canValores(final String valor, final int pos) {
        int res = 0;
        int sum = 0;
        int res1 = 0;
        if (pos < valor.length()) {
            int aux1 = (int) valor.charAt(pos - 1);

            if (pos % 2 == 0) {
                res = res + aux1 * TRES;

            } else {
                res1 = res + aux1 * 1;
            }

            canValores(valor, pos + 1);

        }
        sum = res + res1;
        boolean numValido = numeroValido(sum);
        return numValido;
    }

    /**
     * @param sum parametro.
     * @return boolean retorna un booleano.
     */
    public boolean numeroValido(final int sum) {
        return (DIEZ - (sum % DIEZ) == OCHO) ? true : false;
    }

}
