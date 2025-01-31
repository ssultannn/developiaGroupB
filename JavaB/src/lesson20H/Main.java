package lesson20H;

public class Main {
	public static void main(String[] args) {
		Book[] library=new Book[2];
		Book book=new Book("Грокаем алгоритмы", "Emil");
		Book book2=new Book("Java", "Elvin");
		
		library[0]=book;
		library[1]=book2;
		
		
	System.out.println(( library[1]).getDetails());	
	}
}
