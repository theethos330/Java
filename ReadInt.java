import java.util.*;
import java.io.*;

public class ReadInt {
    public static void main(String[] args) throws IOException {
	Scanner in =  new Scanner(System.in);
	String s;
	File f1 = new File("first.txt");
	File f2 = new File("second.txt");
	FileWriter w1 = new FileWriter(f1);
	FileWriter w2 = new FileWriter(f2);

	System.out.print("Enter the string of numbers with space between them: ");
	s = in.nextLine();
	String[] stArr = s.split(" ");
	for (String st: stArr) {
	    w1.write(st + " ");
	}
	w1.flush();
	w1.close();

	FileReader r1 = new FileReader(f1);
	char chars[] = new char[(int)f1.length()];
	r1.read(chars);
	s = "";
	for (char c: chars) {
	     s += c;
	}
	stArr = s.split(" ");
	int ind = 0;

	int[] arr = new int[stArr.length];

	for (String st: stArr) {
	    arr[ind++] = Integer.parseInt(st);
	}

	for (int i=0; i<arr.length; i++) {
	    for (int j = 0; j<arr.length-1; j++) {
		if (arr[j] > arr[j+1]) {
	           int temp = arr[j];
		   arr[j] = arr[j+1];
		   arr[j+1] = temp;
		}
	   }
	}
	
	for (int el: arr) {
	    w2.write(el + " ");
	}

        w2.flush();
        System.out.println("The largest element is: "  + arr[arr.length-1]);
    }
}

