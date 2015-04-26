
public class Temperature {
	private String min;
	private String max;
	
	public String getMin(){
		return this.min;
	}
	public void setMin(String min){
		this.min = min;
	}
	public String getMax(){
		return this.max;
	}
	public void setMax(String max){
		this.max = max;
	}
	@Override
	public String toString() {
		return "Temperature [min=" + min + ", max=" + max + "]";
	}
}
