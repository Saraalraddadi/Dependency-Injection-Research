package constructorDependencyInjection;

public class TurboEngine implements IEngine{
    public void turnOn() {
        System.out.println("Turbo Engine Turning On");
    }

    public void turnOff() {
        System.out.println("Turbo Engine Turning Off");
    }
}
