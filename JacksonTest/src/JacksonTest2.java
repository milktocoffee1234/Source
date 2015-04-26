import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JacksonTest2 {
	public static void main(String[] args){
		ObjectMapper objMapper = new ObjectMapper();
		try{
			JavaType javatype = objMapper.getTypeFactory().constructCollectionType(List.class, Weather.class);
			List<Weather> list = objMapper.readValue(new URL("http://www2.asp.sie.dendai.ac.jp/damie.json"), javatype);
			list.forEach(System.out::println);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
