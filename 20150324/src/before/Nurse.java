package before;
import java.util.ArrayList;
import java.util.List;


public class Nurse {
	private String name;
	private String age;
	private String gender;
	
	public Nurse(String name, String age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void call(Doctor doctor , List<Patient> list){
		for(int i = 0; i < list.size(); i++){
			Patient p = list.get(i);
			System.out.println(p.getName() + "В≥Вс");
			doctor.examine(list.get(i));
		}
	}
}
