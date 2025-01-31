package lesson21H;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("введите строку");
		String inputString = scanner.nextLine();
		StringBuilder sBuilder = new StringBuilder(inputString);

		sBuilder.reverse();
		
		for (int i = 0; i < sBuilder.length(); i++) {
			if (sBuilder.charAt(i) == ' ') {
				sBuilder.setCharAt(i, '_');
			}
		}
		System.out.println(sBuilder);
			}
	
	
}
