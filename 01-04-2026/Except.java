/*
Error - cannot be handled by programmer
Exception - can be handled by programmer
Exception Handling
*/

public class Except {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);

            //the execution of try block is stopped after catching the exception, (line 14 and 15 are not executed), then the finally block is executed.
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero");
        } catch (NullPointerException e) {
            System.out.println("String value is null");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Program executed");
        }
    }
}
