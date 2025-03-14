public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        System.out.println(smallestLetter(arr, 'a'));
    }

    // smallest letter greater than target letter
    static char smallestLetter(char[] arr,char target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        
        return arr[start];
    }
}
