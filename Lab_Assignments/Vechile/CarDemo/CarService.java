package Lab_Assignments.Vechile.CarDemo;


import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final List<Car> carList = new ArrayList<>();

    public void addCar(int carId, String carName) {
        Car car = new Car(carId, carName);
        carList.add(car);
        System.out.println("Car Added Successfully!");
    }

    public void displayAllCars() {
        if (carList.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            System.out.println("\nList of Cars:");
            for (Car car : carList) {
                System.out.println(car);
            }
        }
    }
}
