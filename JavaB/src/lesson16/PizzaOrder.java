package lesson16;

public class PizzaOrder {
	public static void main(String[] args) {
		PizzaType pizza = PizzaType.PEPERONI;
		switch (pizza) {
		case MARGHERITA:
			System.out.println("вы выбрали тип  маргарита");
			break;
		case PEPERONI:
			System.out.println("вы выбрали тип  пеперони");
			break;
		case BARBEKU:
			System.out.println("вы выбрали тип  барбеку");
			break;
		case SEZAR:
			System.out.println("вы выбрали тип  цезарь");
			break;
		default:
			System.out.println("неизвестный тип пиццы");
			break;
		}
	}
}