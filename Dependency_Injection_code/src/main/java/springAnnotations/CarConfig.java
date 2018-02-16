package springAnnotations;

import InterfaceDependencyInjection.Car;
import InterfaceDependencyInjection.TurboEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    public Car car(){
        Car ans = new Car();
        ans.setEngine(turboEngine());
        return ans;
    }

    @Bean
    public TurboEngine turboEngine(){
        return new TurboEngine();
    }
}
