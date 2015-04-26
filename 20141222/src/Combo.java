import java.util.ArrayList;

public class Combo {
	private Drink drink;
	private ArrayList<Sweet> list = new ArrayList<Sweet>();
	
	public Combo(){}
	public void addSweet(Sweet sweet){
		list.add(sweet);
	}
	public void setDrink(Drink drink){
		this.drink = drink;
	}
	public int getTotalPrice(){
		return list.stream().mapToInt(e -> e.getPrice()).sum() + drink.getPrice();
	}
	public void print(){
		System.out.println(this.drink.getName() + " " + this.drink.getPrice());
		for(Sweet sweet : list){
			System.out.println(sweet.getName() + " " + sweet.getPrice());
		}
	}
}
