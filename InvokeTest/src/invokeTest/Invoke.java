package invokeTest;
import java.lang.reflect.Method;
import stu.Student;

public class Invoke {
	public void exe(Class<?> clazz) throws Exception{
		Method method = clazz.getMethod("main", new Class[] { String[].class });
        Object ret = method.invoke(null, new Object[] { null }); 
        	
        System.out.println("invoke" + Student.list);
	}
}
