class User{
    String name;
    String role = "User";
    String phone;
    String address;
    User(){
        System.out.println("Parent class constructor");
    }
    User(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Name: "+name);
    }
}

class Driver extends User{
    String role = "Driver";
    String vehicle;
    Driver(String name, String vehicle){
        super(name);
        this.vehicle = vehicle;
    }
    void displayDriver(){
        super.display();
        System.out.println("Role: "+role);
        System.out.println("Driving: "+vehicle);
        System.out.println("Role in parent class: "+super.role);
    }
}

class TravelUser extends User{
    String freqLocation;
}

class FoodUser extends User{
    String favFood;
}

public class App{
    public static void main(String args[]){
        User u1 = new User();
        User u = new User("Poppy");
        u.display();
        Driver u2 = new Driver("Pepp","Bus");
        u2.displayDriver();
    }
}