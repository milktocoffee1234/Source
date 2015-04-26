package after;


public class Staff extends Person{
	public Staff(String name, String age, Gender gender) {
		super(name, age, gender);
	}
	public void welcome(String name){
		System.out.println(name + "—l‚¢‚ç‚Á‚µ‚á‚¢‚Ü‚¹");
	}
}
