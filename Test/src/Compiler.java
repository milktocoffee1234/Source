import java.util.Arrays;
import java.util.List;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class Compiler {
	protected DiagnosticCollector<? super JavaFileObject> diagnostic = new DiagnosticCollector<JavaFileObject>();
	protected JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	private boolean successCompile;
	
	public <T>Class<T> compile(String class_name, String source_code) {

		List<String> options = Arrays.asList(
					"-classpath", System.getProperty("java.class.path")
				);
		CompilationTask task = compiler.getTask(
						null,
						null,	
						diagnostic,		
						options,	
						null,
						null	
					);
		this.successCompile = task.call();
		System.out.println(this.successCompile);
		if (this.successCompile) {
			try {
				@SuppressWarnings("unchecked")
				Class<T> c = (Class<T>)cl.loadClass(class_name);
				return c;
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		}else{
			System.out.println("compileエラー " + class_name);
		}
		return null;
	}
}