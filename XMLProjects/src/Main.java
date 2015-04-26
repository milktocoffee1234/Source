import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		List<File> listFile = Arrays
				.asList(new File("20141105Log").listFiles());

		for (File file : listFile) {
			List<String> list = Files.readAllLines(Paths.get(file.getPath()),StandardCharsets.UTF_8);
			List<String> newXMLData = new ArrayList<String>();
			String newStr;
			for (String line : list) {
				newStr = line.replace("<?xml version='1.0' encoding='UTF-8'?>",
						"");
				newXMLData.add(newStr);
			}

			FileWriter fw = new FileWriter(new File("LogData\\"
					+ file.getName()), true);
			for (String str : newXMLData) {
				fw.write(str + "\n");
			}
			fw.close();

		}
	}

}
