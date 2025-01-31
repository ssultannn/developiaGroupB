package Lesson23;

public class Bike extends Vehicle {
	int gears;
	
	@Override
	void start() {
		System.out.println(name + " запускает двигатель");
	}
}
