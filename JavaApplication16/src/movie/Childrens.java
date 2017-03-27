/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  src.main.coding.coding.src.coding.danielcabero.movies;

public class Childrens extends Price {

	@Override
	public double getPrice(int daysRented) {
	
		if (daysRented >3){
                    return 1.5;}
		
		return 1.5 + ((daysRented - 3) * 1.5);
	}

}