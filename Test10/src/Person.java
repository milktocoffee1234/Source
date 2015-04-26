
public class Person {
	private String name;
	private String officeAreaCode;
	private String officeNumber;
	
	public String getName(){
		return name;
	}
	public String getTelephoneNumber(){
		return ("(" + this.officeAreaCode + ")" + this.officeNumber);
	}
	public String getOfficeAreaCode(){
		return this.officeAreaCode;
	}
	public void setOfficeAreaCode(String arg){
		this.officeAreaCode = arg;
	}
	public String officeNumber(){
		return this.officeNumber;
	}
	public String getOfficeNumber(){
		return officeNumber;
	}
	public void setOfficeNumber(String arg){
		this.officeNumber = arg;
	}
}
