package Example;

public class Calculator {
	public  void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		//без static
       Calculator calculator=new Calculator();
        calculator.add(3, 5);
        //c static
     //   add(4, 5);
	}
}
