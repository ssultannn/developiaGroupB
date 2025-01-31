package lesson26;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	void introduce() {
		super.introduce();
		System.out.println("Я студент.");
	}
}
