package lesson11;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Cahid", 12);
		System.out.println(student.name + " " + student.age);
		student.work();
		student.sleep();
	}

}
