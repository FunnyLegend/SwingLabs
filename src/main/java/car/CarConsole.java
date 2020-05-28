package car;



import org.springframework.stereotype.Component;

import java.io.FileWriter;


@Component
public class CarConsole implements ICar {

    @Override
    public void save(Car car) {
        String result = car.toString() + "\n";
        System.out.println("Car");
    }
}
    