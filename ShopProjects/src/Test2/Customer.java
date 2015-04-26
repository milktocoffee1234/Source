package Test2;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
	private List<Item> shoppingCart = new ArrayList<>();
	private MemberCard card;
	private String name;
	private String age;
	private String gender;
	
	public Customer(String name, String age, String gender){
		super(name, age, gender);
	}
	public void addItem(Item i){
		this.shoppingCart.add(i);
	}

	public void setMemberCard(MemberCard card){
		this.card = card;
	}
	public MemberCard getMemberCard(){
		return this.card;
	}
	public double buy(){
		return shoppingCart.stream().mapToDouble(e -> e.getPrice()).sum();
	}
	public java.util.stream.Stream<Item> stream(){
		return this.shoppingCart.stream();
	}

}
