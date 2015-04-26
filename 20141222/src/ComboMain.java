
public class ComboMain {
	public static void main(String[] args){
		Combo comb = new Combo();
		comb.setDrink(new Drink("コーヒー",200));
		comb.addSweet(new Cake("いちご",380));
		comb.addSweet(new CreamPuff("メロン", 300));
		
		comb.print();
		
		System.out.println(comb.getTotalPrice());
	}
}
