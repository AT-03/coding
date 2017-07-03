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

    /**
     * Calculate the life of gas.
     *
     * @param content   how much gas have.
     * @param evap      how much waste.
     * @param threshold the limit.
     * @return how many days.
     */
    public static int evaporator(double content, final int evap, final int threshold) {
        int days = 0;
        double limit1 = content * threshold / 100.00;
        while (content >= limit1) {
            content = content - content * evap / 100.00;
            days++;
        }
        return days;


    }
}
