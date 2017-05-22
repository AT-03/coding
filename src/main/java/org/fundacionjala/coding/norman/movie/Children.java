
/**
 * Created by Norman on 3/21/2017.
 */
public class Children extends Movie {
    private static final int LIMITNEWCHILD = 3;
    private static final double PRICE = 1.5;

    /**
     * contructor children.
     *
     * @param title the name
     */
    public Children(final String title) {
        super(title);
    }

    @Override
    public double calculateAmount(final int daysRented) {
        //  double amount = PRICE;
        // if (daysRented > LIMITNEWCHILD) {
        //    amount += (daysRented - LIMITNEWCHILD) * PRICE;
        //  }
        // return amount;
        //sum += i % 2 == 0 ? numericValue * DIGIT_MULTIPLIER : numericValue;
        return daysRented > LIMITNEWCHILD ? ((daysRented - LIMITNEWCHILD) * PRICE) + PRICE : PRICE;
    }

    /**
     * @param daysRented .
     *                   return double of calculateFrequentRenterPoints.
     */
    @Override
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
