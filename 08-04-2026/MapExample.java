import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
        System.out.println(map.keySet()); // keys
        System.out.println(map.values()); // values
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // used to loop
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
