package org.fundacionjala.coding.pablo.Evaporator;

/**
 * Created by Administrator on 6/28/2017.
 */
public final class EvaporatorKata {

    private static final int PERCENT_TOTAL = 100;

    /**
     * Constructor evaporator kata.
     */
    private EvaporatorKata() {
    }

    /**
     * This method tests the life of an evaporator containing a gas.
     *
     * @param content    content containing.
     * @param evapPerDay evaporation day.
     * @param threshold  limit.
     * @return life of an evaporator containing gas.
     */

    public static int evaporator(final double content, final double evapPerDay, final double threshold) {
        int days = 0;
        double contentAux = content;
        while (contentAux >= content * (threshold / PERCENT_TOTAL)) {
            contentAux -= contentAux * evapPerDay / PERCENT_TOTAL;
            days += 1;
        }
        return days;
    }
}
