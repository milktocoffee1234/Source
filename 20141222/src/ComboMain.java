
public class ComboMain {
	public static void main(String[] args){
		Combo comb = new Combo();
		comb.setDrink(new Drink("�R�[�q�[",200));
		comb.addSweet(new Cake("������",380));
		comb.addSweet(new CreamPuff("������", 300));
		
		comb.print();
		
		System.out.println(comb.getTotalPrice());
	}
}
