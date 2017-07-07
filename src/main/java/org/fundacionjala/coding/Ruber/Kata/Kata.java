package org.fundacionjala.coding.Ruber.Kata;

/**
 * Created by Ruber Cuellar on 6/19/2017.
 */
public final class Kata {

    /**
     * Constructor.
     */
    private Kata() {
    }

    /**
     * To get high and low numbers from String.
     * @param number The String number
     * @return String
     */
    public static String highAndLow(final String number) {
        String[] numbers = number.split(" ");
        int mayor = Integer.parseInt(numbers[0]);
        int menor = Integer.parseInt(numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            int numInt = Integer.parseInt(numbers[i]);
            if (numInt > mayor) {
                mayor = numInt;
            }
            if (numInt < menor) {
                menor = numInt;
            }
        }
        return String.format("%s %s", mayor, menor);
    }
}
