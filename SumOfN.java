import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , sum = 0;

        System.out.print("Enter any number: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; ++i) {
            sum += i;
        }

        System.out.println("Sum of " + num + " natural numbers is: "  + sum);
        sc.close();
    }
}