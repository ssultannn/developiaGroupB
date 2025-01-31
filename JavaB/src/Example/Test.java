package Example;

public class Test {
	public static void main(String[] args) {
		Shape shape1 = new Shape("квадрат", 5);
		int squareShape1 = shape1.a * shape1.a;
		System.out.println(shape1.type + " " + squareShape1);

		Shape shape2 = new Shape("прямоугольник", 5, 10);

		int squareShape2 = shape2.a * shape2.b;
		System.out.println(shape2.type + " " + squareShape2);
		
		Shape shape3=new Shape("круг", 4);
		double squareShape3= (Math.PI * (shape2.a * shape3.a));
		System.out.println(shape3.type + " " + squareShape3);
	}
}
