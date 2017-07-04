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
     * @param text param.
     * @return String param.
     */
    public String cadenaInv(final String text) {
        int pos = 0;
        String[] parts = text.split(" ");
        while (pos < parts.length) {
            String palabra = parts[pos];
            if (palabra.length() > CANTMAYOR) {
                StringBuilder sb = new StringBuilder(parts[pos]);
                parts[pos] = sb.reverse().toString();
            }
            pos++;
        }
        return String.join(" ", parts);

    }

}
