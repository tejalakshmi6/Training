import java.util.List;
import java.util.function.Consumer;

/*
Built-in FunctionalInterface
Consumer -> accept()
    - accepts an input and does something with it
    - returns nothing
*/

class Student {
    int marks;
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printString = (s) -> System.out.println(s);
        printString.accept("Hello World!");

        Consumer<Student> printName = (s) -> System.out.println("Student Name: " + s.name);
        printName.accept(new Student("Raju"));

        List<String> names = List.of("Sabaash", "Seriyana", "Potti");
        names.forEach(name -> System.out.print(name + " "));

        /*
        names.forEach(new Consumer<String>() {
            public void accept(String name) {
                System.out.print(name + " ");
            }
        });
        
        */

        System.out.println();
        // shortcut for lambda function
        names.forEach(System.out::println);
    }
}