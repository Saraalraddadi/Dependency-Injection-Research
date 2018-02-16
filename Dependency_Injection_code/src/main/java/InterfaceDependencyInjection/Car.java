package InterfaceDependencyInjection;

public class Car implements ICar{
    private IEngine engine;

    public Car(){

    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
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
