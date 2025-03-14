import java.io.*;
import java.util.Scanner;

public class FileUpper {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: ");
	String s = sc.nextLine();
	
	try {
	   FileWriter w = new FileWriter("Case.txt");
	   for (int i=0; i<s.length(); i++) {

	    	if ('a' <= s.charAt(i) && s.charAt(i)<= 122) {
		    w.write(Character.toUpperCase(s.charAt(i)));
		} else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                    w.write(Character.toLowerCase(s.charAt(i)));
                } else {
		    w.write(s.charAt(i));
		}
	   }
	   w.flush();
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}
