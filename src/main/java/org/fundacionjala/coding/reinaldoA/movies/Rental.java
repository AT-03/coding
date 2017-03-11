package org.fundacionjala.coding.reinaldoA.movies;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
    public  double eachMethod() {

        return  getMovie().thisAmount(_daysRented);
    }

    public int getFrequentRenterPoint() {
        return ((getMovie().getPriceCode() == Movie.NEW_RELEASE)
                &&
                getDaysRented() > 1)? 2:1;
    }
}