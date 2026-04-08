import java.util.*;
public class Treeset {
    static int closest(int[] arr, int target) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        // uses self balancing Red-Black Tree
        // stores elements in ascending order

        for( int n: arr ) {
            treeSet.add(n);
        }
        Integer low = treeSet.lower(target); // returns smaller value
        Integer high = treeSet.higher(target); // returns larger value
        
        if(low == null) return high;
        if(high == null) return low;
        return (target - low >= target - high) ? high : low;
    }
    
    public static void main(String[] args) {
        int[] arr = {10,15,20,25,27,40};
        int t = 10;
        System.out.print("Closest element to "+t+" is: ");
        System.out.println(closest(arr, t));
    }
}

/*
why not use floor or ceiling??

floor() and ceiling() - 
    returns the element with least difference with the parameter, so floor(25) returns 25.
lower() and higher() - strictly checks lower or higher value.

*/
