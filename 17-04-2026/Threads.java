
/*
    Process - program currently running
    Thread - smallest unit of process that performs task

    Single Threading - runs one task at a time
    Multiple Threading - runs multiple parts of a program at the same time

    run() - executes the thread
    start() - creates new thread then calls run()
*/
import java.util.*;

public class Threads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        task1(n);
        task2(n);
        sc.close();
    }

    static void task1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("From Task 1 :" + i);
        }
    }

    static void task2(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("From Task 2 :" + i);
        }
    }
}
