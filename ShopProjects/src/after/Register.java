package after;

import java.util.List;

public class Register {
	void printBanner(String message){
		System.out.println("***********************");
		System.out.println("**** "+ message +" ****");
		System.out.println("***********************");
	}
	void printSalesBackground(String name, List<String> nameList , double sum){
		System.out.println("name: " + name);
		System.out.println("itemList: " + nameList);
		System.out.println("sum: " + sum);
	}
	void printSales(double sum){
		System.out.println(sum);
	}
}
