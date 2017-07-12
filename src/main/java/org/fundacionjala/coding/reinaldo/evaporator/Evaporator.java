package org.fundacionjala.coding.reinaldo.evaporator;

/**
 * Created by Administrator on 6/30/2017.
 *
 */
final class Evaporator {

    /**
     * This is the constructor of  Evaporator.
     */
    private Evaporator() {

    }

    /**
     * this method calc the Evaporator at day.
     *
     * @param cant  is the cant
     * @param lost  is the lost
     * @param limit is the limit
     * @return int at day
     */
    static int evaporator(final double cant, final double lost, final double limit) {
        int result = 0;
        do {
            ++result;
        } while (Math.pow(1 - (lost / 100), result) > limit / 100);

        return result;
    }
}