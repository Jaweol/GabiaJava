package chapter09;

public class AnimalMain {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println();

		animalSound(new Cat());
		animalSound(new Dog());
	}

	public static void animalSound(Animal animal) {
		// Animal animal = new Cat();
		// Animal animal = new Dog();

		animal.sound();
		animal.sound();

	}
}
