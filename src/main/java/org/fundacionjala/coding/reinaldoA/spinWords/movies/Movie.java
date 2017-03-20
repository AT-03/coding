package org.fundacionjala.coding.reinaldoA.movies;

/**
 * This is the class Movie.
 */
class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;


    private static final int LIMITREGULAR = 2;
    private static final int LIMITNEWCHILD = 3;
    private static final double PRICE = 1.5;

    private String title;
    private int priceCode;

    /**
     * @param title     String with words.
     * @param priceCode String with words.
     *                  Constructor.
     */
    public Movie(final String title, final int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * @return the pricecode
     * Method .
     */
    public int getPriceCode() {
        return this.priceCode;
    }

    /**
     * @param arg the pricecode
     *            Method .
     */
    public void setPriceCode(final int arg) {
        this.priceCode = arg;
    }

    /**
     * @return the title
     * Method .
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @param daysRented this parameter
     * @return the daysRented
     * Method .
     */
    public double thisAmount(final int daysRented) {
        double resultado = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                resultado += LIMITREGULAR;
                if (daysRented > LIMITREGULAR) {
                    resultado += (daysRented - LIMITREGULAR) * PRICE;
                }
                break;
            case Movie.NEW_RELEASE:
                resultado += daysRented * LIMITNEWCHILD;
                break;
            case Movie.CHILDRENS:
                resultado += PRICE;
                if (daysRented > LIMITNEWCHILD) {
                    resultado += (daysRented - LIMITNEWCHILD) * PRICE;
                }
                break;
            default:
                throw new NullPointerException("Price incorrect");

        }
        return resultado;
    }
}
