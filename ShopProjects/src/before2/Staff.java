package before2;


public class Staff extends Person{
	private Register regi;
	private Customer customer;
	
	public Staff(String name, String age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	public void welcome(String name){
		System.out.println(name + "—l‚¢‚ç‚Á‚µ‚á‚¢‚Ü‚¹");
	}
}
