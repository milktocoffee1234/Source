import java.io.File;

import javax.xml.bind.JAXB;


public class jaxbTest {
	public static void main(String[] args){
		Student student = JAXB.unmarshal(new File("student.xml"),Student.class);
		System.out.println(student);
	}
}
