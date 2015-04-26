package after;
import java.util.ArrayList;
import java.util.List;


public class Nurse extends Person{
	private String name;
	private String age;
	private String gender;
	
	public Nurse(String name, String age, String gender){
		super(name,age,gender);
	}
	public void call(Doctor doctor , List<Patient> list){

		for(int i = 0; i < list.size(); i++){
			Patient p = list.get(i);
			System.out.println(p.getName() + "В≥Вс");
			doctor.examine(list.get(i));
		}
	}
}
