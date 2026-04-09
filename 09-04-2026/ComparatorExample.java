import java.util.*;

/*
Comparator (Sorting logic outside the class)

- int compare(type a, type b) 
    +ve , a comes after b
    -ve , a comes before b
    0 , equal
*/

class Student {
    String name;
    int mark;
    int id;

    Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return id + ") " + name + ": " + mark;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(6, "Teja", 99));
        student.add(new Student(4, "Tojo", 98));
        student.add(new Student(1, "Soja", 100));
        Comparator<Student> byId = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.id - b.id;
            }
        };

        Collections.sort(student, byId);
        System.out.println("Sorted by ID: " + student);

        Collections.sort(student, (a, b) -> a.mark - b.mark);
        System.out.println("Sorted by Mark: " + student);
    }
}
