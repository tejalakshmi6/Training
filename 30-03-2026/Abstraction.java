//Partial Abstraction - using abstract class
abstract class Device{
    abstract void turnOn();
    abstract void turnOff();
    abstract void setLevel();
    void deviceInfo(){
        System.out.println("It is a Device");
    }
}

class Light extends Device{
    @Override
    void turnOff(){
        System.out.println("Lights Off");
    }
    @Override
    void turnOn(){
        System.out.println("Lights On");
    }
    @Override
    void setLevel(){
        System.out.println("Light uses Low voltage");
    }
}

//every child class inheriting the abstract class must implement all the abstract methods

class AC extends Device{
    @Override
    void turnOff(){
        System.out.println("Lights Off");
    }
    @Override
    void turnOn(){
        System.out.println("Lights On");
    }
    @Override
    void setLevel(){
        System.out.println("Ac uses High voltage");
    }
}

class Fan extends Device{
    @Override
    void turnOff(){
        System.out.println("Lights Off");
    }
    @Override
    void turnOn(){
        System.out.println("Lights On");
    }
    @Override
    void setLevel(){
        System.out.println("Fan uses Low voltage");
    }
}

//Complete Abstraction - usnig Interface 
interface Remote {
    void change(); // by default: methods are public and abstract
}

interface Wifi {
    void connect();
}

//Multiple Inheritance - multiple parent class and single child class
class TV implements Remote, Wifi {
    @Override
    public void change(){
        System.out.println("Channel changed.");
    }
    @Override
    public void connect(){
        System.out.println("Wifi connected.");
    }
}

public class Abstraction {
    public static void main(String[] args){
        
        // Device l = new Device();
        //object cannot be created for abstract class
        
        Device l = new Light();
        l.deviceInfo(); //concrete method
        l.turnOn();
        l.turnOff();

        Device ac = new AC();
        ac.setLevel();
        Device fan = new Fan();
        fan.setLevel();

        Remote r = new TV();
        r.change();

        Wifi w = new TV();
        w.connect();
    }
}
