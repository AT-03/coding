package org.fundacionjala.coding.reinaldoA.spinWords.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 * This is the class Customer of rental movie.
 */
public class Customer {
    private String nameCustomer;
    private Vector rentalsCustomer = new Vector();

    /**
     * @param nameCustomer String with words.
     *                     Constructor.
     */
    Customer(final String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    /**
     * @param arg String with words.
     */
    public void addRental(final Rental arg) {
        this.rentalsCustomer.addElement(arg);
    }

    /**
     * @return the nameCustomer string.
     */
    public String getName() {
        return this.nameCustomer;
    }

    /**
     * @return the string.
     */
    public String statement() {
        double totalAmount = 0;
        StringBuffer result = new StringBuffer();
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentalsCustomer.elements();
        result.append("Rental Record for " + getName() + "\n");
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints++;
            frequentRenterPoints += each.getFrequentRenterPoint();
            result.append("\t" + each.getMovie().getTitle() + "\t");
            result.append(String.valueOf(each.eachMethod()) + "\n");
            totalAmount += each.eachMethod();
        }
        result.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
        result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
        return result.toString();
    }
}
