import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Titus", 67);
        map.put("Rahul", 54);
        map.put("Sangeeth", 58);

        // System.out.println(map.get("Rahul"));
        // System.out.println(map.containsKey("Titus"));

        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(5);
        set.add(7);
        set.add(2);

        System.out.println((set));
    }
}
