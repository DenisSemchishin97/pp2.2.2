package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServicelmpl implements CarService {

    public static List<Car> getCars(List<Car> list, int a) {
        return list.stream().limit(a).collect(Collectors.toList());
    }
}
