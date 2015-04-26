package after;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Shop {
	private Register register = new Register();
	private List<Customer> customerList = new ArrayList<>();
	private Staff staff;
	private String name;
	
	public Shop(String name, Staff staff){
		this.name = name;
		this.staff = staff;
	}
	public String getName(){
		return this.name;
	}
	public void enter(Customer customer){
		staff.welcome(customer.getName());
		this.customerList.add(customer);
	}
	public void salesBackground(){
		register.printBanner("”„ã—š—ð");
		for(Customer cus : customerList){
			register.printSalesBackground(cus.getName(),getNameList(cus), getSum(cus));
		}
	}
	public void sales(){
		register.printBanner(getName() + "”„ã‹àŠz");
		double sales = 0;
		for(Customer cus : customerList){
			 sales = sales + getSum(cus);
		}
		register.printSales(sales);
	}
	public double getSum(Customer customer){
		return customer.getMemberCard().reduction(customer.stream().mapToDouble(e -> e.getPrice()).sum());
	}
	public List<String> getNameList(Customer customer){
		return customer.stream().map(e -> e.getName()).collect(Collectors.toList());
	}


}
