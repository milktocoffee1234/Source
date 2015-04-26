import java.util.ArrayList;
import java.util.List;


public class Clinic {
	private String name;
	private Nurse nurse;
	private Doctor doctor;
	private List<Patient> patientList = new ArrayList<>();
	
	public Clinic(String name, Nurse nurse,Doctor doctor){
		this.name = name;
		this.nurse = nurse;
		this.doctor = doctor;
	}
	public void enter(Patient patient){
		this.patientList.add(patient);
	}
	
	public void examine(){
		this.nurse.call(this.doctor, this.patientList);
	}
	public String getName(){
		return this.name;
	}
}
