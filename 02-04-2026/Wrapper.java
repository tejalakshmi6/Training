import java.util.*;

class Wrapper {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(10); // Autoboxing - int -> Integer
        Integer b = Integer.valueOf("1234"); // String to Integer - return type: Object(Integer)
        Integer c = Integer.valueOf("01234"); // Converts as type int - return type: int(int)
        int d = b; // Unboxing - Integer -> int
        System.out.println(a+" "+b+" "+c+" "+d);


        //Integer range: -128 to 127
        Integer n1 = 128;
        Integer n2 = 128;
        System.out.println(n1 == n2); // compares reference
        System.out.println(n1.equals(n2)); // compares value
        /*
        if value < 128: true
        if value >= 128: false
        */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // Autoboxing
        int i = list.get(0); // Unboxing
        System.out.println(i);
    }
}