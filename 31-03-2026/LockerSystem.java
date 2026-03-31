class Locker{
    private int lockerId;
    private int pin;
    private String item;
    private boolean isLocked;
    Locker(int id, int pin) {
        this.lockerId = id;
        this.pin = pin;
        item = "";
        isLocked = false;
    }

    void lock() {
        isLocked = true;
        System.out.println("Locker "+lockerId+" Locked");
    }
    void unlock(int pin) {
        if (this.pin == pin){
            isLocked = false;
            System.out.println("Locker "+lockerId+" Unlocked");
        } else {
            System.out.println("Invalid Pin. Cannot Unlock locker "+lockerId);
        }
    }

    void store(String item, int pin) {
        unlock(pin);
        if (this.pin == pin){
            this.item = item;
            System.out.println(item+" stored successfully in locker "+lockerId);
        } else {
            System.out.println("Invalid pin.");
        }
    }
    void retrieve(int pin) {
        if (this.pin == pin && !isLocked && item != null) {
            System.out.println(item+" is retrieved from locker "+lockerId);
            item = null;
        } else if (isLocked) {
            System.out.println("Locker "+lockerId+" is locked.");
        } else if (item == null) {
            System.out.println("Locker empty.");
        } else {
            System.out.println("Invalid pin.");
        }
    }
}

public class LockerSystem {
    public static void main(String[] args) {
        Locker l1 = new Locker(1, 1234);
        l1.store("Apple", 1234);
        l1.lock();
        l1.retrieve(1234);
        l1.unlock(1234);
        l1.retrieve(1211);
        l1.retrieve(1234);
        l1.lock();
        System.out.println();
        Locker l2 = new Locker(2, 1212);
        l2.store("Diamond", 1212);
        l2.lock();
        l2.unlock(1234);
        l2.retrieve(1212);
        l2.unlock(1212);
        l2.retrieve(1212);
        l2.retrieve(1212);
    }
}
