package before2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Shop {
	private Register register = new Register();
	private List<Customer> customerList = new ArrayList<>();
	private Staff cashier;
	private String name;
	
	public Shop(String name, Staff cashier){
		this.name = name;
		this.cashier = cashier;
	}
	public void enter(Customer customer){
		cashier.welcome(customer.getName());
		this.customerList.add(customer);
	}
	public void buyList(){
		double totalItemPrice;
		List<String> nameList = null;
		double sum = 0;
		
		
		register.printBanner("����");
		for(Customer cus : customerList){
			totalItemPrice = cus.stream().mapToDouble(e -> e.getPrice()).sum();
			nameList = cus.stream().map(e -> e.getName()).collect(Collectors.toList());
			sum = cus.getMemberCard().reduction(totalItemPrice);
			register.printReceipt(cus.getName(),nameList, sum);
		}
	}
	public void sales(){
		register.printBanner("������z");
		double sum = 0;
		for(Customer cus : customerList){
			 sum = sum + cus.getMemberCard().reduction(cus.stream().mapToDouble(e -> e.getPrice()).sum());
		}
		System.out.println(sum);
	}

}
