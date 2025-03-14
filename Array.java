import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // array of primitives
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        in.close();
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;

        //input using for loop
        // for(int i=0; i<arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        //using for each loop
        // for(int num: arr) {
        //     System.out.print(num+" ");
        // }

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str)); 
    }
    
}
