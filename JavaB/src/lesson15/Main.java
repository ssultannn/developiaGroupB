package lesson15;

public class Main {

//	static  {
//		System.out.println("выполнен  static блок");
//	}
	
	 {
		System.out.println("выполнен no static блок");
	}

	public static void main(String[] args) {
		
	Main obj = new Main();
//		obj.printNumber();
//		printNumber();
		
	}

	
	
	public static void printNumber() {
		int a = 5;
		System.out.println(a);
	}
}
