import java.util.*;

public class method {
    static int mul(int a, int b) {
        return a * b;
    }

    static int square(int n){
        return mul(n,n);
    }

    static void print(int n) {
        System.out.println("Square of number: "+square(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        print(num);
        sc.close();
    }
}
