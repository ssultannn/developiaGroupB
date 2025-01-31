package lesson20H;

public class Book {
	String title;
	String author;

	public Book(String t, String a) {
		title = t;
		author = a;
	}

	public String getDetails() {
		return title + " " + author;
	}
}
