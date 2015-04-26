package Test;
import java.util.ArrayList;
import java.util.List;


public class Shop {
	private List<Item> shoppingcart = new ArrayList<Item>(); 
	private String name;
	
	public void addItem(Item i){
		this.shoppingcart.add(i);
	}
	
	
	public void totalCost(int days){
		int sum = 0;
		int interest = sum + days * 2;
		List<String> nameList = new ArrayList<String>();

			
		
		

		//メソッドの抽出
		System.out.println("name: " + nameList);
		System.out.println("amount " + sum);
		
	}
	public void getOutstanding(int sum , List nameList){
		for(int i = 0; i < this.shoppingcart.size(); i++){
			sum += shoppingcart.get(i).getPrice();
			nameList.add(shoppingcart.get(i).getName());
		}
	}
	public void printDetails(int sum){
		System.out.println("name: " + name);
		System.out.println("amount " + sum);

	}
	
}
