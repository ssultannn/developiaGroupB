package Lesson21;

public class Rectangle {
	int width;
	int height;

	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}

	public int calculate() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(5, 10);
		System.out.println(rectangle.calculate());
	}
}
