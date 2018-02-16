package springXml;

import InterfaceDependencyInjection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Car myCar = (Car) context.getBean("car");
        myCar.turnOn();
        myCar.changeGear();
        myCar.turnOff();
    }
}
