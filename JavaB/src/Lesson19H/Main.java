package Lesson19H;

public class Main {
	public static void main(String[] args) {
		BankAccount person1 = new BankAccount();

		System.out.println(person1.getBalance());
		person1.deposit(50);
		System.out.println(person1.getBalance());
		person1.withdraw(20);
		System.out.println(person1.getBalance());
	}
}
