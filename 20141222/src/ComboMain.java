
public class ComboMain {
	public static void main(String[] args){
		Combo comb = new Combo();
		comb.setDrink(new Drink("ƒR[ƒq[",200));
		comb.addSweet(new Cake("‚¢‚¿‚²",380));
		comb.addSweet(new CreamPuff("ƒƒƒ“", 300));
		
		comb.print();
		
		System.out.println(comb.getTotalPrice());
	}
}
