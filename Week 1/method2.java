
public class method2 {
    static void change(int x) {
        x = 20;
        System.out.println("Inside class: " + x);
    }

    public static void main(String args[]) {
        int x = 50;
        change(x);
        System.out.println("Outside class: " + x);
    }
}