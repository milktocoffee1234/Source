import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

import List.TestList;
public class CompileExecute {
	private String className;
	private String source;
	private int errorLine;
	
	private InvocationTargetException error;
	public CompileExecute(String className , String source){
		this.className = className;
		this.source = source;
	}
	public  Class<?> compile(){
		JavaFileObject fo = new JavaSourceFromString(this.className, this.source);
		List<JavaFileObject> compilationUnits = Arrays.asList(fo);
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		if (compiler == null) {
			System.out.println("Compiler iss not provided.");
		}
		JavaFileManager fileManager = new ClassFileManager(compiler, null);
		DiagnosticListener<? super JavaFileObject> listener = new ErrorListener(source);
		CompilationTask task = compiler.getTask(null, fileManager, listener,
				null, null, compilationUnits);
		boolean result = task.call();
		ClassLoader cl = fileManager.getClassLoader(null);
		if(result){
			try {
				@SuppressWarnings("unchecked")
				Class<?> c = cl.loadClass(className);
				return  c;
				} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		}else{
			System.out.println("Compileエラーです");
		}
		return null;
	}
	
	
	public void execute(Class<?> clazz) throws Exception{
		System.out.println(clazz);
		Method method = clazz.getMethod("main", new Class[] { String[].class });
		try {
			Object ret = method.invoke(null, new Object[] { null });
			System.out.println("中に入っているかチェック　" + TestList.list);
		} catch (InvocationTargetException e) {
			this.error = e;
			System.out.println(e.getTargetException());
			for(StackTraceElement ele: e.getCause().getStackTrace()){
				if(ele.getClassName().equals(this.className)){
					System.out.println(ele);
					this.errorLine = ele.getLineNumber() - 1 ;
				}
			}
			
		}
	}
	public int getErrorLine(){
		return this.errorLine;
	}
	public InvocationTargetException getError(){
		return this.error;
	}
}
