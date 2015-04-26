
public class CreamPuff implements Sweet{
	private String kind;
	private int price;
	
	public CreamPuff(String kind, int price){
		this.kind = kind;
		this.price = price;
	}
	public String getName(){
		return this.kind + "シュークリーム";
	}
	public int getPrice(){
		return this.price;
	}
	public void print(){
		System.out.println(getName() + " " + this.price);
	}
}
