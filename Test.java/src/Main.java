import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;


public class Main {
	public static void main(String[] args){
		JavaCompiler c = ToolProvider.getSystemJavaCompiler();
		if(c == null){
			System.out.println("null");
		}
		
	}

}
