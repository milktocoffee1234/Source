
public class Weather {
	private Location location;
	private String date;
	private String telop;
	private Temperature temperature;
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTelop() {
		return telop;
	}
	public void setTelop(String telop) {
		this.telop = telop;
	}
	public Temperature getTemperature() {
		return temperature;
	}
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Weather [location=" + location + ", date=" + date + ", telop="
				+ telop + ", temperature=" + temperature + "]";
	}
	
	
}
