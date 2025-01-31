package lesson18;

public class ExamplePrivate {
	private int secretNumber;

	private void showSecretNumber() {
		System.out.println(secretNumber);
	}

	public static void main(String[] args) {
		ExamplePrivate examplePrivate = new ExamplePrivate();
		examplePrivate.secretNumber = 15;
		examplePrivate.showSecretNumber();
	}
}
