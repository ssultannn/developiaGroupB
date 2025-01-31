package lesson26;

public class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	void introduce() {
		System.out.println("my name is "  + name);
	}
}
