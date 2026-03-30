abstract class Device {
    abstract void turnOn();
    abstract void turnOff();
    String name;
}

class Light extends Device {
    @Override
    void turnOn() {
        System.out.println("Light is turned ON");
    }
    @Override
    void turnOff() {
        System.out.println("Light is turned OFF");
    }
}

class AC extends Device {
    @Override
    void turnOn() {
        System.out.println("AC is turned ON");
    }
    @Override
    void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

interface Trigger {
    boolean isTriggered(); //checks condition
}

class MotionTrigger implements Trigger {
    @Override
    public boolean isTriggered() {
        System.out.println("Motion Detected.");
        return true;
    }
}
class TempTrigger implements Trigger {
    int temp;
    TempTrigger(int temp) {
        this.temp = temp;
    }
    public boolean isTriggered() {
        return temp > 30;
    }
}
class TimeTrigger implements Trigger {
    int time;
    TimeTrigger(int time) {
        this.time = time;
    }
    public boolean isTriggered() {
        return time > 7;
    }
}

interface Action {
    void execute();
}
class TurnOnAction implements Action {
    Device device;
    TurnOnAction(Device device) { //Aggregation
        this.device = device;
    }
    public void execute() {
        device.turnOn();
    }
}
class TurnOffAction implements Action {
    Device device;
    TurnOffAction(Device device)  {
        this.device = device;
    }
    public void execute() {
        device.turnOff();
    }
}

class Rule{
    Trigger trigger;
    Action action;
    Rule(Trigger trigger, Action action) {
        this.trigger = trigger;
        this.action = action;
    }
    void result(){
        if (trigger.isTriggered()) {
            action.execute(); //proceeds with action
        } else {
            System.out.println("Condition not met.");
        }
    }
}

// Trigger → Rule → Action → Device
public class AutomationSys {
    public static void main(String[] args){
        Device ac = new AC();
        Device light = new Light();

        Trigger tempTrigger = new TempTrigger(35);
        Trigger timeTrigger = new TimeTrigger(8);

        Action turnOnAC = new TurnOnAction(ac);
        Action turnOnLight = new TurnOnAction(light);

        Rule r1 = new Rule(tempTrigger, turnOnAC);
        Rule r2 = new Rule(timeTrigger, turnOnLight);

        r1.result();
        r2.result();
    }
}
