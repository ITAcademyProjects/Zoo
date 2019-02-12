package domain;

import java.util.ArrayList;
import java.util.List;

import domain.animals.AbsAnimal;

public class Zoo {

	protected List<AbsAnimal> animals = new ArrayList<>();

	public void addAnimal(AbsAnimal animal) {
		this.animals.add(animal);
	}

	public List<AbsAnimal> getAnimals() {
		return animals;
	}

}
