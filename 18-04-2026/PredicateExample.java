import java.util.function.Predicate;

/*
Built-in FunctionalInterface
Predicate -> test()
    - gets an input
    - returns true or false
*/

class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };
        System.out.println("Number is even: " + isEven.test(30));

        // Lambda functions
        Predicate<Integer> isOdd = (n) -> n % 2 != 0;
        System.out.println("Number is odd: " + isOdd.test(3));

        Predicate<Student> isPass = (s) -> s.marks >= 45;
        System.out.println("Student in pass: " + isPass.test(new Student(60)));
    }
}