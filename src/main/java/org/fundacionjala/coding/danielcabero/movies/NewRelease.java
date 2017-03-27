package  src.main.coding.coding.src.coding.danielcabero.movies;

/**
 * Created by Administrator on 3/10/2017.
 */
public final class NewRelease extends Price {
        // this method  grants to movies with category new_Release.
	@Override
	public double getPrice(int daysRented) {
		return daysRented * 3;
	}

}