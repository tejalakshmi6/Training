@FunctionalInterface
interface Math {
    int add(int a, int b);
    // int sub(int a, int b); FunctionalInterface must only have one method
}

@FunctionalInterface
interface Exercise {
    void sayHello();
}

public class LambdaExample {
    public static void main(String[] args) {
        // same as the implementation of comparator

        Math obj = new Math() { // Anonymous class
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        Math objMath = (a, b) -> { // Lambda function (or Anonymous function)
            System.out.print("Sum of the two numbers is: ");
            return a + b;
        };

        System.out.println(obj.add(11, 22));
        System.out.println(objMath.add(11, 22));

        Exercise voice = () -> System.out.println("Hello Hello!!");
        Exercise e = new Exercise() {
            @Override
            public void sayHello() { // must be public
                System.out.println("Helloo!!");
            }
        };
        e.sayHello();
        voice.sayHello();
    }
}
