package  src.main.coding.coding.src.coding.danielcabero.movies;


public class Movie {
	private double myPrice;	
	private String _title;
        private Price price;
	public Movie(String title, double priceCode) {
		_title = title;
		myPrice = priceCode;
	}

	public void setPriceCode(double _price) {
		myPrice = _price;
	}

	public String getTitle() {
		return _title;
	}

	/**
	 * determine charge for a rentaleach line
	 * @param rental TODO
	 * @return
	 */
	double getCharge(int daysRented) {
		return price.getPrice(daysRented);
	}

	/**
	 * Get frequent rental points
	 * @param frequentRenterPoints
	 * @param rental TODO
	 * @return
	 */
	public int getFrequentRentalPoints(Rental rental) {
		// add frequent renter points
		// add bonus for a two day new release rental
		if (isSpecialPointsPolicy(rental)) {
			return 2;
		}
		else return 1;
	};

	boolean isSpecialPointsPolicy(Rental rental) {
		
		return (myPrice instanceof NewRelease)
				&& rental.getDaysRented() > 1;
	}

	
}