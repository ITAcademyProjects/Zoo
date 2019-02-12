package application;

import java.util.List;

import domain.Zoo;
import domain.animals.AbsAnimal;
import domain.animals.Fish;
import domain.animals.Mammal;
import domain.nutrition.Carnivorous;
import domain.nutrition.Herbivore;
import domain.nutrition.Omnivore;

public class Controller {

	private static Zoo zoo = new Zoo();

	public String feedAllAnimals() {
		List<AbsAnimal> animals = zoo.getAnimals();
		String text = "";
		for (AbsAnimal animal : animals) {
			text += animal.getName() + " " + animal.feed() + "\n";
		}
		return text;
	}

	public void createFishes() {
		AbsAnimal fish = new Fish("Salmón", new Carnivorous());
		zoo.addAnimal(fish);

		fish = new Fish("Pez payaso", new Herbivore());
		zoo.addAnimal(fish);
	}

	public void createMamals() {
		AbsAnimal mamal = new Mammal("Delfin", new Carnivorous());
		zoo.addAnimal(mamal);

		mamal = new Mammal("Humano", new Omnivore());
		zoo.addAnimal(mamal);
	}

}
