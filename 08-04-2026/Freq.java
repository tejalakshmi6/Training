import java.util.*;

public class Freq {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 2, 4, 3 };
        Map<Integer, Integer> map = new HashMap<>();
        // HashMap is not ordered.
        for (int n : arr) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " exists " + entry.getValue() + " times.");
        }
    }
}
