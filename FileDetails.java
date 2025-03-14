import java.io.*;

public class FileDetails {
    public static void main(String[] args) throws FileNotFoundException {
   	int lineCount=0, wordCount=0, chCount=0;
	String line;
	String[] stArr;
	try {
	    BufferedReader b = new BufferedReader(new FileReader("Book.txt"));
            while ((line = b.readLine()) != null) {
	    	lineCount++;
		chCount += line.length();
		stArr = line.split(" ");
		wordCount += stArr.length;
	    }

	    System.out.println("No of lines in the file: " + lineCount);
	    System.out.println("No of words in the file: " + wordCount);
	    System.out.println("No of characters in the file: " + chCount);
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}

