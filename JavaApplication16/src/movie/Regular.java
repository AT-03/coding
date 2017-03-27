/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  src.main.coding.coding.src.coding.danielcabero.movies;

public final class Regular extends Price {

	@Override
	public double getPrice(int daysRented) {
		// TODO Auto-generated method stub
		int resultado = 2;
		
		if (daysRented <= 2)
			return 2;
		else 
			return 2 + ((daysRented - 2) * 1.5);
		
	}

	
}