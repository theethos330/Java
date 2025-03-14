import java.util.Arrays;

public class Array {
    // 0 4  1 3  2  2
    // 0 5  1 4  2 3    
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3 ,5};
        System.out.println((arr.length)/2);
        // System.out.println(max(arr));
        reverse(arr);
        // swap(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < (arr.length)/2; i++) {
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
    }

    static int max(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

