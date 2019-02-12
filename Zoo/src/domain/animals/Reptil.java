package domain.animals;

import domain.nutrition.AbsDiet;

public class Reptil extends AbsAnimal {

	public Reptil(String name, AbsDiet diet) {
		super(name, diet);
	}

	@Override
	public String feed() {
		return this.diet.feed();
	}

}
