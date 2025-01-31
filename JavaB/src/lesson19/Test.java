package lesson19;

import java.util.Iterator;

public class Test {
	

	public static void main(String[] args) {
//	int[] numbers1= {1,2,3};
//		int[][] matrix = { 
//				{ 4, 5, 7 },
//				{ 3, 8, 9 }, 
//				{ 2, 4, 6 } 
//				};

//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//
//			}
//			System.out.println();
//		}
String[][] daysOfWeek= {
		{"1","понедельник"},
		{"2","вторник"},
		{"2","среда"}
};



for (String[] strings : daysOfWeek) {
	System.out.println(strings[0] + " "+ strings[1]);
}
//
//		for (int i = 0; i < daysOfWeek.length; i++) {
//		for (int j = 0; j < daysOfWeek[i].length; j++) {
//			System.out.print(daysOfWeek[i][j]);
//			
//		}
//			System.out.println();
//		}


	}
}
