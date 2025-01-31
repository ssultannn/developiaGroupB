package lesson23H;

public class Order {
	private int orderId;
	private String dishName;
	private boolean isCompleted=false;

	public Order(int orderId, String dishName) {
		this.orderId = orderId;
		this.dishName = dishName;
	}
	//getter
	public int getOrderId() {
		return orderId;
	}
	//setter
	public void setOrderId(int orderId) {
		this.orderId=orderId;
	}
	
	//getter
	public String getDishName() {
		return dishName;
	}
	//setter
	public void setDishName(String dishName) {
		this.dishName=dishName;
	}
	
	public void completeOrder() {
		isCompleted=true;
	}
	
	public void  getOrderStatus() {
		if (isCompleted) {
			System.out.println("заказ готов");
		}else {
			System.out.println("заказ  не готов");
		}
	}
}
