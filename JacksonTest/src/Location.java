
public class Location {
	private String city;
	private String prefecture;
	
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String prefecture(){
		return this.prefecture;
	}
	public void setPrefecture(String prefectrue){
		this.prefecture = prefectrue;
	}
	@Override
	public String toString() {
		return "Location [city=" + city + ", prefecture=" + prefecture + "]";
	}
}
