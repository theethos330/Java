import java.io.*;

public class FileStream {
    public static void main(String[] args) {
	try {
	    int i;
    	    FileInputStream fin = new FileInputStream("stream.txt");
	    FileOutputStream fout = new FileOutputStream("streamcopy.txt");

	    do {
	    	i = fin.read();
		if (i != -1) {
		    fout.write(i);
		}
	    } while (i != -1);
	}
	catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}
