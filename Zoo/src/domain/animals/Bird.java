package domain.animals;

import domain.nutrition.AbsDiet;

public class Bird extends AbsAnimal {

	public Bird(String name, AbsDiet diet) {
		super(name, diet);
	}

	@Override
	public String feed() {
		return this.diet.feed();
	}

}
