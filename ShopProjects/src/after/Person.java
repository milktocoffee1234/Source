package after;

public class Person {
	private String name;
	private String age;
	private Gender gender;
	
	public Person(String name, String age, Gender gender){
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

	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
