import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternMatch {
	private String regex;
	private String source;
	private String message = "no match";
	private int groupNumber = 0;
	private boolean flag = true;
	
	public PatternMatch(String regex,String source){
		this.regex = regex;
		this.source = source;
	}
	public String match(){
		Pattern p = Pattern.compile(this.regex);
		Matcher m = p.matcher(this.source);
		this.flag = m.find();
		if(this.flag){
			return m.group(this.groupNumber);
		}else{
			return this.message;
		}
	}
	public void setGroupNumber(int number){
		this.groupNumber = number;
	}
	public void setMessage(String message){
		this.message = message;
	}
	public boolean getFlag(){
		return this.flag;
	}
}
