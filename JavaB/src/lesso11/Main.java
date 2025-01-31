package lesso11;

public class Main {
	public static void main(String[] args) {
//		// обьект 1
//		Car car1 = new Car();
//		car1.brand = "BMW";
//		car1.year = 2014;
//		car1.price = 55000;
//		// обьект 2
//		Car car2 = new Car();
//		car2.brand = "audi";
//		car2.year = 2016;
//		car2.price = 25000;
//
//		// обьект 3
//		Car car3 = new Car();
//		car3.brand = "mers";
//		car3.year = 2011;
//		car3.price = 8000;

		System.out.println("car 4");
		Car car4 = new Car("Hyundai", 2010, 30000);
		System.out.println(car4.brand);
		System.out.println(car4.year);
		System.out.println(car4.price);
		
		System.out.println("car 5");
		Car car5 = new Car("toyota", 2006, 25000);
		System.out.println(car5.brand);
		System.out.println(car5.year);
		System.out.println(car5.price);

	}
	
}
