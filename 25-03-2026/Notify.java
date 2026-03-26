
class Notification{
    String name;
    String msg;
    Notification(String name, String msg){
        this.name = name;
        this.msg = msg;
    }
    void send(){
        System.out.println("Notification sent.");
    }
    void mute(){
        System.out.println("Notification muted. ");
    }
}

//multilevel inheritance
class Email extends Notification{
    Email(String name, String msg){
        super(name, msg);
    }
    @Override
    void send(){
        System.out.println("Sending Email Notification to "+name);
        System.out.println("Message: "+msg);
    }
    void changeEmail(){
        System.out.println("Receiver Email Changed.");
    }
}

class SMS extends Notification{
    SMS(String name, String msg){
        super(name, msg);
    }
    @Override
    void send(){
        System.out.println("Sending SMS Notification to "+name);
        System.out.println("Message: "+msg);
    }
}

public class Notify {
    public static void main(String args[]){
        Notification n = new Email("Thaslima","Order Confirmed");
        n.send();
        System.out.println();

        /*
        n.changeEmail(); // child class method can be called using parent class
        cannot access this method as it is only defined in child class and not in paret class

        Email e = new Email("Kiwi","Hi Kiwi");
        e.send();
        e.mute(); //parent class method can be called using child class
        e.changeEmail();
        */

        Email e = new Email("Kiwi","Hi Kiwi");
        SMS s = new SMS("Supu", "Call me");
        Notification[] notify = {e,s};
        for(Notification i: notify){
            i.send();
            System.out.println();
        }
    }
}
