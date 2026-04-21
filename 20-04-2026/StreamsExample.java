import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return name + ": " + salary;
    }
}

/*
Streams
    - process the sequence of elements (or) data from collections, arrays
    - map
        stream().map(function) -> returns new list based on function
    - filter
        stream().filter(predicate) -> checks condition    
*/

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 4, 5, 6);
        System.out.println("Numbers         : " + nums);

        // reduce - checks condition and returns a single value
        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Numbers  : " + sum);

        // map
        List<Integer> multiplyBy2 = nums.stream().map((i) -> i * 2).toList();
        System.out.println("Multiples of 2  : "+ multiplyBy2);
        
        // filter
        List<Integer> even = nums.stream().filter((i) -> i % 2 == 0).toList();
        System.out.println("Even numbers    : " + even);

        List<Employee> employees = List.of(new Employee("Raja", 50000), new Employee("Raju", 30000),
                new Employee("Rani", 40000));
        List<String> names = employees.stream().map((e) -> e.getName()).toList();
        List<Integer> salaries = employees.stream().map((e) -> e.getSalary()).toList();
        System.out.println("Employees Names : " + names);
        System.out.println("Employees Salary: " + salaries);

        List<Employee> greaterSalary = employees.stream().filter((e) -> e.getSalary() > 30000).toList();
        System.out.println("Greater Salary  : " + greaterSalary.toString());
    }
}
