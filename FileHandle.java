import java.io.*;

public class FileHandle {
    public static void main(String[] args) throws IOException {
    	try {
	    File fin  = new File("first.txt");
	    File fout = new File("second.txt");

	    FileReader reader = new FileReader(fin);
	    FileWriter writer = new FileWriter(fout);
	    char[] chars = new char[(int)fin.length()];

	    reader.read(chars);
	    writer.write(chars);
	    writer.flush();
	}
	catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}
