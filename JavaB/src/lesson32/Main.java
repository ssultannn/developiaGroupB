package lesson32;

public class Main {
	public static void main(String[] args) {
		// ArithmeticException
		int a = 10;
//		int b = 0;
//		System.out.println(a / b);
//		System.out.println("hello");
//
//		// NullPointerException
//		String s=null;
//		System.out.println(s.length());
//
//	//	 ArrayIndexOutOfBoundsException
//		int[] numbers= {1,2,3,4};
//		System.out.println(numbers[10]);
//
//		// StringIndexOutOfBoundsException
//		String s2="Emil";
//		System.out.println(s2.charAt(4));
//
//		// NumberFormatException
//		String s3 = "Umud";
//
//		int number = Integer.parseInt(s3);
//		System.out.println(number);

// ArithmeticException
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.err.println("ошибка на ноль делить нельзя");
		}

		// NullPointerException

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.err.println("ошибка обращение к null Обьекту");
		}

//		//	 ArrayIndexOutOfBoundsException

		try {
			int[] numbers = { 1, 2, 3, 4 };
			System.out.println(numbers[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ошибка выход за пределы массива");
		}

//		// NumberFormatException

		try {
			String s3 = "Umud";

			int number = Integer.parseInt(s3);
			System.out.println(number);
		} catch (NumberFormatException e) {
			System.err.println("ошибка: преоброзование строки в число");
		}

		System.out.println("1");

	}
}
