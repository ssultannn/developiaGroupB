package lesson31;

public class Test {
	public static void main(String[] args) {
Animal animal =new Animal() {
	
	@Override
	void sound() {
	System.out.println("hello");
		
	}
};
animal.sound();
	}
}
