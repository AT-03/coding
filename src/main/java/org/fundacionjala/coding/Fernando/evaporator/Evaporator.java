package org.fundacionjala.coding.Fernando.evaporator;

/**
 * Created by PC on 28/06/2017.
 */
public abstract class Evaporator {


    private static final double PORCENTAGE = 100;

    /**
     * @param content the cant of gas.
     * @param evapPerDay PORCENTAGE_NUMBER of gas lost every day.
     * @param limit of the gas.
     * @return int report days the evaporator will be out of use.
     */
    public static int evaporator(final double content, final double evapPerDay, final double limit) {
        int res = 0;
        double reduceConten = content;
        double limitContent = content * limit / PORCENTAGE;
        while (reduceConten >= limitContent) {
            reduceConten = reduceConten - (reduceConten * evapPerDay / PORCENTAGE);
            res++;
        }
        return res;

    }
}
