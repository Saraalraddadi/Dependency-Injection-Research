package constructorDependencyInjection;

public class Main {
    public static void main(String[] args) {
        Car turboCar = new Car(new TurboEngine());
        turboCar.turnOn();
        turboCar.changeGear();
        turboCar.turnOff();

        Car normalCar = new Car(new NormalEngine());
        normalCar.turnOn();
        normalCar.changeGear();
        normalCar.turnOff();
    }
}
