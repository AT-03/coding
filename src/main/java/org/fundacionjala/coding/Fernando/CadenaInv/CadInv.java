package org.fundacionjala.coding.Fernando.CadenaInv;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates.
 * and open the template in the editor.
 */

/**
 * @author Administrator
 */
public class CadInv {
    static final int VAR = 5;

    /**
     * @param string ingresamos un string.
     * @return String devuelve una string.
     */
    public String cadenaInv(final String string) {
        String[] parts = string.split(" ");
        return cadenaInv(parts, 0, 0, 0);
    }

    /**
     * @param parts parametro
     * @param pos   parametro
     * @param posstring parametro
     * @param cant parametro
     * @return String Aumentamos parametros al metodo.
     */
    private String cadenaInv(final String[] parts, final int pos, final int posstring, final int cant) {
        String res = null;
        if (pos < parts.length) {
            String aux = parts[pos];
            if (posstring < aux.length()) {
                return cadenaInv(parts, 0, 1, cant + 1);
            }
            if (cant > VAR) {
                String aux2 = invertir(aux);
                res = res + aux2;
            } else {
                return cadenaInv(parts, pos + 1, 0, 0);

            }
            return cadenaInv(parts, 0, posstring + 1, 0);

        }
        return res;
    }

    /**
     * @param aux parametro
     * @return String Inv the String.
     */
    public String invertir(final String aux) {
        String res = null;
        for (int x = aux.length() - 1; x >= 0; x--) {
            res = res + aux.charAt(x);
        }
        return res;
    }

}
