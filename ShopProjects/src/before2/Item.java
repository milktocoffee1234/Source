package before2;

public class Item {
	private String name;
	private double price;
	
	public Item(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return this.name;
	}
	public double getPrice(){
		return this.price;
	}
}
