import java.util.*;
public class Traversal {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        /*
        without using Iterator
        for(int n : list) {
            if(n==4) list.remove(n); // concurrent modificaion exception.
            System.out.print(n+" ");
        }
        */

        // using Iterator
        Iterator<Integer> it = list.iterator();
        // 1. it.next(), 2. it.hasNext(), 3. it.remove()
        while(it.hasNext()) {
            int current = it.next();
            if(current == 4) it.remove(); // no error
            System.out.print(current+" ");
        }
        System.out.println();
        System.out.println(list);

        /*
        ListIterator - works only with list
        - moves both forward and *backward*
        1) it.hasPrevious() 
        2) it.previous()
        */

        ListIterator<Integer> lit = list.listIterator();
        while(lit.hasNext()) {
            int current = lit.next(); // forward iteration
            if(current == 4) lit.remove(); 
        }
        while(lit.hasPrevious()) {
            int prev = lit.previous(); // reverse / backward iteration
            System.out.print(prev+" "); 
        }
    }
}
