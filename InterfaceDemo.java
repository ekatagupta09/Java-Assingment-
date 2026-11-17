interface Switchable {
    void turnOn();
    void turnOff();
}

class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light: The light is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light: The light is OFF.");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: The fan starts rotating.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: The fan stops rotating.");
    }
}

class AirConditioner implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("AC: Cooling started.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC: Cooling stopped.");
    }
}

// Added later: main() does not need to change.
class Television implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("TV: The television is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV: The television is OFF.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Switchable[] devices = {
            new Light(),
            new Fan(),
            new AirConditioner(),
            new Television()
        };

        for (Switchable device : devices) {
            device.turnOn();
            device.turnOff();
            System.out.println();
        }
    }
}
