package lesson16;

public enum PizzaSize {
	SMALL(8), MEDIUM(12), LARGE(16);
	
	int price;
	
	PizzaSize(int price){
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
