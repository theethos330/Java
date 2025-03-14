import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 56, 4, 29, 56};
        // System.out.println(find(arr, 56, 0));
        // System.out.println(findIndexLast(arr, 56, arr.length-1));
        // findIndexAll(arr, 56, 0);
        // System.out.println(list);

        System.out.println(findAllIndex2(arr, 4, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    } 

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {    
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndex(arr, target, index+1);
        }
      
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {    
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndexLast(arr, target, index-1);
        }
      
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndexAll(int[] arr, int target, int index) {
        if (index == arr.length) {    
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
            
        findIndexAll(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

}
