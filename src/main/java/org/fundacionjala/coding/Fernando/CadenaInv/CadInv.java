package org.fundacionjala.coding.Fernando.CadenaInv;

/**
 * Write a description of class CadInv here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class CadInv {
    static final int CANTMAYOR = 5;

    /**
     * Constructor.
     */
    public CadInv() {

    }

    /**
     * @param string param.
     * @return String param.
     */
    public String cadenaInv(final String string) {
        String[] parts = string.split(" ");
        return cadenaInv(parts, 0);
    }

    /**
     * @param parts param.
     * @param pos   param.
     * @return String param.
     */
    private String cadenaInv(final String[] parts, final int pos) {

        if (pos < parts.length) {
            String palabra = parts[pos];
            if (palabra.length() > CANTMAYOR) {
                StringBuilder sb = new StringBuilder(parts[pos]);
                parts[pos] = sb.reverse().toString();
            }
            return cadenaInv(parts, pos + 1);

        }
        return String.join(" ", parts);

    }

}
