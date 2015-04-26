import java.util.ArrayList;


public class Cup {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void add(Integer integer){
		this.list.add(integer);
	}
	public int get(int number){
		return this.list.get(number);
	}
	public int size(){
		return this.list.size();
	}
	
}
