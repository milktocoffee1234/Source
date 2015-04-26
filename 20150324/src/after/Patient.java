package after;

public class Patient extends Person{
	private String name;
	private String age;
	private String gender;
	private String disease;
	
	public Patient(String name, String age, String gender, String disease){
		super(name, age, gender);
		this.disease = disease;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}
	
}
