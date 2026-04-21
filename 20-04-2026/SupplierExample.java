import java.util.function.Supplier;
import java.lang.Math;

class Person {
    String name = "Supplier";
}

/*
Supplier -> get()
    does not take any input and produces a value
*/

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100);
        // random - returns a random decimal value between 0 to 1
        System.out.println(s.get());

        Supplier<Person> p = () -> new Person();
        System.err.println(p.get().name);
    }
}
