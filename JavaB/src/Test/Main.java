package Test;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("bmw", "f10", 2000);
		Car car2 = new Car("audi", "rs7", 2010);
		Car car3 = new Car("lexus", "ls", 2007);


		Car[] cars = { car1, car2, car3 };
		
		for (Car car : cars) {
			System.out.println(car.toString());
		}
	}
}
