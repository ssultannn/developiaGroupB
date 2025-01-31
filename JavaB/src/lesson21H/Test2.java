package lesson21H;

import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		String[] names = { "Umud" };
		Random random = new Random();
		int randomNumber = random.nextInt(names.length);
		System.out.println(names[randomNumber]);

	}
}
