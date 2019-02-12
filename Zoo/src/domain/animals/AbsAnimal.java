package domain.animals;

import domain.nutrition.AbsDiet;

public abstract class AbsAnimal {

	protected AbsDiet diet;
	protected String name;

	public AbsAnimal(String name, AbsDiet diet) {
		this.name = name;
		this.diet = diet;
	}

	public abstract String feed();

	public String getName() {
		return name;
	}
}
