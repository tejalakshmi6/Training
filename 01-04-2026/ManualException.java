class InvalidAgeException extends Exception {
    //extends the built-in Exception class to create a new Exception
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
public class ManualException {
    static void checkAge(int age) throws InvalidAgeException{
        if(age < 18) {
            throw new InvalidAgeException("Age should not be lesser than 18");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            //getMessage() is a built-in fn from throwable class
        }
    }    
}
