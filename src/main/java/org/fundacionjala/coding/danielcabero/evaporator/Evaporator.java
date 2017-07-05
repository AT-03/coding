package org.fundacionjala.coding.danielcabero.evaporator;

/**
 * Created by administrator on 06/26/2017.
 */
final class Evaporator {

    private static final int PORCENT = 100;

    /**
     * Constructor.
     */
    private Evaporator() {
    }

    /**
     * @param content    of the gas in the tank.
     * @param percentDay of loss in the day.
     * @param threshold  of gas loss that not use.
     * @return days that save the gas.
     */
    static int evaporator(final double content, final double percentDay, final double threshold) {

        int days = 0;
        double contentPercentage = PORCENT;

        while (contentPercentage > threshold) {
            contentPercentage *= 1 - percentDay / PORCENT;
            days++;
        }

        return days;
    }
}
