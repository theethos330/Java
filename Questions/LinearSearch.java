import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = in.nextLine();
        System.out.print("Enter the target: ");
        char target = in.next().charAt(0);
        in.close();
        System.out.println(search(str, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch: str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }

    static int linearSearch(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
