import java.io.*;

public class Filec {
    public static void main(String[] args) throws IOException {
    	int count = 0;
	try {
	    BufferedReader r = new BufferedReader(new FileReader("count.txt"));
	    
	    while (r.readLine() != null) {
	    	count++;
            }
	} 

	catch (IOException e) {
	    e.printStackTrace();
	}

	System.out.println("Number of lines in the file is: " + count);   
	
    }
}
