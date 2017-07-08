package org.fundacionjala.coding.Fernando.evaporator;

/**
 * Created by Administrator on 6/28/2017.
 */
public final class Evaporator {

    private static final int PERCENTAGE_TOTAL = 100;

    /**
     * Constructor evaporator kata.
     */
    private Evaporator() {
    }

    /**
     * @param content    content containing.
     * @param evapPerDay evaporation day.
     * @param limit  limit.
     * @return life of an evaporator containing gas.
     */

    public static int evaporator(final double content, final double evapPerDay, final double limit) {
        int res = 0;
        double reduceConten = content;
        double limitContent = content * limit / PERCENTAGE_TOTAL;
        while (reduceConten >= limitContent) {
            reduceConten = reduceConten - (reduceConten * evapPerDay / PERCENTAGE_TOTAL);
            res++;
        }
        return res;
    }
}

