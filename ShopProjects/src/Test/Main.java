package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args){
		Shop s = new Shop();
		List<String> list = new ArrayList<>();
		list = Arrays.asList("a","b","c");
		System.out.println(list);
/*		Item i = new Item("‚è‚ñ‚²", 1000);
		Card card = new Card("GOLD");
		s.addItem(i);
		s.totalCost();
*/	}
}
