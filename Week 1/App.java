class User{
    String name;
    String role;
    String phone;
    String address;
    User(){
        System.out.println("Parent class constructor");
        name = "Raja";
        phone = "9898989898";
        role = "User";
        address = "Thanjavur"; 
    }
    User(String name, String role, String phone, String address){
        this.name = name;
        this.role = role;
        this.phone = phone;
        this.address = address;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);
        System.out.println("Phone: "+phone);
        System.out.println("Address: "+address);
        System.out.println();
    }
}

class Driver extends User{
    String role = "Driver";
    String vehicle;
    Driver(String name, String vehicle){
        super();
        this.name = name;
        this.vehicle = vehicle;
    }
    void displayDriver(){
        super.display();
        System.out.println("Role: "+role);
        System.out.println("Driving: "+vehicle);
        System.out.println("Role in parent class: "+super.role);
        System.out.println();
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
        u1.display();
        User u = new User("Poppy", "User", "1234567890", "Chennai");
        u.display();
        Driver u2 = new Driver("Pepp","Bus");
        u2.displayDriver();
    }
}