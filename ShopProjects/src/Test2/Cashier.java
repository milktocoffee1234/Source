package Test2;

import java.util.List;

public class Cashier extends Person{
	private Register regi;
	private Customer customer;
	
	public Cashier(String name, String age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}
	public void setPosition(Register regi){
		this.regi = regi;
	}
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
}
