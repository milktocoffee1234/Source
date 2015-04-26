import java.io.*;

public class Main {
	// Throw exceptions to console:
	public static void main(String[] args) throws Exception {
		String code = "public Test{}";
		String className = "Test";
		
		Compiler compiler = new Compiler();
		Class<?> clazz = compiler.compile(className, code);
		compiler.execute(clazz);
		
	}
}