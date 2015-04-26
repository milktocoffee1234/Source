package Test2;

public class Main {

	public static void main(String[] args) {
		Customer cus = new Customer("“c’†", "20","’j");
		Item i1 = new Item("apple",100);
		Item i2 = new Item("banana",200);
		Item i3 = new Item("budo",300);

		cus.addItem(i1);
		cus.addItem(i2);
		cus.addItem(i3);

		System.out.println(cus.buy());
	}

}
