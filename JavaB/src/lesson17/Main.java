package lesson17;

import java.util.Arrays;
import java.util.Iterator;

import Example.Shape;

public class Main {
	public static void main(String[] args) {

//		String str = "Meleyke";
//		String str2 = "meleyke";
//		System.out.println(str.equalsIgnoreCase(str2));
//
		int[] numbers = new int[5];
		Arrays.fill(numbers, 12);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i : numbers) {
			System.out.println(i);
		}
//		Создайте массив из 3 чисел и измените значение второго элемента.
//		int[] numbers2 = { 5, 4, 3};
//		numbers2[1] = 10;
//		for (int i : numbers2) {
//			System.out.println(i);
//		}
//		System.out.println("после сортировки");
//		Arrays.sort(numbers2);
//		for (int i : numbers2) {
//			System.out.println(i);
//		}

	}
}
