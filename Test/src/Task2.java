import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Task2{
	public static void main(String[] args) throws IOException{
		List list = Files.readAllLines(Paths.get("20141021Log"));
		//list.forEach(System.out::println);
	}
}