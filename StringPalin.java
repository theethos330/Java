import java.util.Scanner;
import java.io.*;

public class StringPalin {
   static  boolean isPalin(String s) {
    	for (int i=0; i<s.length()/2; i++) {
	    if (s.charAt(s.length()-1-i) != s.charAt(i)) {
	    	return false;
	    }
         }
	return true;
    }

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
    	File f1 = new File("first.txt");
	File f2 = new File("second.txt");
	FileWriter w1 = new FileWriter(f1);
	FileWriter w2 = new FileWriter(f2);
	FileReader r2 = new FileReader(f2);

	String[] s = new String[10];
	System.out.print("Enter the no. of Strings: ");
	int n = in.nextInt();

	for (int i=0; i<n; i++) {
	   System.out.println("Enter the string " + i + ": ");
	   s[i] = in.next();
	   if (isPalin(s[i])) {
	   	for (int j=0; j<s[i].length(); j++) {
		    w1.write(s[i].charAt(j));
		}
		w1.write("\n");
	   } else {
	   	for (int j=0; j<s[i].length(); j++) {
                    w2.write(s[i].charAt(j));
                }
                w2.write(" ");
	   }
	}
	
	w1.close();
	w2.close();
	int c;
	do {
	    c = r2.read();
	   System.out.print((char)c);
	}
	while (c != -1);
    }
}
