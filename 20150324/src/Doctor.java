
public class Doctor{
	private String name;
	private String age;
	private String gender;
	
	public Doctor(String name, String age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void examine(Patient patient){
		System.out.println(patient.getDisease() + "‚Å‚·‚Ë");
	}
}
