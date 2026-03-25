//Multiple Booking Platform

class AppUser{
    String name;
    String phone;
    String location;
    AppUser(){
        name = "Chinna";
        phone = "9876504321";
        location = "Chennai";
    }
    AppUser(String name, String phone, String location){
        this.name = name;
        this.phone = phone;
        this.location = location;
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
        System.out.println("Location: "+location);
    }
}

class RideUser extends AppUser{
    String vehicleType;
    RideUser(String name, String phone, String location, String vehicleType){
        super(name, phone, location);
        this.vehicleType = vehicleType;
    }
    void displayRide(){
        System.out.println("Riding: "+vehicleType);
        System.out.println();
    }
}

class FoodDelUser extends AppUser{
    String favFood;
    FoodDelUser(String favFood){
        super();
        this.favFood = favFood;
    }
    FoodDelUser(String name, String phone, String location, String favFood){
        super(name, phone, location);
        this.favFood = favFood;
    }
    void displayFood(){
        System.out.println("Favourite Food: "+favFood);
        System.out.println();
    }
}

class ParcelUser extends AppUser{
    String parcelWeight;
    ParcelUser(){
        super();
        parcelWeight = "100 g";
    }
    ParcelUser(String weight){
        super();
        this.parcelWeight = weight;
    }
    void displayParcel(){
        System.out.println("Parcel Weight: "+parcelWeight);
        System.out.println();
    }
}

class Booking{
    public static void main(String[] args){
        System.out.println("[ Ride User Details ]");
        RideUser ru = new RideUser("Sanu", "8989889898","Nilgiris","Bike");
        ru.displayInfo();
        ru.displayRide();
        System.out.println("[ Food User Details ]");
        FoodDelUser u = new FoodDelUser("Fried Rice");
        u.displayInfo();
        u.displayFood();
        System.out.println("[ Parcel User Details ]");
        ParcelUser pu = new ParcelUser(); //default constructor
        pu.displayInfo();
        pu.displayParcel();
    }
}