package domain.animals;

import domain.nutrition.AbsDiet;

public class Fish extends AbsAnimal {

	public Fish(String name, AbsDiet diet) {
		super(name, diet);
	}

	@Override
	public String feed() {
		return this.diet.feed();
	}

}
