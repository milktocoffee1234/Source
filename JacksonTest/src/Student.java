
public class Student {
	private String id;
	private String name;
	private Score score;
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Score getScore(){
		return this.score;
	}
	public void setScore(Score score){
		this.score = score;
	}
	
	@Override
	public String toString(){
		return "Student(id:" + this.id + ",name:" + this.name + ",score:" + this.score + ")";
	}
}
