package org.fundacionjala.coding.juan.gas;

/**
 * Created by Administrator on 6/28/2017.
 */
public class Evaporator {
    /**
     * Calculate the life of gas.
     *
     * @param content      how much gas have.
     * @param evap how much waste.
     * @param threshold    the limit.
     * @return how many days.
     */
    public int evaporator(final double content, final int evap, final int threshold) {
        int days = 0;
        double waste1;
        double limit1 = content * threshold / 100.00;
        double conte = content;
        while (conte >= limit1) {
            waste1 = conte * evap / 100.00;
            conte = conte - waste1;
            days++;
        }
        return days;


    }
}
