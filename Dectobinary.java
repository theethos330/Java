import java.util.ArrayList;
import java.util.Collections;

public class Dectobinary {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list = conversion(1);
        Collections.reverse(list);
        for (int n : list) {
            System.out.print(n+"\t");
        }
    }

    static ArrayList<Integer> conversion(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while(n>0) {
            list.add(n%2);
            n = n/2;
        }

        return list;
    } 
}
