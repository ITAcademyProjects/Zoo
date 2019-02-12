package domain.animals;

import domain.nutrition.AbsDiet;

public class Amphibian extends AbsAnimal {

	public Amphibian(String name, AbsDiet diet) {
		super(name, diet);
	}

	@Override
	public String feed() {
		return this.diet.feed();
	}

}
