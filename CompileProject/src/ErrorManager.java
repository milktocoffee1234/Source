import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


public class ErrorManager {
	private String source;
	private Exception error;
	private List<String> sourceList = new ArrayList<String>();
	public ErrorManager(String source,Exception e){
		this.source = source;
		this.error = e;
	}
	public void searchError(int lineNumber){
		String[] strs = source.split("\n");
		for(String s : strs){
			this.sourceList.add(s);
		}
		System.out.println("----sourceの中身----");
		for(int i = 0; i < this.sourceList.size(); i++){
			String line = this.sourceList.get(i);
			if(i == lineNumber){
				System.out.println(line + " <--Error");
			}else{
				System.out.println(line);
			}
		}
	}
	public void judge(InvocationTargetException e){
		if(e.getTargetException() instanceof java.lang.IndexOutOfBoundsException){
			System.out.println("サイズオーバーやがな");
		}else if(e.getTargetException() instanceof java.lang.NullPointerException){
			System.out.println("nullだよ！");
		}
	}

}
