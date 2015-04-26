
public class Main2 {
	public static void main(String args[]){
		Student student = new Student("“c’†", 3, 80, true);
		
		if(student.getGrade() >= 3){
			if(student.getCreditInSchool() >= 76){
				if(student.isBelong()){
					System.out.println("Šî‘bƒvƒAæ‚ê‚é");
				}
			}
		}
	}
}
