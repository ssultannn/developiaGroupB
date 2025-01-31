package Example;

public class Shape {
	String type;
	int a;
	int b;

	// квадрат и круг
	public Shape(String type, int a) {
		this.type = type;
		this.a = a;
	}
	
	//прямоугольника
	public Shape(String type,int a,int b) {
		this.type=type;
		this.a=a;
		this.b=b;
	}
	
}
