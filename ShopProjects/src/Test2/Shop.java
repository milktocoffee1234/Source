package Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Shop {
	private List<Item> itemList = new ArrayList<>();
	private List<Customer> customerList = new ArrayList<>();
	
	public void enter(Customer customer){
		this.customerList.add(customer);
	}
	public void hoge(int index){
		Customer cus = this.customerList.get(index);
		
	}
}
