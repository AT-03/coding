package org.fundacionjala.coding.juan.gas;

/**
 * Created by Administrator on 6/28/2017.
 */
public final class Evaporator {

    /**
     * Constructor.
     */
    private Evaporator() {
    }
    private static final int PERCENT = 100;
    /**
     * Calculate the life of gas.
     *
     * @param content   how much gas have.
     * @param evap      how much waste.
     * @param threshold the  limit.
     * @return how many days.
     */
    public static int evaporator(final double content, final int evap, final int threshold) {
        int days = 0;
        double cont = content;
        double limit1 = content * threshold / PERCENT;
        while (cont >= limit1) {
            cont = cont - cont * evap / PERCENT;
            days++;
        }
        return days;


    }
}
