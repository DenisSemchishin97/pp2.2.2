package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServicelmpl;
import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int a, Model model) {
        List<Car> cars = new ArrayList<>();
        CarServicelmpl carService = new CarServicelmpl();
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
        cars = CarServicelmpl.getCars(cars, a);
        model.addAttribute("cars", cars);
        return "cars";

    }
}