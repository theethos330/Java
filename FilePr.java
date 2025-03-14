import java.io.*;

public class FilePr {
    public static void main(String[] args) throws IOException {
    	try {
	    File f = new File("test.txt");
	    FileWriter w = new FileWriter(f);

	    w.write("This is the test data");
	    w.flush();
	    w.close();

	    FileReader r = new FileReader(f);
	    //int ch;
	    //while((ch = r.read()) != -1) {
	    //	System.out.print((char)ch);
	    //}
	    char[] ch = new char[(int)f.length()];
	    r.read(ch);
	    System.out.println(ch);
	    r.close();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
