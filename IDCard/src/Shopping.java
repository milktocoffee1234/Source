import java.util.ArrayList;
import java.util.List;


public class Shopping {
	private List<Item> shoppingcart = new ArrayList<Item>(); 
	

	private Card membersCard;
	
	public void addItem(Item i){
		shoppingcart.add(i);
	}
	
	public void putCard(Card card){
		this.membersCard = card;
	}
	
	public void totalCost(){
		int sum = 0;
		List<String> nameList = new ArrayList<String>();
		
		
		
		//バナーの印刷
		System.out.println("***********************");
		System.out.println("***** totalCost *******");
		System.out.println("***********************");
		
		
		//合計金額
		for(int i = 0; i < this.shoppingcart.size(); i++){
			sum += shoppingcart.get(i).getPrice();
			nameList.add(shoppingcart.get(i).getName());
		}
		
		
		if(membersCard == GOLD){
			sum = sum - (sum / 10);
		}else if(membersCard == SILVER){
			sum = sum - (sum / 50);
		}else if (membersCard == BRONZE){
			sum = sum - (sum / 100);
		}

		
		//明細の印刷
		System.out.println("name: " + nameList);
		System.out.println("amount " + sum);
		
	}
}
