package org.fundacionjala.coding.danielmontecinos.evaporator;

/**
 * Class Evaporator.
 */
final class Evaporator {


    private static final double EVAPORATOR_CONTENT = 100.0;

    /**
     * Private constructor.
     */
    private Evaporator() {
    }

    /**
     * Method calculates the days that the evaporator will work.
     *
     * @param content           is the content of the evaporator.
     * @param evaporationPerDay is the amount of foam the evaporator loses everyday.
     * @param threshold         of the evaporator.
     * @return the days the evaporator will work.
     */
    static int evaporator(final double content, final int evaporationPerDay, final int threshold) {
        double evaporatorContent = EVAPORATOR_CONTENT;
        final double percentageLostPerDay = evaporationPerDay / EVAPORATOR_CONTENT;
        int days = 0;

        while (evaporatorContent > threshold) {
            evaporatorContent -= (evaporatorContent * percentageLostPerDay);
            days++;
        }

        return days;
    }
}
