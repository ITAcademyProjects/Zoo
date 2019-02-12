package view;

import application.Controller;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();

		controller.createFishes();
		controller.createMamals();
		System.out.println(controller.feedAllAnimals());
	}
}
