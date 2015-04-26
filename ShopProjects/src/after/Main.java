package after;


public class Main {
	public static void main(String[] args){
		Staff staff = new Staff("斉藤","21",Gender.MAIL);
		Shop s = new Shop("コツトコ", staff);
		Customer cus = new Customer("田中", "20", Gender.MAIL);
		Customer cus2 = new Customer("小田", "41", Gender.MAIL);

		
		s.enter(cus);
		s.enter(cus2);

		Item i = new Item("apple", 1000);
		Item i2 = new Item("banana", 1000);
		
		cus2.addItem(i);
		cus2.setMemberCard(MemberCard.SILVER);
		
		cus.addItem(i);
		cus.addItem(i2);
		cus.setMemberCard(MemberCard.GOLD);
		
		s.salesBackground();
		s.sales();
		
		
	}

}
