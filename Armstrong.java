import java.util.Scanner;

public class Armstrong {
    static boolean isArmstrong(int n) {
    	int c = (int)Math.log10(n) + 1;
	
	int original = n;
	int sum = 0;
	while (original != 0) {
	     int r = original%10;
	     sum += Math.pow(r,c);
	     original = original/10;
	}
	if (sum == n) {
	    return true;
	}

	return false;
    }
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter any number: ");
	int n = in.nextInt();
    	if(isArmstrong(n)) {
	     System.out.println("The number is armstrong");
	} else {
	    System.out.println("The number is armstrong");
	}
    }
}
