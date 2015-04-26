package before2;

public class Person {
	private String name;
	private String age;
	private String gender;
	
	public Person(String name, String age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
