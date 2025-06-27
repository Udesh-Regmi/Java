package controller;

import model.Car;
import service.CarService;

import java.util.List;

public class CarController {
    private final CarService carService = new CarService();

    public void createCar(String vin, String make, String model, int year, double price) {
        Car car = new Car(vin, make, model, year, price);
        carService.addCar(car);
    }

    public void updateCar(String vin, String make, String model, int year, double price) {
        Car updatedCar = new Car(vin, make, model, year, price);
        carService.updateCar(vin, updatedCar);
    }

    public void deleteCar(String vin) {
        carService.deleteCar(vin);
    }

    public Car getCar(String vin) {
        return carService.getCar(vin);
    }

    public List<Car> getAllCars() {
        return carService.getAllCars();
    }
}
