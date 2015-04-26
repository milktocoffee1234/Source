import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
public class JacksonTest {
	public static void main(String[] args){
		ObjectMapper objMapper = new ObjectMapper();
		try{
			Student student = objMapper.readValue(new File("student.json"), Student.class);
			System.out.println(student);
			System.out.println(student.getScore().getFin());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
