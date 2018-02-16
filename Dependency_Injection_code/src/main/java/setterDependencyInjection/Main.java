package setterDependencyInjection;

public class Main {
    public static void main(String[] args) {
        Car turboCar = new Car();
        turboCar.setEngine(new TurboEngine());
        turboCar.turnOn();
        turboCar.changeGear();
        turboCar.turnOff();

        Car normalCar = new Car();
        normalCar.setEngine(new NormalEngine());
        normalCar.turnOn();
        normalCar.changeGear();
        normalCar.turnOff();
    }
}
