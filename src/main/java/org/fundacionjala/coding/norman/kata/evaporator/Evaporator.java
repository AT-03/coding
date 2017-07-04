package org.fundacionjala.coding.norman.kata.evaporator;

/**
 * Created by NORMAN on 2/7/2017.
 */
public final class Evaporator {

    private static final int INT = 100;

    /**
     * Contructor.
     */
    private Evaporator() {

    }

    /**
     * method calculate time in days when evaporate the liquid.
     *
     * @param cant       cant of liquid.
     * @param porcentaje porcentage evaporation.
     * @param umbral     limit the evaporation in porcentage.
     * @return cant days.
     */
    public static int evaporator(final double cant, final double porcentaje, final double umbral) {
        int res = 0;
        double aux = INT;
        while (aux > umbral) {
            aux -= porcentaje * aux / INT;
            res++;
        }
        return res;
    }
}
