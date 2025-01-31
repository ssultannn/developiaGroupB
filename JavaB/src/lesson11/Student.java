package lesson11;

public class Student {
	// поля
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void work() {
		System.out.println(name+  " is working");
	}
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
}
