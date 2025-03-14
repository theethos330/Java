public class Floor {
    public static void main(String[] args) {
        int[] arr = {15, 25, 33, 44, 95};
        System.out.println(floor(arr, 85));
    }

    // floor is the greatest element smaller or equal to target
    static int floor(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1; 
            } else {
                return mid;
            }
        }

        return end;
    } 
}
