
public class IDCard {
	private String name;
	private String id;
	private int point;
	
	public IDCard(String id , String name){
		this.id = id;
		this.name = name;
		this.point = 1000;
	}
	public String getName(){
		return this.name;
	}
	public String getId(){
		return this.id;
	}
	public int getPoint(){
		return this.point;
	}
	public void setPoint(int point){
		this.point = point;
	}
}
