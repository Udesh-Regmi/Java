import model.Car;
import controller.CarController;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarController controller = new CarController();

        try {
            // Adding cars
            controller.createCar("1HGCM82633A004352", "Toyota", "Camry", 2020, 24000);
            controller.createCar("1HGCM82633A004353", "Honda", "Civic", 2021, 22000);

            // Listing all cars
            List<Car> allCars = controller.getAllCars();
            allCars.forEach(System.out::println);

            // Fetch specific car
            Car car = controller.getCar("1HGCM82633A004352");
            System.out.println("Fetched Car: " + car);

            // Updating car
            controller.updateCar("1HGCM82633A004352", "Toyota", "Corolla", 2022, 23000);
            System.out.println("Updated Car: " + controller.getCar("1HGCM82633A004352"));

            // Deleting a car
            controller.deleteCar("1HGCM82633A004353");

            System.out.println("Remaining Cars:");
            controller.getAllCars().forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
