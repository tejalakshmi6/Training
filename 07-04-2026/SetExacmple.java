import java.util.*;
public class SetExacmple {
    public static void main(String[] args) {
        Set<Integer> Hset = new HashSet<>(); // UNORDERED - stores in random unpredictable order 
        Set<Integer> Linkedset = new LinkedHashSet<>(); 
        // ORDERED - same as input order, uses doubly linked list to maintain order
        int[] arr = {5, 3, 9, 1, 7, 2};
        for( int n: arr ) {
            Linkedset.add(n);
            Hset.add(n);
        }
        System.out.println(Linkedset);
        System.out.println(Hset); 
    }
}