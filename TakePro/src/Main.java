
public class Main {
	static int usualValue = 2500;
	static int saleValue = 1000;
	static double tax = 0.08;
	public static void main(String[] args){
		double price = 0;
		int cost = 5000;
		
		Person person = new Person("“c’†" , 10);
		
		if(notTarget(person.getOld())){
			price = usualPrice(cost);
		}else{
			price = salePrice(cost);
		}
		
		System.out.println(price);
	}
	private static double usualPrice(int cost) {
		// TODO Auto-generated method stub
		return cost + usualValue + (cost + usualValue) * tax;
	}
	private static double salePrice(int cost){
		return  cost + saleValue + (cost + saleValue) * tax;
	}
	public static boolean notTarget(int old){
		return old < 20 || old > 25;
	}
}
