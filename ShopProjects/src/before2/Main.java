package before2;

public class Main {
	public static void main(String[] args){
		Staff staff = new Staff("適当","14", "女");
		Shop s = new Shop("anaguma", staff);
		Customer cus = new Customer("田中", "11", "男");
		Customer cus2 = new Customer("今田", "14", "女");
		
		s.enter(cus);
		s.enter(cus2);

		Item i = new Item("apple", 1000);
		Item i2 = new Item("banana", 500);
		Item i3 = new Item("budo", 500);
		Item i4 = new Item("coffee", 290);
		
		cus2.addItem(i4);

		
		cus.addItem(i);
		cus.addItem(i2);
		cus.addItem(i3);
		cus.setMemberCard(MemberCard.GOLD);
		
		s.buyList();
		s.sales();
		
		
	}

}
