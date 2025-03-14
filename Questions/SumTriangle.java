import java.util.Arrays;

public class SumTriangle {
    public static void printTriangle(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int size = arr.length - 1;
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            temp[i] = arr[i] + arr[i+1];
        }

        printTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printTriangle(arr);
    }
}
