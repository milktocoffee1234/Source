package after;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
	private List<Item> shoppingCart = new ArrayList<>();
	private MemberCard card = MemberCard.NONE;
	
	public Customer(String name, String age, Gender gender){
		super(name, age, gender);
	}
	
	public void addItem(Item i){
		this.shoppingCart.add(i);
	}
	public Item getItem(int index){
		return this.shoppingCart.get(index);
	}
	public void setMemberCard(MemberCard card){
		this.card = card;
	}
	public MemberCard getMemberCard(){
		return this.card;
	}
	public java.util.stream.Stream<Item> stream(){
		return this.shoppingCart.stream();
	}

}
