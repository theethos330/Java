import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter no. to check: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int check = n&1;
        if (check == 0) {
            System.out.println(n+" is even");
        }
        else {
            System.out.println(n + " is odd");
        }
    }   
}
