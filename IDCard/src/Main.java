
public class Main {
	public static void main(String[] args){
		Shopping s = new Shopping();
		Item i = new Item("‚è‚ñ‚²", 1000);
		Item i2 = new Item("banana", 100);
		
		s.addItem(i);
		s.addItem(i2);
		
		s.totalCost(1);
	}
}
