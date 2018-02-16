package constructorDependencyInjection;

public class Car {
    private  IEngine engine;

    public Car(IEngine engineImplementation){
        this.engine = engineImplementation;
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
