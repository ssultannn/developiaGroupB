package SRP;
//Принцип единственной ответственности
public class Test {
	public static void main(String[] args) {
		Adder adder = new Adder();

		System.out.println(adder.add(3, 4));
		Printer printer=new Printer();
		printer.print(5);
	}
}
