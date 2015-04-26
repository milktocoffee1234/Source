package invokeTest;

import stu.Student;
public class Main2 {
	public static void main(String[] args) throws Exception{
		Invoke i = new Invoke();
		i.exe(Main.class);
		System.out.println(Student.list);
		
		System.out.println(Student.list.list.get(0));
	}
}
