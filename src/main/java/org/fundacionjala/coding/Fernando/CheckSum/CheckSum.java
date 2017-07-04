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
    static final int ZERO = 0;
    static final int SIZEVALUE = 13;

    /**
     * @param valor data.
     * @return boolean of cant values.
     */
    public boolean canValores(final String valor) {
        int sum = ZERO;
        if (valor.length() != SIZEVALUE) {
            return false;
        }
            for (int i = UNO; i < valor.length(); i++) {
                int num = Character.getNumericValue(valor.charAt(i - 1));
                sum += i % 2 == 0 ? num * TRES : num;
            }
            return numeroValido(sum) == Character.getNumericValue(valor.charAt(valor.length() - 1));
    }
    /**
     * @param sum of values.
     * @return int of number valid.
     */
    public int numeroValido(final int sum) {
        int result = sum % DIEZ;
        return result != 0 ? DIEZ - result : 0;

    }

}
