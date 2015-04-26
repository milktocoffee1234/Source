import java.util.ArrayList;


public class Page {
	private String title;
	protected ArrayList<String> body = new ArrayList<String>();
	
	public Page(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void addText(String text){
		this.body.add(text);
	}
	public int bodySize(){
		return this.body.size();
	}
	public String getLineText(int line){
		return this.body.get(line);
	}
}
