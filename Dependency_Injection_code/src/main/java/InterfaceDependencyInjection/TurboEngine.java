package InterfaceDependencyInjection;

public class TurboEngine implements IEngine {

    public TurboEngine() {
    }

    public void turnOn() {
        System.out.println("Turbo Engine Turning On");
    }

    public void turnOff() {
        System.out.println("Turbo Engine Turning Off");
    }
}
