package org.fundacionjala.coding.norman.movie;

/**
 * Created by Administrator on 3/21/2017.
 */
public class Regular extends Movie {

    private static final double PRICE = 1.5;

    private static final int LIMITREGULAR = 2;
    /**
     * Constructor regular.
     * @param title string title.
     */
    public Regular(final String title) {
        super(title);
    }
    /**
     * @param daysRented int days.
     * @return double of calculateAmount.
     */
    @Override
    public double calculateAmount(final int daysRented) {
     //   double amount = LIMITREGULAR;
      //  if (daysRented > LIMITREGULAR) {
        //    amount += (daysRented - LIMITREGULAR) * PRICE;
       // }
       // return amount;
        return daysRented > LIMITREGULAR ? ((daysRented - LIMITREGULAR) * PRICE)+LIMITREGULAR : LIMITREGULAR ;
    }
    /**
     * @return calculateFrequentRenterPoint int.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
