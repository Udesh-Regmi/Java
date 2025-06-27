package service;

import model.Car;

import java.util.*;

public class CarService {
    private final Map<String, Car> carInventory = new HashMap<>();

    public void addCar(Car car) {
        if (carInventory.containsKey(car.getVin())) {
            throw new IllegalArgumentException("Car with this VIN already exists.");
        }
        carInventory.put(car.getVin(), car);
    }

    public void updateCar(String vin, Car updatedCar) {
        if (!carInventory.containsKey(vin)) {
            throw new NoSuchElementException("Car not found.");
        }
        carInventory.put(vin, updatedCar);
    }

    public void deleteCar(String vin) {
        if (carInventory.remove(vin) == null) {
            throw new NoSuchElementException("Car not found.");
        }
    }

    public Car getCar(String vin) {
        Car car = carInventory.get(vin);
        if (car == null) {
            throw new NoSuchElementException("Car not found.");
        }
        return car;
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(carInventory.values());
    }
}
