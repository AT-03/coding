package org.fundacionjala.coding.Ruber.Evaporator;

/**
 * Created by Ruber Cuellar on 6/28/2017.
 */
public final class Evaporator {

    private static final int VALUE_PERCENTAGE = 100;

    /**
     * Constructor.
     */
    private Evaporator() {
    }

    /**
     * To get days for evaporing.
     * @param content The content
     * @param percentage The percentage to lose per day
     * @param limit The limit to not lose
     * @return int
     */
    public static int evaporator(final double content, final double percentage, final double limit) {

        int days = 0;
        double actualContent = content;
        while (actualContent >= (content * limit / VALUE_PERCENTAGE)) {
            actualContent -= (actualContent * percentage) / VALUE_PERCENTAGE;
            days++;
        }
        return days;
    }
}
