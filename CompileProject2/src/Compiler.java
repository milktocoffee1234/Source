
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;


public class Compiler {
	protected DiagnosticCollector<? super JavaFileObject> diagnostic = new DiagnosticCollector<JavaFileObject>();
	protected JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	private boolean successCompile;
	
	/** 郢ｧ�ｽｳ郢晢ｽｳ郢昜ｻ｣縺�郢晢ｽｫ陞ｳ貅ｯ�ｽ｡�ｿｽ*/
	public <T>Class<T> compile(String class_name, String source_code) {
		JavaFileObject fo = new JavaSourceFromString(class_name, source_code);

		List<JavaFileObject> compilationUnits = Arrays.asList(fo);
		List<String> options = Arrays.asList(
					"-classpath", System.getProperty("java.class.path")
				);
		JavaFileManager manager = new ClassFileManager(compiler, diagnostic);
		CompilationTask task = compiler.getTask(
						null,
						manager,	//陷�ｽｺ陷牙ｸ吶Ψ郢ｧ�ｽ｡郢ｧ�ｽ､郢晢ｽｫ郢ｧ蜻域｡ｶ邵ｺ�ｿｽ�ｿｽ郢晞亂�ｿｽ郢ｧ�ｽｸ郢晢ｽ｣郢晢ｽｼ
						diagnostic,	//郢ｧ�ｽｨ郢晢ｽｩ郢晢ｽｼ隴弱ｅ�ｿｽ陷�ｽｦ騾��ｿｽ�ｽ帝勗蠕娯鴬郢晢ｽｪ郢ｧ�ｽｹ郢晉ｿｫ�ｿｽ�ｿｽ�ｿｽull邵ｺ�ｽｧ郢ｧ繧��ｽ育ｸｺ�ｿｽ�ｽｼ�ｿｽ						
						options,	//郢ｧ�ｽｳ郢晢ｽｳ郢昜ｻ｣縺�郢晢ｽｫ郢ｧ�ｽｪ郢晏干縺咏ｹ晢ｽｧ郢晢ｽｳ
						null,
						compilationUnits	//郢ｧ�ｽｳ郢晢ｽｳ郢昜ｻ｣縺�郢晢ｽｫ陝�ｽｾ髮趣ｽ｡郢晁ｼ斐＜郢ｧ�ｽ､郢晢ｽｫ驗抵ｽ､
					);
		this.successCompile = task.call();
		System.out.println(this.successCompile);
		if (this.successCompile) {
			ClassLoader cl = manager.getClassLoader(null);
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
	public String getMessage(){
		String str = "";
		for(Diagnostic<?> diagnostic:this.diagnostic.getDiagnostics()){
			str += diagnostic.getMessage(null);
			str += "\n";
		}
		return str;
	}
	public String execute(Class<?> clazz) throws Exception{
		synchronized(System.out){
		    PrintStream temp = System.out;
			try {
				System.out.println("exe");
				Method method = clazz.getMethod("main", new Class[] { String[].class });
	            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    		System.setOut(new PrintStream(baos));
	            Object ret = method.invoke(null, new Object[] { null}); 
	            System.setOut(temp);
	            System.out.println("baosの値" + baos);

			    return baos.toString();
			} catch(InvocationTargetException e){
				System.setOut(temp);
				System.out.println("InvocationTargetExceptionのところ");
				return e.getTargetException().toString();	
			}catch (Exception e){
				System.setOut(temp);
				System.out.println("Exceptionのところ");
				return e.toString();
			}finally {
				
			}
		}
	}
	public boolean getSuccessCompile(){
		return this.successCompile;
	}
}
