package naiveImplementation;

public class Car {
    private TurboEngine engine;

    public Car() {
        engine = new TurboEngine();
    }

    public void turnOn(){
        engine.turnOn();
    }

    public void turnOff(){
        engine.turnOff();
    }

    public void changeGear(){
        System.out.println("Gear has changed");
    }
}
