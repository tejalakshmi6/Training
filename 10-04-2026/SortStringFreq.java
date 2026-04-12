import java.util.*;

public class SortStringFreq {
    static Character[] sortString(String s) {
        // 1. Frequency using HasMap
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 2. Map stored in ArrayList (map cannot be sorted, only list can be sorted)
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // 3. Sorting list using comparator
        Collections.sort(list, (a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // higher frequency first
            }
            return a.getKey() - b.getKey(); // alphabetical order
        });

        Character[] res = new Character[map.size()];
        int ind = 0;
        for (Map.Entry<Character, Integer> m : list) {
            res[ind++] = m.getKey();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortString("tresspass")));
    }
}
