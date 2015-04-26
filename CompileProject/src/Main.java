
public class Main {
	public static void main(String[] args){
		Cup cup = new Cup();
		cup.add(1);
		cup.add(5);
		cup.add(10);
		
		System.out.println(cup.get(5));
	}
}