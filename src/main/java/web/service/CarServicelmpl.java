package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServicelmpl implements CarService {
    private List<Car> cars = new ArrayList<>();{
        Car car1 = new Car("bmw", 3, "black");
        Car car2 = new Car("mersedess", 202, "red");
        Car car3 = new Car("vaz", 3, "white");
        Car car4 = new Car("hyondai", 1, "yellow");
        Car car5 = new Car("mazda", 6, "blue");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    public List<Car> getCars(int a) {
        return cars.stream().limit(a).collect(Collectors.toList());
    }
}

