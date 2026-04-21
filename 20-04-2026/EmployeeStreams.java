import java.util.*;

class EmployeeDetails {
    int salary;
    String name;
    String dept;
    int age;

    public EmployeeDetails(String name, int salary, String dept, int age) {
        this.salary = salary;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "[ " + name + ", " + dept + ", " + salary + " ]";
    }

}

public class EmployeeStreams {
    public static void main(String[] args) {
        List<EmployeeDetails> emp = List.of(new EmployeeDetails("Krish", 50000, "Support", 30),
                new EmployeeDetails("Ramu", 45000, "Dev", 27), new EmployeeDetails("Somu", 30000, "HR", 23));

        List<EmployeeDetails> dev = emp.stream().filter((e) -> e.getDept().equals("HR")).toList();
        System.out.println("HR              : " + dev);

        List<EmployeeDetails> greaterSalaryList = emp.stream().filter((e) -> e.salary > 30000).toList();
        System.out.println("Greater Salary  : " + greaterSalaryList.toString());

        int totalSalary = emp.stream().mapToInt((e) -> e.salary).sum();
        System.out.println("Total Salary    : " + totalSalary);

        double avgSalary = emp.stream().mapToInt((e) -> e.salary).average().orElse(0);
        System.out.println("Average Salary  : " + (int) avgSalary);

        long count = emp.stream().count();
        System.out.println("Total Employees : " + count);
    }

}
