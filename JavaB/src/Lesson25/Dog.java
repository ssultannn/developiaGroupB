package Lesson25;

public class Dog extends Animal {
	String breed;

	public Dog(String name) {
		super(name);
	}

	@Override
	void sound() {
		super.sound();
		System.out.println("собака лает");
	}

}
