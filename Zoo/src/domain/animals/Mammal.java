package domain.animals;

import domain.nutrition.AbsDiet;

public class Mammal extends AbsAnimal {

	public Mammal(String name, AbsDiet diet) {
		super(name, diet);
	}

	@Override
	public String feed() {
		return this.diet.feed();
	}

}
