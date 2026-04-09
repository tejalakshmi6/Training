import java.util.*;
/*
Comparable Interface (Sorting logic inside the class)
- Natural ordering, default way of sorting

- int compareTo()
    Returns 0 → objects are equal
    Returns positive → current object is greater
    Returns negative → current object is smaller

- java calls compareTo() automatically when Collections.sort() is used
*/

class Student implements Comparable<Student> {
    String name;
    int mark;
    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student s) {
        //return this.mark - s.mark; // ascending
        return s.mark - this.mark; // descending
    }

    @Override
    public String toString() {
        return name+" - "+mark;
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Teja", 99));
        student.add(new Student("Tojo", 98));
        student.add(new Student("Soja", 100));
        Collections.sort(student); // calls compareTo()
        /*
        ASCENDING
        Teja.compareTo(Tojo) --> 99-98 = +1, Tojo < Teja
        Tojo.compareTo(Soja) --> 98-100 = -2, Tojo < Teja < Soja
        Soja.compareTo(Teja) --> 100-99 = +1, Tojo < Teja < Soja
        */
        System.out.println(student); // calls toString()
    }
}
