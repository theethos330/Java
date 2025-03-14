import java.io.*;

public class FileRev {
    static String reverse(String st) {
	String rev = "";
    	for (int i=st.length()-1; i>=0; i--) {
	     rev += st.charAt(i); 
	}
	return rev;
    } 
    public static void main(String[] args) throws FileNotFoundException {
    	try {
	    BufferedReader b = new BufferedReader(new FileReader("Reverse.txt"));
	    String line;
	    String str="";
	    
	    while ((line = b.readLine()) != null) {
	    	str += line;
	
	    }

	    String[] StrArr = str.split(" ");
	    
	    for (int i=0; i<StrArr.length; i++) {
	    	StrArr[i] = reverse(StrArr[i]);	
	    }

	    FileWriter w = new FileWriter("CopyReverse.txt");
	    for (String s: StrArr) {
	    	w.write(s + " ");
	    }
	    w.flush();
	} catch (Exception e) {
	    System.out.println(e);
	}	
    }
}
