package after;

public class Doctor extends Person{
	private String name;
	private String age;
	private String gender;
	
	public Doctor(String name, String age, String gender){
		super(name,age,gender);
	}
	public void examine(Patient patient){
		System.out.println(patient.getDisease() + "‚Å‚·‚Ë");
	}
}
