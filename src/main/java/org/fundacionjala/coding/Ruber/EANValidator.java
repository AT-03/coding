package org.fundacionjala.coding.Ruber;

/**
 * Created by Ruber Cuellar on 2/21/2017.
 */
public final class EANValidator {

    private static final int PAR = 1;
    private static final int IMPAR = 3;
    private static final int DIVISOR = 10;

    /**
     * Constructor.
     */
    private EANValidator() {
    }
    /**
     * Validate the number if is valid.
     * @param num the number to validate
     * @return boolean
     */
    public static boolean validate(final String num) {
        int suma = 0;
        int[] numbers = convertArray(num);

        for (int i = 0; i < numbers.length - 1; i++) {
            suma += i % 2 == 0 ? numbers[i] * PAR : numbers[i] * IMPAR;
        }

        if (suma % DIVISOR == 0) {
            suma = 0;
        } else {
            suma = DIVISOR - (suma % DIVISOR);
        }

        if (suma == numbers[numbers.length - 1]) {
            return true;
        }
        return false;
    }

    /**
     * This method convert a String into array of numbers.
     * @param num The string to convert
     * @return int[] with numbers
     */
    public static int[] convertArray(final String num) {

        int[] numbers = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return numbers;
    }
}
