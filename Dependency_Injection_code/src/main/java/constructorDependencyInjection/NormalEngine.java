package constructorDependencyInjection;

public class NormalEngine implements IEngine{
    public void turnOn() {
        System.out.println("Normal Engine Turning On");
    }

    public void turnOff() {
        System.out.println("Normal Engine Turning Off");
    }
}
