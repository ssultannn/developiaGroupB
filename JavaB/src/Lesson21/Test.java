package Lesson21;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int max = 0;

		for (int i : numbers) {
			if (i > max) {
				max = i;
			}
		}
	}
}
