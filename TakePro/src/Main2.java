
public class Main2 {
	public static void main(String args[]){
		Student student = new Student("田中", 3, 80, true);
		
		if(student.getGrade() >= 3){
			if(student.getCreditInSchool() >= 76){
				if(student.isBelong()){
					System.out.println("基礎プロA取れる");
				}
			}
		}
	}
}
