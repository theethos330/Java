public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {14, 55, 332, 222, 44, 4, 22, 4343};
        System.out.println(Solution(arr));
    }

    static int Solution(int arr[]) {
        int digits, count = 0;

        for(int element : arr) {
            digits = (int)(Math.log10(element))+1;

            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
