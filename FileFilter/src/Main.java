import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;




public class Main {
	public static void main(String[] args) throws IOException{
		File[] files = new File("20141020Log").listFiles();
		List<String> list = Files.readAllLines(Paths.get(files[0].getPath()));
		System.out.println(list);
		
		
		
	}
}
