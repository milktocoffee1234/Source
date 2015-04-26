import java.io.FileNotFoundException;
import java.io.PrintStream;


public class MyPrintStream extends PrintStream{
    public MyPrintStream(String fileName) throws FileNotFoundException {
        super(fileName);
    }
}
