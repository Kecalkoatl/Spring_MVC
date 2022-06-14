package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Black", "V6", 54545));
        carList.add(new Car("Red", "V5", 345435));
        carList.add(new Car("Green", "V2", 423432));
        carList.add(new Car("Blue", "V3", 54645));
        carList.add(new Car("White", "V4", 121234));
    }


    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> carCount(int numberOfCars) {

        List<Car> cars = carList.stream().limit(numberOfCars).collect(Collectors.toList());

        return cars;
    }
}
