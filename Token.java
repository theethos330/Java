import java.util.Scanner;
import java.util.*;

public class Token {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a line of integers: ");
	String s = sc.nextLine();
	StringTokenizer st = new StringTokenizer(s, " ");
	int sum = 0;

	while (st.hasMoreTokens()) {
	    sum += Integer.parseInt(st.nextToken());
	}

	System.out.println(sum);
    }
}
