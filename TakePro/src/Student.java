
public class Student {
	private String name;
	private int grade;
	private int creditInSchool;
	private boolean isBelong;
	
	public Student(String name, int grade, int creditInSchool, boolean isBelong){
		this.name = name;
		this.grade = grade;
		this.creditInSchool = creditInSchool;
		this.isBelong = isBelong;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getCreditInSchool() {
		return creditInSchool;
	}
	public boolean isBelong() {
		return isBelong;
	}
}
