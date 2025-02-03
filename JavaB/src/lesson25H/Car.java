package lesson25H;

import java.util.jar.Attributes.Name;

public class Car {
	private String brand;
	private String model;
	private int year;

	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public Car(String model) {
		this.model = model;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void displayInfo() {
		System.out.println(brand + " " + model + " " + year);
	}
}
