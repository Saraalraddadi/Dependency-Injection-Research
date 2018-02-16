package springAnnotations;

import InterfaceDependencyInjection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                CarConfig.class
        );

        Car car = (Car) context.getBean(Car.class);
        car.turnOn();
        car.changeGear();
        car.turnOff();
    }
}
