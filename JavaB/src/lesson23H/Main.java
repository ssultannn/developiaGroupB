package lesson23H;

public class Main {
	public static void main(String[] args) {
		Order order1 = new Order(1, "пицца");
		order1.completeOrder();
		System.out.println(order1.getOrderId() + " " + order1.getDishName());
		order1.getOrderStatus();
	}
}
